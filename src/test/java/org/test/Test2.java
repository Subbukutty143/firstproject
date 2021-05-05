package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import bsh.classpath.BshClassPath.GeneratedClassSource;

public class Test2 extends BaseClass {
     @BeforeMethod
     private void before() {
             Date date = new Date();
             System.out.println(date);
	}
     @Test(dataProvider="value")
     public void tc0(String s, String s1) {
    	 getDriver();
    	 launchUrl("https://www.facebook.com/");
    	 enterText(driver.findElement(By.id("email")), s);
          enterText(driver.findElement(By.id("pass")), s1);
          
	}
     @DataProvider(name="value")
     private Object[][] getdata() {
    	 return new Object[][] {{"hijava" , "java"},{"hello","raj"}};
            
	}


}
