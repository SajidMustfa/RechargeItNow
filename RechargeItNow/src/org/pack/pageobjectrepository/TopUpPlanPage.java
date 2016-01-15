package org.pack.pageobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sun.corba.se.impl.orbutil.closure.Constant;

public class TopUpPlanPage {
	
	@FindBy(xpath="//ul[@id='quick_recharge_tabs']/li[1]/a/img")
	private WebElement mobileIcon;
	
	public WebElement getmobileIcon(){
		return mobileIcon;
	}
	
	@FindBy(xpath="//input[@id='rechargeAmtID']")
	private WebElement amtTxtField;
		
	public WebElement getamtTxtField(){
		return amtTxtField;			
	}
	final String amount="110";
	
	@FindBy(xpath="//td[normalize-space(text())='"+amount+"']")
	private WebElement amtTxtLbl;
	
	public WebElement getamtTxtLbl(){
		return amtTxtLbl;
	}
	@FindBy(xpath="//td[normalize-space(text())='"+amount+"']/preceding-sibling::td[1]/input")
	private WebElement selectamontradioBtn;
	
	public WebElement getselectamontradioBtn(){
		return selectamontradioBtn;
	}
	
	
	@FindBy(xpath="//span/a[@id='tpplantypeR' and @class='jqTransformRadio jqTransformChecked']")
	private WebElement specialtopupradioBtn;
	
	public WebElement getspecialtopupradioBtn(){
		return specialtopupradioBtn;
	}
	
	@FindBy(xpath="//span/a[@id='tpplantypeR' and @class='jqTransformRadio']")
	private WebElement topupradioBtn;
	
	public WebElement gettopupradioBtn(){
		return topupradioBtn;
	}
	
	@FindBy(xpath="//td[normalize-space(text())='Topup Plans']")
	private WebElement topupplanLabel;
	
	public WebElement gettopupplanLabel(){
		return topupplanLabel;
	}
	
	@FindBy(xpath="//td[normalize-space(text())='Special Plans']")
	private WebElement specialplanLabel;
	
	public WebElement getspecialplanLabel(){
		return specialplanLabel;
	}
	
	
	@FindBy(xpath="//td[normalize-space(text())='MRP']")
	private WebElement planvalidationTable;
	
	public WebElement getplanvalidationTable(){
		return planvalidationTable;
	}
	
	@FindBy(xpath="//td[normalize-space(text())='MRP']/following-sibling::td")
	private WebElement planvalidationTableValue;
	
	public WebElement getplanvalidationTableValue(){
		return planvalidationTableValue;
	}
	
	//td[normalize-space(text())='MRP']/following-sibling::td

	@FindBy(xpath="//div[@class='pa10 billpay']/ul/li[normalize-space(text())='plan']")
	private WebElement planvalidationTable2;
	
	public WebElement getplanvalidationTable2(){
		return planvalidationTable2;
	}	
	@FindBy(xpath="//img[@id='btnproceed']")
	private WebElement proceedBtn;
	
	public WebElement getproceedBtn(){
		return proceedBtn;
	}
	
	@FindBy(xpath="//input[@id='buycpn']")
	private WebElement couponradBtn;
	
	public WebElement getcouponradBtn(){
		return couponradBtn;
	}
	
	@FindBy(xpath="//span/a[@id='cardtype0']")
	private WebElement selectNetBankPaymentRadBtn;
	
	public WebElement getselectNetBankPaymentRadBtn(){
		return selectNetBankPaymentRadBtn;
	}
	
	
}
