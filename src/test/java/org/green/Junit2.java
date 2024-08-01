package org.green;

import java.time.Duration;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.wipro.LoginPage;

public class Junit2 extends BaseClass {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://omrbranch.com/");
	}
	@Test
	public void test() throws InterruptedException {
		LoginPage test1=new LoginPage();
	
	}
		

}
