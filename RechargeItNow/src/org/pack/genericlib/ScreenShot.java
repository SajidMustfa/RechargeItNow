package org.pack.genericlib;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ScreenShot {
	
	
	//String Screenshotpath2="C:\\Users\\mustfa\\workspace\\RechargeItNow\\TestEvidence\\screenshot2.png";
	 public void getscreenShotMethod() throws Exception {	
		 ScreenShot s1=new ScreenShot();
		 String Screenshotpath1=s1.getFileName("WorkFlowTest");
		    	 try {
		    		 //takeScreenShoot(driver2,testMethod);
		               File scrFile = ((TakesScreenshot) Driver.driver).getScreenshotAs(OutputType.FILE);
		               String path=getPath(Screenshotpath1);
			             FileUtils.copyFile(scrFile, new File(path));
		              // FileUtils.copyFile(scrFile, new File(Screenshotpath1));
		            } catch (IOException e1) {
		                e1.printStackTrace();
		            }	            
		    }
	 
	 public void getscreenShotMethod(WebDriver driver2,ITestResult result) throws Exception {
		 ScreenShot s2=new ScreenShot();
		 String Screenshotpath2=s2.getFileName("WorkFlowTest");
		    if (result.isSuccess())	{	    	
		    	 try {
		    		// takeScreenShoot(driver2,testMethod);
		    		 File scrFile = ((TakesScreenshot) driver2).getScreenshotAs(OutputType.FILE);
		    		 String path=getPath(Screenshotpath2);
		             FileUtils.copyFile(scrFile, new File(path));
		            } catch (IOException e1) {
		                e1.printStackTrace();
		            }	            
		    }
		    else{	    	
		    	try {
		    		 //takeScreenShoot(driver2,testMethod);
		    		File scrFile = ((TakesScreenshot) driver2).getScreenshotAs(OutputType.FILE);
		    		 String path=getPath(Screenshotpath2);
		             FileUtils.copyFile(scrFile, new File(path));
		    	} catch (IOException e1) {
		    		e1.printStackTrace();
		    	}
		    }
	 	}	 
	 // public void takeScreenShoot(WebDriver driver2, String testMethod) throws Exception {
	/*	 public void takeScreenShoot(){
		  //  WebDriver augmentedDriver = new Augmenter().augment(driver2);
		   // File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		 	File scrFile = ((TakesScreenshot) Driver.driver).getScreenshotAs(OutputType.FILE);
		    String nameScreenshot = testMethod.getMethodName();
		    String path = getPath(nameScreenshot);
		    FileUtils.copyFile(scrFile, new File(path));
		    //<a href="file://&quot;" target="_blank">" + this.getFileName(nameScreenshot) + "</a>
		    Reporter.log(this.getFileName(nameScreenshot));
		}*/
	 private String getFileName(String nameTest) throws IOException {
		    DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy_hh.mm.ss");
		    Date date = new Date();
		    return dateFormat.format(date) + "_" + nameTest + ".png";
		}
	 private String getPath(String nameTest) throws IOException {
		    File directory = new File(".");
		    String newFileNamePath = directory.getCanonicalPath() + "/target/surefire-reports/screenShots/" + getFileName(nameTest);
		    return newFileNamePath;
		}
	
}
