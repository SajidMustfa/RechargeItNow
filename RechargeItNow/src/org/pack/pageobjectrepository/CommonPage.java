package org.pack.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage {

	@FindBy(xpath="//img[@id='btn']")
	private WebElement contBtn;
	
	public WebElement getContBtn() {
		return contBtn;
	}

	@FindBy(xpath="//span[text()='logout']")
	private WebElement logOutLink;
	
	public WebElement getlogOutLink() {
		return logOutLink;
	}
}
