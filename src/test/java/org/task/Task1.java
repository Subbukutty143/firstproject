package org.task;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterMethod;

public class Task1 extends BaseClass {
	@Before
	public void before() {
		getDriver();
		launchUrl("https://demoblaze.com/");
		}
	    @Test
       public void tc0() throws IOException, InterruptedException {
	    	Thread.sleep(3000);
          btnClick(findElementByXpath("//a[@class='hrefch']"));
          Thread.sleep(4000);
          btnClick(findElementByXpath("//a[@class='btn btn-success btn-lg']"));
          Thread.sleep(4000);
          enterDataToExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 5, 3, alertGetText());
          Thread.sleep(2000);
          accept();	
       }
       
       @AfterMethod
       private void after() {
         driver.close();
	}
}
