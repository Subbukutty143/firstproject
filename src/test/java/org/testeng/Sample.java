package org.testeng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {

	
	
	@BeforeClass
	private void beforeClas() {
         System.out.println("beforeclass");
	}
	
	@BeforeMethod
	private void beforeM() {
        System.out.println("before method");
	}
	@AfterMethod
	private void afterM() {
   System.out.println("atfer method");
		
	}
	@AfterClass
	private void AfterClass() {
     System.out.println("after class");
	}
	@Test
	private void tc0() {
       System.out.println("Test1");
	}
	
	
	
	
	
	
	
	
}
