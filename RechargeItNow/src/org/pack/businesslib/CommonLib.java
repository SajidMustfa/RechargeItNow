package org.pack.businesslib;

import org.openqa.selenium.support.PageFactory;
import org.pack.genericlib.Driver;
import org.pack.pageobjectrepository.CommonPage;
import org.pack.pageobjectrepository.LoginPage;

public class CommonLib {
	
	LoginPage login=PageFactory.initElements(Driver.driver, LoginPage.class);
	CommonPage commonpage=PageFactory.initElements(Driver.driver, CommonPage.class);
	ExplicitWait exp;
	
	public void login(String strUserName,String strpwd){
		 exp=new ExplicitWait();
		 exp.wait(Driver.driver,"//div[@class='welcome1']/a[@href='login.jspx']");
		 login.getLoginLink().click();
		 exp.wait(Driver.driver, "//input[@id='email']");
		 login.getEmailTxtField().sendKeys(strUserName);		
		 login.getPwdTxtField().sendKeys(strpwd);
		 
		 login.getLoginBtn().click();
		 exp.wait(Driver.driver,"//div[@class='welcome1']/span[text()=' welcome sajid']");
	}
	
	public void logout(){
		 commonpage.getlogOutLink().click();
	}

}
