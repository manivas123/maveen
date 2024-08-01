package org.green;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OmrBranch64 {
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
		
		driver.findElement(By.xpath("//label[@for='value_ndesc']")).click();
			
//		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(3000);
		List<String> dev=new ArrayList<String>();
		List<WebElement> dev1 = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']/h5"));
		
		for (int i = 0; i < dev1.size(); i++) {
			String text2 = dev1.get(i).getText();
			dev.add(text2);
			
		}
		System.out.println(dev);
		List<String> qa=new ArrayList<String>();
		qa.addAll(dev);
		
		
		Collections.sort(qa);
		Collections.reverse(qa);
		System.out.println(qa);	
			
		boolean equals = qa.equals(dev);
		System.out.println(equals);
			if (equals) {
				System.out.println("order correct");
			} else {
           System.out.println("not correct");
			}
}			
}
