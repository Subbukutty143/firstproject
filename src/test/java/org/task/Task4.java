package org.task;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task4 extends BaseClass {
	
	
	@BeforeClass
	private void before() {
		getDriver();
		launchUrl("https://blazedemo.com/");
         
	}
	@Test(priority=1)
	public void tc0() {
          Task2 t = new Task2();
          selectByIndex(t.getSelect1(), 4);
          selectByIndex(t.getSelect2(), 3);
          btnClick(t.getClick());
          btnClick(t.getClick1());
          System.out.println("subbu");
          System.out.println("subbu");
	}
	@Test(priority=2)
	public void tc1() throws IOException, InterruptedException {
        Task3 t1 = new Task3();
        Thread.sleep(4000);
       enterText(t1.getFstname(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 10, 0) ); 
       enterText(t1.getAddress(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 10, 1)); 
       enterText(t1.getCity(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 10, 2)); 
        enterText(t1.getState(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 10, 3));
        enterText(t1.getZipcod(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 10, 4));       
        selectByIndex(t1.getCardType(), 2);
        enterText(t1.getCreditCard(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 10, 5));       
        enterText(t1.getCreditmonth(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 10, 6));       
        enterText(t1.getCreditYear(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 10, 7));       
        enterText(t1.getNameonCard(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 10, 8));       
         btnClick(t1.getClick3());
         
        
	}
	    @Test(priority=3)
      public void tc2() throws IOException {
    	  List<WebElement> trow = driver.findElements(By.tagName("tr"));
    	  
    		  WebElement row = trow.get(1);
    		  List<WebElement> tdata = row.findElements(By.tagName("td"));
    		  WebElement element = tdata.get(1);
    		  String text = element.getText();
    		  System.out.println(text);
    		  enterDataToExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 15, 8,text);
			

    	  }
      
      @AfterMethod
      private void after() {
             driver.close();
	}
}
