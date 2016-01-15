package org.pack.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pack.genericlib.Driver;

public class ExplicitWait {
	/*
	public void getWait(WebDriver driver, String xpathExpression) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathExpression)));
		
	}*/

	public void wait(WebDriver driver, By webElement) {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(webElement));		
	}
	

	public void wait(WebDriver driver, String string) {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(string)));	
	}	
}
