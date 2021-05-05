package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task3 extends BaseClass {
	 public Task3() {
         PageFactory.initElements(driver, this);
	 }
	
	@FindBy(id="inputName")
	private WebElement fstname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(id="state")
	private WebElement state;
	@FindBy(id="zipCode")
	private WebElement zipcod;
	@FindBy(id="cardType")
	private WebElement cardType;
	@FindBy(id="creditCardNumber")
	private WebElement creditCard;
	@FindBy(id="creditCardMonth")
	private WebElement creditmonth;
	@FindBy(id="creditCardYear")
	private WebElement creditYear;
	@FindBy(id="nameOnCard")
	private WebElement nameonCard;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement click3;
	public WebElement getFstname() {
		return fstname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getZipcod() {
		return zipcod;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getCreditCard() {
		return creditCard;
	}
	public WebElement getCreditmonth() {
		return creditmonth;
	}
	public WebElement getCreditYear() {
		return creditYear;
	}
	public WebElement getNameonCard() {
		return nameonCard;
	}
	public WebElement getClick3() {
		return click3;
	}
	
}
