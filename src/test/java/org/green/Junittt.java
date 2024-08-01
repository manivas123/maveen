package org.green;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittt {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://omrbranch.com/");
	}
	
	@Before
	public void before() throws IOException {
		TakesScreenshot shot= (TakesScreenshot)   driver;
		File screenshotAs = shot.getScreenshotAs(OutputType.FILE);
		File file=new File("Mavennn\\ScreenShot.png");
       FileUtils.copyFile(screenshotAs, file);
	}
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys("manivasgam29@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Manivas69*");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
       
		Thread.sleep(3000);
	}
	@After
	public void after() throws IOException {
		TakesScreenshot shot= (TakesScreenshot)   driver;
		File screenshotAs = shot.getScreenshotAs(OutputType.FILE);
		File file=new File("Mavennn\\ScreenSh.png");
       FileUtils.copyFile(screenshotAs, file);
	}
	@AfterClass
	public static void afterClass() {

		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
}
