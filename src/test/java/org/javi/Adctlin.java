package org.javi;

import java.time.Duration;

import org.green.BaseClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Adctlin extends BaseClass{

      static WebDriver driver;
		@BeforeClass
      public static void beforeClass() {

			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/");
	
		}
      @Before
      public void before() {
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

	}
      
		@AfterClass
		public static void afterClass() {

//			driver.close();
			
		}
		
		@Test
		public void test() throws InterruptedException {
      driver.findElement(By.id("username")).sendKeys("manivasa");
	driver.findElement(By.id("password")).sendKeys("56D78I");
      driver.findElement(By.id("login")).click();
      
		WebElement element = driver.findElement(By.id("location"));
		elementDdnIndex(element, 2);
			
		WebElement element2 = driver.findElement(By.id("hotels"));
		elementDdnIndex(element2, 3);
		
		WebElement element3 = driver.findElement(By.id("room_type"));
		elementDdnIndex(element3, 2);
		
		
		WebElement element4 = driver.findElement(By.id("room_nos"));
		elementDdnIndex(element4, 3);
		
		driver.findElement(By.id("datepick_in")).sendKeys("30/04/2024");
		driver.findElement(By.id("datepick_out")).sendKeys("01/05/2024");
		
		Thread.sleep(3000);
		WebElement element5 = driver.findElement(By.id("adult_room"));
		elementDdnIndex(element5, 3);
		
		WebElement element6 = driver.findElement(By.id("child_room"));
		elementDdnIndex(element6, 3);
			
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		
		driver.findElement(By.id("first_name")).sendKeys("manivasagam")	;
		driver.findElement(By.id("last_name")).sendKeys("vasaga");
		driver.findElement(By.id("address")).sendKeys("karur");
		driver.findElement(By.id("cc_num")).sendKeys("5555555555552222");
		WebElement element7 = driver.findElement(By.id("cc_type"));
		elementDdnIndex(element7, 1);
		WebElement element8 = driver.findElement(By.id("cc_exp_month"));
		elementDdnIndex(element8, 2);
		WebElement element9 = driver.findElement(By.id("cc_exp_year"));
		elementDdnIndex(element9, 14);
		driver.findElement(By.id("cc_cvv")).sendKeys("222");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("my_itinerary")).click();
		WebElement element10 = driver.findElement(By.id("order_id_1237308"));
		String text = element10.getText();
		System.out.println(text);
		
		
		
		
		
		
	}
		
		
		
		}
