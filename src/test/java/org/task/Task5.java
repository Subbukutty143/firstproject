package org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Task5 {

	@FindAll({@FindBy(id="inputName"), @FindBy(xpath="//input[@placeholder='First Last']")})
	private WebElement fstname;
	@FindAll({@FindBy(id="address"), @FindBy(xpath="//input[@placeholder='123 Main St.']")})
	private WebElement address;
	@FindAll({@FindBy(id="city"), @FindBy(xpath="//input[@placeholder='Anytown']")})
	private WebElement city;
	@FindAll({@FindBy(id="state"), @FindBy(xpath="//input[@placeholder='State']")})
	private WebElement state;
	@FindAll({@FindBy(id="zipCode"), @FindBy(xpath="//input[@placeholder='12345']")})
	private WebElement zipcod;
	@FindAll({@FindBy(id="cardType"), @FindBy(xpath="//select[@class='form-inline']")})
	private WebElement cardType;
	@FindAll({@FindBy(id="creditCardNumber"), @FindBy(xpath="//input[@placeholder='Credit Card Number']")})
	private WebElement creditCard;
	@FindAll({@FindBy(id="creditCardMonth"), @FindBy(xpath="//input[@placeholder='Month']")})
	private WebElement creditmonth;
	@FindAll({@FindBy(id="creditCardYear"), @FindBy(xpath="//input[@placeholder='Year']")})
	private WebElement creditYear;
	@FindAll({@FindBy(id="nameOnCard"), @FindBy(xpath="//input[@placeholder='John Smith']")})
	private WebElement nameonCard;
	@FindAll({@FindBy(xpath="//input[@type='submit']"), @FindBy(xpath="//input[@class='btn btn-primary']")})
	private WebElement click3;
	public WebElement getFstname() {
		return fstname;
	}
	

}
