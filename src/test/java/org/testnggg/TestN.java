package org.testnggg;


import org.green.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.wipro.LoginPage;

public class TestN extends BaseClass{

	@BeforeClass
	private void berforecl() {
		broswserSetup();
		launch("https://adactinhotelapp.com/");
		maximize();
        implicitWait();
	}
	@BeforeMethod
	private void beforemethod() {

		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}
	@AfterMethod
	private void aftermethord() {

		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
		
	}
	
	@AfterClass
	private void afterclass() {

		driver.close();	
	}
	@Parameters({"username","password"})
	@Test
	private void test(String username,String password ) {
     LoginPage page=new LoginPage();
		page.login("username", "password");
		
		
	}
	
	
	
	
	
	
}
