package org.base;

import org.openqa.selenium.WebDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static void enterDataToExcel(String data, String name, int rowno, int cellno, String data2)
			throws IOException {
		File file = new File(data);
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(name);
		Row row = sheet.createRow(rowno);
		Cell cell = row.createCell(cellno);
		cell.setCellValue(data2);
		FileOutputStream op = new FileOutputStream(file);
		w.write(op);
		System.out.println("done!!");
	}

	public static String getDataFromExcel(String data, String name, int rowno, int cellno) throws IOException {
		File file = new File(data);
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(name);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int type = cell.getCellType();
		String value = "";
		if (type == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
			value = format.format(date);
		} else {
			double value1 = cell.getNumericCellValue();
			long l = (long) value1;
			value = String.valueOf(l);

		}
		return value;

	}

	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Maven\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void launchUrl(String data) {
		driver.get(data);
	}

	public static void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void getCurrentUrl() {
		driver.getCurrentUrl();

	}

	public static void getTitle() {
		driver.getTitle();

	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String getAttribute(WebElement element, String data) {
		String string = element.getAttribute(data);
		return string;

	}

	public static void close() {
		driver.close();

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void moveToElement(WebElement target) {
		Actions ac = new Actions(driver);
		ac.moveToElement(target).perform();

	}

	public static void rightClick(WebElement target) {
		Actions ac = new Actions(driver);
		ac.contextClick(target).perform();

	}

	public static void doubleClick(WebElement target) {
		Actions ac = new Actions(driver);
		ac.doubleClick(target).perform();

	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();

	}

	public static void keyPress() throws AWTException {
		Robot rc = new Robot();
		rc.keyPress(0);

	}

	public static void keyRelease() throws AWTException {
		Robot rc = new Robot();
		rc.keyRelease(0);

	}

	public static void accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	public static void alertSendkeys(String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);

	}
	public static String alertGetText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;

	}
	

	public static void getScreenshot(String data) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File(data);
		FileUtils.copyFile(src, dest);
	}

	public static void frameId(String Id) {
		driver.switchTo().frame(Id);
	}

	public static void frameName(String data) {
		driver.switchTo().frame(data);
	}

	public static void frameElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void frameIndex(int id) {
		driver.switchTo().frame(id);
	}

	public static void executeScriptSet(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(data, element);

	}

	public static void executeScriptGet(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('value')", element);

	}

	public static void executeScriptC(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(data, element);

	}

	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void selectByValue(WebElement element, String data) {
		Select sc = new Select(element);
		sc.selectByValue(data);
	}

	public static void selectByIndex(WebElement element, int id) {
		Select sc = new Select(element);
		sc.selectByIndex(id);
	}

	public static void selectByVisibleText(WebElement element, String data) {
		Select sc = new Select(element);
		sc.selectByVisibleText(data);
	}

	public static void getOptions(WebElement element) {
		Select sc = new Select(element);
		List<WebElement> list = sc.getOptions();

	}

	public static void getAllSelectedOptions(WebElement element) {
		Select sc = new Select(element);
		List<WebElement> list = sc.getOptions();

	}

	public static void getFirstSelectedOptions(WebElement element) {
		Select sc = new Select(element);
		WebElement fst = sc.getFirstSelectedOption();

	}

	public static void isMultiple(WebElement element) {
		Select sc = new Select(element);
		boolean b = sc.isMultiple();
	}

	public static void deSelectByIndex(WebElement element, int id) {
		Select sc = new Select(element);
		sc.deselectByIndex(id);
	}

	public static void deSelectByValue(WebElement element, String data) {
		Select sc = new Select(element);
		sc.deselectByValue(data);
	}

	public static void deSelectByVisibleText(WebElement element, String data) {
		Select sc = new Select(element);
		sc.deselectByVisibleText(data);
	}

	public static void deSelectAll(WebElement element, String data) {
		Select sc = new Select(element);
		sc.deselectAll();
	}

	public static void getWindowHandle() {
		String prtWindow = driver.getWindowHandle();
	}

	public static void getWindowHandles() {
		Set<String> allWindow = driver.getWindowHandles();

	}

	public static void switchWindow(String string) {
		driver.switchTo().window(string);
	}

	public static void quit() {
		driver.quit();
	}

	public static WebElement findElementById(String data) {
		WebElement findElement = driver.findElement(By.id(data));
		return findElement;
	}

	public static WebElement findElementByXpath(String data) {
		WebElement findElement = driver.findElement(By.xpath(data));
		return findElement;
	}

	public static WebElement findElementByName(String data) {
		WebElement findElement = driver.findElement(By.name(data));
		return findElement;

	}

}
