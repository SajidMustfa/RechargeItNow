package org.pack.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {	
	@FindBy(xpath="//div[@class='welcome1']/a[@href='login.jspx']")
	private WebElement loginLink;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTxtField;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pwdTxtField;
	
	@FindBy(xpath="//a[@id='btnlogin']")
	private WebElement loginBtn;
	

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTxtField() {
		return emailTxtField;
	}

	public WebElement getPwdTxtField() {
		return pwdTxtField;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	
}
