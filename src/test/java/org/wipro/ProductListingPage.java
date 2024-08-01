package org.wipro;

import org.green.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage extends BaseClass{

	private void product() {
PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(xpath = "//button[@data-testid='searchbtn']")
	private WebElement add;
	
	@FindBy(xpath = "(//a[text()='Add'])[1]")
	private WebElement addd;
	
	@FindBy(xpath = "(//button[text()='Add'])[1]")
	private WebElement adddd;

	public WebElement getAdd() {
		return add;
	}

	public WebElement getAddd() {
		return addd;
	}

	public WebElement getAdddd() {
		return adddd;
	}
	public void search() {
    elementClickJs(add);
    elementClick(addd);	
	elementClick(adddd);	
		
		
	}
	
}
