package org.pack.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	public static WebDriver driver;
	
	public static WebDriver getDriver(){
		return driver=new FirefoxDriver();
	//return driver;
	}//
}
