package org.testmvn;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Adactin extends BaseClass {
	
	@BeforeClass
	public static  void beforeclass() {
		getDriver();
		launchUrl("https://adactinhotelapp.com/");
		}
	@Test
	public void tc0() throws IOException {
        Elements1 login = new Elements1();
          enterText(login.getUsername(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 0));
          enterText(login.getPassword(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 1));
          btnClick(login.getClick());
	  }
	@Test
	public void tc1() throws IOException {
		Elements2 search = new Elements2();
		selectByIndex(search.getLocation(), 3);
		selectByIndex(search.getHotel(), 2);
		selectByIndex(search.getRoomtype(), 2);
		selectByIndex(search.getRoomno(), 2);
		enterText(search.getDatein(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 2));
        enterText(search.getDateout(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 3));
        selectByIndex(search.getAdultroom(), 2);
        selectByIndex(search.getChildroom(), 3);
        btnClick(search.getSubmit());
        btnClick(search.getradioBtn());
        btnClick(search.getContin());
        
	}
	
      @Test
     public void tc2() throws IOException {
    	  Elements3 order = new Elements3();
    	  enterText(order.getFirstname(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 4));
          enterText(order.getLastName(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 5));
          enterText(order.getAddress(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 6));
          enterText(order.getCcnum(),getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 7));
          selectByIndex(order.getCctype(), 2);
          selectByIndex(order.getExpmonth(), 6);
          selectByIndex(order.getExpyear(), 3);
          enterText(order.getCvv(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 8));
          
          btnClick(order.getBooknow());
          
	}  
      @Test
      public void tc3() throws IOException, InterruptedException {
            Elements4 printtext = new Elements4();
            //getText(printtext.getOrderno());
            Thread.sleep(15000);
             enterDataToExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 3, 0, "ordernum");
            String string = getAttribute(printtext.getOrderno(), "value");
            System.out.println(string);
            enterDataToExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 3, 1, string);
	}
      @AfterClass
    public static void afterClass() {
         close();
	}      
      





}
