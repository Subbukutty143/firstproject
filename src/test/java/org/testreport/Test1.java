package org.testreport;

import java.io.File;
import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Test1 extends BaseClass {
	ExtentReports reports;
	ExtentHtmlReporter htmlReport;
	ExtentTest createTest;
	TakesScreenshot ts;
	
	
	@BeforeSuite
	private void beforesuite() {
		reports = new ExtentReports(); 
		htmlReport = new ExtentHtmlReporter("faceboook.html");
		reports.attachReporter(htmlReport);
         
	}
	@BeforeClass
	private void beforeClass() {
         getDriver();
         launchUrl("https://www.facebook.com/");
	}
	
	@Test
	private void tc0() throws IOException {
      createTest = reports.createTest("Validating facbook homepage");
      createTest.log(Status.INFO, "validating fb url");
      ts = (TakesScreenshot)driver;
      File as = ts.getScreenshotAs(OutputType.FILE);
      FileHandler.copy(as, new File("fb.png"));
		if(driver.getCurrentUrl(). contains("facebook")) {
			createTest.log(Status.PASS, "valid url");
			createTest.addScreenCaptureFromPath("fb.png");
		}
		else {
			createTest.log(Status.FAIL, "Invalid Url");
		}
		createTest.log(Status.INFO, "validating facebook text present in the homepage");
		WebElement txtfrmPage = findElementByXpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]");
	    if(txtfrmPage.getText().contains("people in"))	{
	    	createTest.log(Status.PASS, "particular text present in the page");
	    }
	    else {
	    	createTest.log(Status.FAIL, "particular text is not present in the page");
	    }
	   }
	
	@Test
	private void tc1() throws IOException {
          createTest = reports.createTest("validating username and password field");
          WebElement id = findElementById("email");
          enterText(id, "hijava");
          enterText(findElementById("pass"), "welcome");
          ts = (TakesScreenshot)driver;
          File file = ts.getScreenshotAs(OutputType.FILE);
          FileHandler.copy(file, new File("login.png"));
		  btnClick(findElementByName("login"));
	}
	@AfterClass
	private void afterClass() {
            driver.close();
	}
	@AfterSuite
	private void afterSuite() {
            reports.flush();
	}


}
