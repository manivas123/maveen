package org.green;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrBranch2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		
        driver.findElement(By.id("email")).sendKeys("manivasgam29@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Manivas69*");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("searchBtn")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		 String text = driver.findElement(By.xpath("//div[text()='Please select state']")).getText();
		System.out.println(text);
		
		
		 String text2 = driver.findElement(By.id("invalid-check_out")).getText();
			System.out.println(text2);
			
			 String text3 = driver.findElement(By.id("invalid-no_rooms")).getText();
				System.out.println(text3);
				
				 String text4 = driver.findElement(By.id("invalid-no_adults")).getText();
					System.out.println(text4);
							
								
			
}
}