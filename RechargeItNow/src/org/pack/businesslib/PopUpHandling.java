package org.pack.businesslib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.pack.genericlib.Driver;

public class PopUpHandling {
		
	public static void getPopUpHandles(){
	
	 Set<String> set=Driver.driver.getWindowHandles();
	 Iterator<String> it=set.iterator();
	 
	 String parentId=it.next();
	 String childId=it.next();
	 
	 Driver.driver.switchTo().window(childId);
	 Driver.driver.close();	
	 Driver.driver.switchTo().window(parentId);

	 
	}
}
