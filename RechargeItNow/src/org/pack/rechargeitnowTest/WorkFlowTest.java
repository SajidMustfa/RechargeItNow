package org.pack.rechargeitnowTest;

import org.testng.annotations.Test;
import org.testng.internal.TestNGMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pack.businesslib.CommonLib;
import org.pack.businesslib.ExplicitWait;
import org.pack.businesslib.PopUpHandling;
import org.pack.genericlib.Driver;
import org.pack.genericlib.ScreenShot;
import org.pack.pageobjectrepository.CommonPage;
import org.pack.pageobjectrepository.LoginPage;
import org.pack.pageobjectrepository.MobileHomePage;
import org.pack.pageobjectrepository.TopUpPlanPage;
import org.testng.Assert;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class WorkFlowTest {
	WebDriver driver;
	WebDriverWait wait;
	ITestResult result;
	//ITestNGMethod testMethod;
	String strUserName,strpwd,actualText;
	String mobileno;
	
	LoginPage login;	
	MobileHomePage homepage;
	CommonPage commonpage;
	TopUpPlanPage topupplanpage;
	ScreenShot screenshot;
	
	
	ExplicitWait exp;
	CommonLib cLib;
	
	@BeforeClass
	  public void beforeClass() {		
		strUserName="sam.cool24x7@gmail.com";
		strpwd="cuttack1234";
		actualText="welcome sajid";
		mobileno="9620269790";
		
		driver=Driver.getDriver();
		driver.manage().window().maximize();
		driver.get("http://www.rechargeitnow.com/#");
		
		exp=new ExplicitWait();
		cLib=new CommonLib();
		wait=new WebDriverWait(driver,20);
		screenshot=new ScreenShot();
		
		login=PageFactory.initElements(Driver.driver, LoginPage.class);
		homepage=PageFactory.initElements(Driver.driver, MobileHomePage.class);
		commonpage=PageFactory.initElements(Driver.driver, CommonPage.class);
		topupplanpage=PageFactory.initElements(Driver.driver, TopUpPlanPage.class);
	  }	
	
	 @BeforeMethod
	  public void loginToApp() {
		System.out.println("start");
		//			
		//Step1:Desciption-Login to App with valid username and password.
		 cLib.login(strUserName,strpwd);
		 //EVIDENCE-----------SCREENSHOT
		 try {
			screenshot.getscreenShotMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	 
	 @Test
	  public void mobileRechargeTest() throws Exception{
		 System.out.println("starttest");
		 //String nameScreenshot = testMethod.getMethodName();
		 
		//Step1:LoginToApp()	 
		 String expText=homepage.getwelcomeName().getText();
		 Assert.assertEquals(actualText,expText,"Pass");
		 
		 homepage.getMobileNoField().sendKeys(mobileno);
		 
		 commonpage.getContBtn().click();
		 exp.wait(Driver.driver, "//div[@id='opId_div']");
		 //screenshot.getscreenShotMethod(Driver.driver,nameScreenshot);
		 screenshot.getscreenShotMethod();
		 commonpage.getContBtn().click();
		
		 exp.wait(Driver.driver,"//td[normalize-space(text())='Topup Plans']");
		 topupplanpage.getselectamontradioBtn().click();
		 String selAmt=topupplanpage.getamtTxtLbl().getText();
		 
		 Thread.sleep(2000);
		 
		 String dsipyAmt=topupplanpage.getamtTxtField().getText();
		 System.out.println(dsipyAmt);
		// Assert.assertEquals(selAmt, dsipyAmt);
		 
		 commonpage.getContBtn().click();
		 exp.wait(Driver.driver,"//td[normalize-space(text())='MRP']");		 
		 String dsiplyAmtTable=topupplanpage.getplanvalidationTableValue().getText();
		 
		 Assert.assertEquals(dsiplyAmtTable, selAmt);
		 commonpage.getContBtn().click();
		 
		 //screenshot.getscreenShotMethod(Driver.driver,nameScreenshot);
		 
		 Thread.sleep(3000);
		 PopUpHandling.getPopUpHandles();
		 
		 exp.wait(Driver.driver,"//img[@src='pix/proceed.gif']");
		 topupplanpage.getproceedBtn().click();					 	
		 exp.wait(Driver.driver,"//label[normalize-space(text())='netbanking']");
		 topupplanpage.getselectNetBankPaymentRadBtn().click();
		
		//if( topupplanpage.getcouponradBtn().isEnabled()){
		//	topupplanpage.getcouponradBtn().click();
		//}
		
		
		
		
		// WebElement websel=homepage.getOperatortextField();
		// Driver.driver.findElement(By.xpath("//div[@id='input_dropdown']/div/img[@src='pix/drop_arrow.png']"));
		// homepage.getOperatortextField().click();
		 
		/* Thread.sleep(4000);
		 WebElement websel=Driver.driver.findElement(By.xpath("//select[@id='operatorid']"));
		 Select sel=new Select(websel);
		 //sel.selectByIndex(3);
		 
		 List<WebElement> lst=sel.getOptions();
		 int count=lst.size();
		 System.out.println(count);
		 
		// for(int i=0;i<count;i++){
		 String txt=lst.get(1).getText();
		 System.out.println(txt);
		//}
		 * 
		 * //html/body/ul[3]/li[2]/a[@class="ui-corner-all"]
*/		/* 
		 WebElement web=Driver.driver.findElement(By.xpath("//select[@id='operatorid']"));
		 Actions act=new Actions(Driver.driver);
		 act.moveToElement(web).click();
		 driver.findElement(By.xpath("//ul[3]/li[2]/a[@class='ui-corner-all']")).click();*/
	  }
	 @AfterMethod(alwaysRun = true)
	 public void afterMethod(ITestResult result) throws Exception {
		 
		 screenshot.getscreenShotMethod(Driver.driver,result);
		 driver.close();
		}
		 
		/*public void takeScreenShoot(WebDriver driver2, ITestNGMethod testMethod) throws Exception {
		    WebDriver augmentedDriver = new Augmenter().augment(driver2);
		    File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		    String nameScreenshot = testMethod.getMethodName();
		    String path = getPath(nameScreenshot);
		    FileUtils.copyFile(screenshot, new File(path));
		    //<a href="file://&quot;" target="_blank">" + this.getFileName(nameScreenshot) + "</a>
		    Reporter.log(this.getFileName(nameScreenshot));
		}
		 
		private String getFileName(String nameTest) throws IOException {
		    DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy_hh.mm.ss");
		    Date date = new Date();
		    return dateFormat.format(date) + "_" + nameTest + ".png";
		}
		 
		private String getPath(String nameTest) throws IOException {
		    File directory = new File(".");
		    String newFileNamePath = directory.getCanonicalPath() + "/target/surefire-reports/screenShots/" + getFileName(nameTest);
		    return newFileNamePath;
		}*/
	 @AfterClass
	 public void afterClass() {
		driver.quit();
  }

}
