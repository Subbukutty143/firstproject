package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task2 extends BaseClass {
	 public Task2() {
          PageFactory.initElements(driver, this);
	 }
	
	@FindAll({@FindBy(name="fromPort"), @FindBy(xpath="(//select[@class='form-inline'])[1]")})
	private WebElement select1;
	@FindAll({@FindBy(name="toPort"), @FindBy(xpath="(//select[@class='form-inline'])[1]")})
	private WebElement select2;
	@FindAll({@FindBy(xpath="//input[@type='submit']"), @FindBy(xpath="//input[@class='btn btn-primary']")})
	private WebElement click;
	@FindAll({@FindBy(xpath="//input[@type='submit']"), @FindBy(xpath="(//input[@class='btn btn-small'])[4]")})
	private WebElement click1;
	public WebElement getSelect1() {
		return select1;
	}
	public WebElement getSelect2() {
		return select2;
	}
	public WebElement getClick() {
		return click;
	}
	public WebElement getClick1() {
		return click1;
	}
	
	

}
