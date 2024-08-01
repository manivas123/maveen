package org.wipro;

import org.green.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProdect extends BaseClass {

	private void search() {
PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement txtsuccessMsg;
	
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement txtsearch;
	


	public String getTxtsearch() {
		String elementGetText = elementGetText(txtsearch);
		return elementGetText;
	}
	private void search(String search) {
      
		elementSendKeys(txtsuccessMsg, search);
		
		
	}
	
		
		
		
	}
	
	
	
	
	

