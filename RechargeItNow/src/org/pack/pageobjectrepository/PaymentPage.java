package org.pack.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
	//a[@id='cardtype0']
	
	@FindBy(xpath="//a[@id='cardtype0']")
	private WebElement intrBnkRadBtn;
	
	public WebElement getintrBnkRadBtn(){
		return intrBnkRadBtn;
	}
	
	@FindBy(xpath="//a[@id='cardtype1']")
	private WebElement debitcrddBtn;
	
	public WebElement getdebitcrddBtn(){
		return debitcrddBtn;
	}
	
	@FindBy(xpath="//a[@id='cardtype2']")
	private WebElement creditcrddBtn;
	
	public WebElement getcreditcrddBtn(){
		return creditcrddBtn;
	}
	
	//input[@id='bankcard']
}
