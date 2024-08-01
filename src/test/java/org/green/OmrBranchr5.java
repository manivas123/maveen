
package org.green;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OmrBranchr5 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		
		
		driver.findElement(By.id("email")).sendKeys("manivasgam29@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Manivas69*");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]")).getText();
		System.out.println(text);

		WebElement element3 = driver.findElement(By.id("state"));
		Select selc = new Select(element3);
		selc.selectByVisibleText("Tamil Nadu");

		Thread.sleep(3000);

		WebElement element4 = driver.findElement(By.id("city"));
		Select sel = new Select(element4);
		sel.selectByVisibleText("Chennai");

		WebElement element5 = driver.findElement(By.id("room_type"));
		Select select = new Select(element5);
		select.selectByVisibleText("Standard");
		select.selectByVisibleText("Deluxe");
		select.selectByVisibleText("Suite");
		select.selectByVisibleText("Luxury");
		select.selectByVisibleText("Studio");

		JavascriptExecutor javasc=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//input[@name='check_in']"));
	   javasc.executeScript("arguments[0].setAttribute('value','2024-05-23')", element);
	     
	   WebElement element2 = driver.findElement(By.xpath("//input[@name='check_out']"));
	   javasc.executeScript("arguments[0].setAttribute('value','2024-06-23')", element2);


		WebElement elemen = driver.findElement(By.id("no_rooms"));
		Select save = new Select(elemen);
		save.selectByVisibleText("1-One");

		WebElement element6 = driver.findElement(By.id("no_adults"));
		Select sav = new Select(element6);
		sav.selectByVisibleText("1-One");

		driver.findElement(By.id("no_child")).sendKeys("2");
		driver.switchTo().frame(0);
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
	  System.out.println(driver.findElement(By.xpath("(//div[@class='col-md-5 hotel-suites']//h5)[1]")).getText());

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Continue'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
       Thread.sleep(3000);
		WebElement elem = driver.findElement(By.id("user_title"));
		Select savage = new Select(elem);
		savage.selectByVisibleText("Mr.");
		
		driver.findElement(By.id("first_name")).sendKeys("manivasagam");
		driver.findElement(By.id("last_name")).sendKeys("mani");
		driver.findElement(By.id("user_phone")).sendKeys("91233456677");
		driver.findElement(By.id("user_email")).sendKeys("manivasagam@gmail.com");
		driver.findElement(By.id("gst")).click();
		
		
		driver.findElement(By.id("gst_registration")).sendKeys("9043592058");
		driver.findElement(By.id("company_name")).sendKeys("Greens Tech OMR Branch");
		driver.findElement(By.id("company_address")).sendKeys("Thoraipakkam");
		driver.findElement(By.id("step1next")).click();
		
		
		driver.findElement(By.xpath("(//input[@type='Checkbox'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[@class='col-md-4'])[3]")).click();
		
		
		driver.findElement(By.id("submitBtn")).click();
		
		 String text1 = driver.findElement(By.id("invalid-card_type")).getText();
			System.out.println(text1);
			
			 String text2 = driver.findElement(By.id("invalid-card_no")).getText();
				System.out.println(text2);
		
			 String text3 = driver.findElement(By.id("invalid-card_name")).getText();
				System.out.println(text3);
		
				 String text4 = driver.findElement(By.id("invalid-card_month")).getText();
					System.out.println(text4);
		
				 String text5 = driver.findElement(By.id("invalid-cvv")).getText();
					System.out.println(text5);
	}		
}
