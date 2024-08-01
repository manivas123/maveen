package org.wipro;

import org.green.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage extends BaseClass {
	
private void mycart() {
PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//a[text()=' Go To Cart ']")
	private WebElement Clik;
	
	@FindBy(xpath = "//h5[text()='My Cart']")
	private WebElement Car;

	
	@FindBy(xpath="//div[text()='Delivery Address']")
	private WebElement Ca;

	
	@FindBy(xpath="//div[@data-toggle='modal']")
	private WebElement Cli;

	@FindBy(xpath = "//select[@name='address_type']")
	private WebElement tex;
	
	@FindBy(xpath = "//input[@name='first_name'])[1]")
			private WebElement first;

		@FindBy(xpath ="//input[@placeholder='Last name*']")
		private WebElement last;

	
		@FindBy	(xpath ="//input[@placeholder='Contact No*']")
		private WebElement contest;

	@FindBy(xpath="//input[@placeholder='House No*']")
	private WebElement house;
	
	
	@FindBy(xpath = "//input[@placeholder='Address*']")
	private WebElement Address;

	
	 @FindBy(xpath = "//select[@name='country']")
		private WebElement name;

	@FindBy(xpath = "//select[@name='state']")
	private WebElement state;

	@FindBy(xpath = "//select[@name='city']")
	private WebElement city;

	@FindBy(xpath = "//input[@name='zipcode']")
	private WebElement zipcode;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement click1;

    @FindBy(xpath = "(//div[@class='font20 fontSemiBold color20 mb-4'])[1]") 
	private WebElement text1;

	@FindBy(xpath = "//select[@id='payment_type']")
	
	private WebElement type;

	@FindBy(xpath = "//label[text()=' Visa ']")
	private WebElement click2;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement textt;

	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	private WebElement congt;

	@FindBy(xpath = "(//select[@class='form-control'])[2]")
	private WebElement form;

	public WebElement getClik() {
		return Clik;
	}

	public WebElement getCar() {
		return Car;
	}

	public WebElement getCa() {
		return Ca;
	}

	public WebElement getCli() {
		return Cli;
	}

	public WebElement getTex() {
		return tex;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getContest() {
		return contest;
	}

	public WebElement getHouse() {
		return house;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getText1() {
		return text1;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getClick2() {
		return click2;
	}

	public WebElement getTextt() {
		return textt;
	}

	public WebElement getCongt() {
		return congt;
	}

	public WebElement getForm() {
		return form;
	}
private void Mycart() {
elementClick(Clik);
	
	
	
	
}
	
		
		
	
}
