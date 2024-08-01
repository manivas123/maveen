package org.green;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class ReadValue extends BaseClass {
	

public static void main(String[] args) throws IOException, InterruptedException {
	
	ReadValue value=new ReadValue();
	value.booking();
}
public void booking() throws IOException, InterruptedException {
	
	broswserSetup();
     launch("https://www.omrbranch.com/");  
	maximize();
	implicitWait();
	
	WebElement id = locatorbyid("email");
   elementSendKeys(id, getCellData("mani", 1, 0));
	
	WebElement locatorbyid = locatorbyid("pass");
	elementSendKeys(locatorbyid, getCellData("mani", 1, 1));
	
	WebElement xpath = locatorByXpath("//button[text()='Login']");
	xpath.click();
	
	
	WebElement locatorByXpath2 = locatorByXpath("//a[@data-testid='username']");
	String text = locatorByXpath2.getText();
	System.out.println(text);
	WebElement locatorByXpath = locatorByXpath("//input[@name='search']");
	elementSendKeys(locatorByXpath, getCellData("mani", 1, 2));
	WebElement locatorByXpath3 = locatorByXpath("//button[@data-testid='searchbtn']");
	locatorByXpath3.click();
	locatorByXpath("(//a[text()='Add'])[1]").click();
	locatorByXpath("(//button[text()='Add'])[1]").click();
	Thread.sleep(3000);
	locatorByXpath("//a[text()=' Go To Cart ']").click();
	WebElement locatorByXpath4 = locatorByXpath("//h5[text()='My Cart']");
	String text2 = locatorByXpath4.getText();
	System.out.println(text2);
	
	WebElement locatorByXpath5 = locatorByXpath("//div[text()='Delivery Address']");
	String text3 = locatorByXpath5.getText();
	System.out.println(text3);
	locatorByXpath("//div[@data-toggle='modal']").click();
	WebElement locatorByXpath6 = locatorByXpath("//select[@name='address_type']");
	elementDdnIndex(locatorByXpath6, 2);
	
	WebElement locatorByXpath7 = locatorByXpath("(//input[@name='first_name'])[1]");
	elementSendKeys(locatorByXpath7,getCellData("mani", 1, 3));
	WebElement locatorByXpath8 = locatorByXpath("//input[@placeholder='Last name*']");
	elementSendKeys(locatorByXpath8, getCellData("mani", 1, 4));
	WebElement locatorByXpath9 = locatorByXpath("//input[@placeholder='Contact No*']");
	elementSendKeys(locatorByXpath9, getCellData("mani", 1, 5));
	WebElement locatorByXpath10 = locatorByXpath("//input[@placeholder='House No*']");
	elementSendKeys(locatorByXpath10, getCellData("mani", 1, 6));
	WebElement locatorByXpath11 = locatorByXpath("//input[@placeholder='Address*']");
	elementSendKeys(locatorByXpath11, getCellData("mani", 1, 7));

	WebElement locatorByXpath12 = locatorByXpath("//select[@name='country']");
	elementDdnIndex(locatorByXpath12, 1);
	WebElement locatorByXpath13 = locatorByXpath("//select[@name='state']");
	elementDdnIndex(locatorByXpath13, 35);
	WebElement locatorByXpath14 = locatorByXpath("//select[@name='city']");
	elementDdnText(locatorByXpath14, "Karur");
	WebElement locatorByXpath22 = locatorByXpath("//input[@name='zipcode']");
	elementSendKeys(locatorByXpath22, getCellData("mani", 1, 8));
    locatorByXpath("(//button[@type='submit'])[3]").click();
	Thread.sleep(3000);
	
    WebElement locatorByXpath15 = locatorByXpath("(//div[@class='font20 fontSemiBold color20 mb-4'])[1]") ;
    String text4 = locatorByXpath15.getText();
	System.out.println(text4);
	pagescrolldown(locatorByXpath15);
	
	Thread.sleep(3000);
	WebElement locatorByXpath16 = locatorByXpath("//select[@id='payment_type']");
	elementDdnIndex(locatorByXpath16, 1);
	locatorByXpath("//label[text()=' Visa ']").click();
	
	WebElement locatorByXpath17 = locatorByXpath("(//input[@type='text'])[3]");
	elementSendKeys(locatorByXpath17, getCellData("mani", 1, 9));
	
	WebElement locatorByXpath18 = locatorByXpath("(//select[@class='form-control'])[1]");
	elementDdnIndex(locatorByXpath18, 5);
	
	
	WebElement locatorByXpath19 = locatorByXpath("(//select[@class='form-control'])[2]");
	elementDdnIndex(locatorByXpath19, 3);
	
	WebElement locatorByXpath20 = locatorByXpath("(//input[@class='form-control'])[2]");
	elementSendKeys(locatorByXpath20, getCellData("mani", 1, 10));
	
	
	WebElement locatorByXpath21 = locatorByXpath("//button[@id='placeOrder']");
	locatorByXpath21.click();
	String text5 = locatorByXpath21.getText();
	System.out.println(text5);
	
	
	
	
}
	
	
	
	
	
}
