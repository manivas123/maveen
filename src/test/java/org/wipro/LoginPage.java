package org.wipro;

import org.green.BaseClass;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id ="email")
	private WebElement txtemail;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLogin() {
		return login;
	}
	public void login(String email,String pass) {
    elementSendKeys(txtemail, email);
	elementSendKeys(txtpass, pass);	
	elementClick(login);	
		
	}
	
	
}



