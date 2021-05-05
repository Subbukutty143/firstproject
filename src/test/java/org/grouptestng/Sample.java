package org.grouptestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test(groups="sanity")
	public void tc1() {
		 System.out.println(Thread.currentThread().getId());
			
     System.out.println("method1");
    }
	@Test(groups="smoke")
	public void tc2() {
		//Assert.assertTrue(false);
		 System.out.println(Thread.currentThread().getId());
			
     System.out.println("method2");
	}
	@Test(groups="sanity")
	public void tc3() {
		 System.out.println(Thread.currentThread().getId());
			
     System.out.println("method3");
	}
	@Test(groups="smoke")
	public void tc4() {
		 System.out.println(Thread.currentThread().getId());
			
     System.out.println("method4");
	}
	@Test(groups="E2E")
	public void tc5() {
		 System.out.println(Thread.currentThread().getId());
			
     System.out.println("method5");
	}
	

}
