package org.pack.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileHomePage {
	
	@FindBy(xpath="//select[@id='operatorid']")
	private WebElement operatortextField;
	
	@FindBy(xpath="//div[@id='opId_div']")
	private WebElement textLabel;
	
	@FindBy(xpath="//img[@id='btn']")
	private WebElement contBtn;
	
	@FindBy(xpath="//div[@id='input_dropdown']//input[@id='transSubscriptionNoID']")
	private WebElement mobileNoField;
	
	public WebElement getMobileNoField() {
		return mobileNoField;
	}
	
	@FindBy(xpath="//div[@class='welcome1']/span[text()=' welcome sajid']")
	private WebElement welcomeName;
	
	
	
	
	public WebElement getwelcomeName(){
		return welcomeName;
	}

	public WebElement getContBtn() {
		return contBtn;
	}
	
	public WebElement gettextLabel() {
		return textLabel;
	}
	public WebElement getOperatortextField() {
		return operatortextField;
	}
	
}
