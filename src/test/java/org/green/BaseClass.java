package org.green;



	import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

import java.text.SimpleDateFormat;
import java.time.Duration;
	import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class BaseClass {
		protected static WebDriver driver;

		public static void broswserSetup() {
      
		driver=new ChromeDriver();
	}	
		
		
		public String getprojectpath() {
			
			return System.getenv("user.div");
			
			}
			
			public String getpropetyFile(String key) throws FileNotFoundException, IOException {
			Properties pro=new Properties();
			pro.load(new FileInputStream(getprojectpath()+""));
			Object object=pro.get(key);
			String value=(String)object;
			return value;
			}
			
			public void lanchBrowser(String browserType) {
	          switch (browserType) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "ie":
				driver=new InternetExplorerDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
				
			case "firebfox":	
				driver=new FirefoxDriver();
				break;
				
			default:
				break;
			}
			}	
				
				
				
		
		// 1. Enter the url
		public static void launch(String url) {
			driver.get(url);
		}

		// 2. Maximize the window
		public static void maximize() {
			driver.manage().window().maximize();
		}

		// 3. Insert value in text box
		public void elementSendKeys(WebElement element, String data) {
			explicitWait(element);
			boolean isenabled = isenabled(element);
			boolean isdisplayed = isdisplayed(element);
			if (isenabled && isdisplayed) {
				element.sendKeys(data);
			}

		}

		// 4. Element click
		public void elementClick(WebElement element) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			boolean isenabled = isenabled(element);
			if (isdisplayed && isenabled) {
				element.click();
			}

		}

		// 5. Click OK in alert
		public void alertaccept() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		// 6. Click cancel in alert
		public void alertDismiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}

		// 7. Get the text from web page
		public String elementGetText(WebElement element) {
			String text = null;
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				text = element.getText();
			}

			return text;

		}

		// 8. Get the inserted value from the text box
		public String elementGetAttribute(WebElement element, String data) {
			explicitWait(element);
			String value = null;
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				String attribute = element.getAttribute(data);
			}
			return value;
		}

		// 9.Close all windows
		public void closeAll() {
			driver.quit();
		}

		// 10. Close current window
		public void closeCurrent() {
			driver.close();
		}

		// 11. Get the title
		public String getTheTitle() {
			String title = driver.getTitle();
			return title;
		}

		// 12. Get the current url
		public String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}

		// 13. Select drop down using text
		public void elementDdnText(WebElement element, String data) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Select select = new Select(element);
				select.selectByVisibleText(data);
			}
		}

		// 14. Select drop down using attribute
		public void elementDdnAtrribute(WebElement element, String data) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Select select = new Select(element);
				select.selectByValue(data);
			}
		}

		// 15. Select drop down using index
		public void elementDdnIndex(WebElement element, int index) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Select select = new Select(element);
				select.selectByIndex(index);
			}
		}

		// 16. Insert value in text box using Java script
		public void elementSendkeysJs(WebElement element, String data) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAtrribue('value','" + data + "')", element);
			}
		}

		// 17. Click button using Java script
		public void elementClickJs(WebElement element) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", element);
			}
		}

		// 18. Launch the browser
		public void browserLaunch() {
			WebDriver driver = new ChromeDriver();
		}

		// 19. Switch to child window
		public void childWindow() {
			String windowHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			for (String string : windowHandles) {
				if (!windowHandle.equals(string)) {
					driver.switchTo().window(string);
				}
			}
		}

		// 20. Switch to frame by index
		public void frameSwitchByIndex(int data) {
			driver.switchTo().frame(data);
		}

		// 21. Switch to frame by frame id /frame element
		public void frameSwitchByElement(WebElement elemant) {
			explicitWait(elemant);
			boolean isdisplayed = isdisplayed(elemant);
			if (isdisplayed) {
				driver.switchTo().frame(elemant);
			}
		}

		// 22. Find locator by id
		public WebElement locatorbyid(String data) {
			WebElement element = driver.findElement(By.id(data));
			return element;
		}

		// 23. Find locator by name
		public WebElement locatorbyname(String data) {
			WebElement element = driver.findElement(By.name(data));
			return element;
		}

		// 24. Find locator by Class name
		public WebElement locatorByClassName(String data) {
			WebElement element = driver.findElement(By.className(data));
			return element;
		}

		// 25. Find locator by X path
		public WebElement locatorByXpath(String data) {
			WebElement element = driver.findElement(By.xpath(data));
			return element;
		}

		// 26. Get all options from drop down as text
		public List<String> elementDdnText(WebElement element) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			List<String> allOptions = new ArrayList<>();
			if (isdisplayed) {
				Select select = new Select(element);
				List<WebElement> options = select.getOptions();
				for (WebElement webElement : options) {
					String text = webElement.getText();
					allOptions.add(text);
				}
			}
			return allOptions;
		}

		// 27. Get all options from drop down as attribute
		public List<String> elementDdnAttribute(WebElement element, String data) {
			explicitWait(element);
			List<String> allOptions = new ArrayList<>();
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Select select = new Select(element);
				List<WebElement> options = select.getOptions();
				for (WebElement webElement : options) {
					String attribute = webElement.getAttribute(data);
					allOptions.add(attribute);
				}
			}
			return allOptions;
		}

		// 28. Get the first selected option in drop down as text
		public String elementDdnFirstSelectedOption(WebElement element) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			String value = null;
			if (isdisplayed) {
				Select select = new Select(element);
				WebElement firstSelectedOption = select.getFirstSelectedOption();
				String text = firstSelectedOption.getText();
			}
			return value;

		}

		// 29. Verify in drop down is multiple or not
		public boolean isMultiple(WebElement element) {
			explicitWait(element);
			Select select = new Select(element);
			boolean multiple = select.isMultiple();
			return multiple;
		}

		// 30. Implicit Wait
		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}

		public void implicitWait(int sec) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		}

		// 31. Explicit wait for visibility of
		public void explicitWait(WebElement element) {
			WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
			driverWait.until(ExpectedConditions.visibilityOf(element));
		}

		public void explicitWait(WebElement element, int sec) {
			WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			driverWait.until(ExpectedConditions.visibilityOf(element));
		}

		// 32. Fluent Wait

		// 33. Verify isDisplayed
		public boolean isdisplayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			return displayed;
		}

		// 34. Verify isEnabled
		public boolean isenabled(WebElement element) {
			boolean enabled = element.isEnabled();
			return enabled;
		}

		// 35. Verify isSeleceted
		public boolean isselected(WebElement element) {
			boolean selected = element.isSelected();
			return selected;
		}

		// 36. Deselect by index
		public void deselectByIndex(WebElement element, int data) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Select select = new Select(element);
				select.deselectByIndex(data);
			}
		}

		// 37. Deselect by attribute
		public void deselectByAttribute(WebElement element, String data) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Select select = new Select(element);
				select.deselectByValue(data);
			}
		}

		// 38. Deselect by text
		public void deselectByVisibleText(WebElement element, String data) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Select select = new Select(element);
				select.deselectByVisibleText(data);
			}
		}

		// 39. Deselect All
		public void deselectAll(WebElement element) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Select select = new Select(element);
				select.deselectAll();
			}
		}

		// 40. Get the parent Window
		public String parentWindow() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
		}

		// 41. Get all Windows
		public Set<String> allWindows() {
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
		}

		// 42. Clear text box
		public void clearText(WebElement element) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				element.clear();
			}
		}

		// 43. Take Screenshot
		public File takescreenshot() {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			return screenshotAs;
		}

		// 44. Take Screenshot for element
		public File takescreenshotforelement(WebElement element) {
			File screenshotAs = element.getScreenshotAs(OutputType.FILE);
			return screenshotAs;
		}

		// 45. Mouse over action
		public void mouseOver(WebElement element) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Actions actions = new Actions(driver);
				actions.moveToElement(element).perform();
			}
		}

		// 46. Drag and drop
		public void draganddrop(WebElement srcElement, WebElement destElement) {
			explicitWait(destElement);
			boolean isdisplayed = isdisplayed(destElement);
			if (isdisplayed) {
				Actions actions = new Actions(driver);
				actions.dragAndDrop(srcElement, destElement).perform();
			}
		}

		// 47. Right Click
		public void rightClick(WebElement element) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Actions actions = new Actions(driver);
				actions.contextClick(element).perform();
			}
		}

		// 48. Double Click
		public void doubleClick(WebElement element) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				Actions actions = new Actions(driver);
				actions.doubleClick(element).perform();
			}
		}

		// 49. Insert value in text box and enter
		public void insertandEnter(WebElement element, String data) {
			explicitWait(element);
			boolean isdisplayed = isdisplayed(element);
			if (isdisplayed) {
				element.sendKeys(data, Keys.ENTER);
			}
		}

		// 50. Refresh page
		public void refreshPage() {
			driver.navigate().refresh();
		}

		//51.updagteCellValue
		private void upDateCellValue(URI url,String name,int row,int cell,String olddata,String newdata) throws IOException {
        
			File file=new File(url);
			FileInputStream stream=new FileInputStream(file);
			Workbook book=new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(name);
			Row row2 = sheet.getRow(row);
			Cell cell2 = row2.getCell(cell);
			
			String value = cell2.getStringCellValue();
			if (value.equals(olddata)) {
				cell2.setCellValue(newdata);
			}
			FileOutputStream Stream=new FileOutputStream(file);
			book.write(Stream);
			
		}
		//52.createcelland setdata
		private void createcellAndSetData(String url,String sheet,int row,int cell,String value) throws InvalidFormatException, IOException {
			File file=new File(url);
			Workbook book=new XSSFWorkbook(file);
			Sheet sheet2 = book.createSheet(sheet);
			Row row2 = sheet2.createRow(row);
			Cell cell2 = row2.createCell(cell);
			cell2.setCellValue(value);
			
			OutputStream st=new FileOutputStream(file);
			book.write(st);
		}
		
		
		
		
		
	
		
		
		
		
	
		
		
	// 51. To print the particular value in the cell
	public String getCellData(String sheetName, int rowIndex, int 
			columnindex) throws IOException {
			 File file = new File("C:\\Users\\SCLPT 059\\eclipse-workspace\\Mavennn\\Excel\\readVaue.xlsx");
			
			 FileInputStream fis = new FileInputStream(file);
			 Workbook book = new XSSFWorkbook(fis);
			 Sheet sheet = book.getSheet(sheetName);
			 Row row = sheet.getRow(rowIndex);
			 Cell cell = row.getCell(columnindex);
			 CellType type = cell.getCellType();
			 String res = null;
			 switch (type) {
			 case STRING:
			 res = cell.getStringCellValue();
			 break;
			 case NUMERIC:
			 if (DateUtil.isCellDateFormatted(cell)) {
			 Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new 
			SimpleDateFormat("dd-MM-yy");
			 res = dateFormat.format(dateCellValue);
			 } else {
			 double numericCellValue = 
			cell.getNumericCellValue();
			 long round = Math.round(numericCellValue);
			if (round == numericCellValue) {
			 res = String.valueOf(round);
			 } else {
			 res = String.valueOf(numericCellValue);
			 }
			 }
			 break;
			 default:
			 break;
			 }
			 return res;
			}
			// 52. Create a row and create one cell and set cell value
			public void setOneCellValue(String sheetName, int rowIndex, int 
			columnIndex, String cellValue) throws IOException {
			 File file = new File(cellValue);
			 FileInputStream fis = new FileInputStream(file);
			 Workbook book = new XSSFWorkbook(fis);
			 Sheet sheet = book.getSheet(sheetName);
			 Row row = sheet.createRow(rowIndex);
			 Cell cell = row.createCell(columnIndex);
			 cell.setCellValue(cellValue);
			 FileOutputStream fos = new FileOutputStream(file);
			 book.write(fos);
			 book.close();
			}
			// 53. Create multiple row and multiple cell and set value
			public void multipleCellValue(String path, String sheetName, int rowSize, 
			int cellSize, List<String> inputList)
			 throws IOException {
			 File file = new File(path);
			 FileInputStream fis = new FileInputStream(file);
			 Workbook book = new XSSFWorkbook(fis);
			 Sheet sheet = book.getSheet(path);
			 for (int i = 0; i < rowSize; i++) {
			 for (int j = 0; j < cellSize; j++) {
			 Row row = sheet.createRow(i);
			Cell cell = row.createCell(j);
			String string = inputList.get(i);
			cell.setCellValue(string);
			 }
			 }
			 FileOutputStream fos = new FileOutputStream(file);
			 book.write(fos);
			 book.close();
			}
			// 54. Scroll DOwn
			public void pagescrolldown(WebElement element) {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].scrollIntoView(true)", element);
			}
			// 55. Sleep
			public void sleep() throws InterruptedException {
			 Thread.sleep(3000);
			}
			// 56.Clear cart
			public void clearCart(String cart,String products) {
			 WebElement cartLogo = locatorByXpath(cart);
			 elementClick(cartLogo);
			 List<WebElement> cancelButton = 
			driver.findElements(By.xpath(products));
			 for (WebElement webElement : cancelButton) {
			 webElement.click();
			 WebElement cartLogo1 = locatorByXpath(cart);
			 elementClick(cartLogo1);
			 }
			 
			}
			}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

