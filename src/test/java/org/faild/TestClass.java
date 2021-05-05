package org.faild;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test()
	private void tc1() {
       Assert.assertTrue(false);
		System.out.println("metod1");
	}

	@Test
	private void tc2() {
		System.out.println("metod2");
	}

	@Test
	private void tc3() {
		  Assert.assertTrue(false);
			
		System.out.println("metod3");
	}

	@Test
	private void tc4() {
		System.out.println("metod4");
	}

	@Test
	private void tc5() {
		System.out.println("metod5");
	}

}
