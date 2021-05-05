package org.testmvn;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements4 extends BaseClass {
	public Elements4() {
       PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderno;
	
	
	public WebElement getOrderno() {
		return orderno;
	}
	

}
