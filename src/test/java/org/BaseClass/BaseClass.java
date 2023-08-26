package org.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static TakesScreenshot t;
	
	
	
	//1. ChromeBrowserLaunch
	public static void chromebrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	// EdgeBrowawrLaunch
	public static void edgebrowserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	//2.BrowserClose
	public static void browserClose() {
		driver.close();
	}
	//3.BrowserQuit
	public static void browserQuit() {
		driver.quit();
	}
	//4.MaximizeWindow
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	//5.URLPass
	public static void urlPass(String url) {
		driver.get(url);
	}
	//6.GetTitleUrl
	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println("Title- "+title);

	}
	//7.PrintCurrentUrl
	public static void printCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current URL- "+currentUrl);

	}
	//8.PrintElementText
	public static void printText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}
	//9.ImplicitWait
	public static void wait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	//10.SendKeys
	public static void valuePass(WebElement element, String value) {
		element.sendKeys(value);
	}
	//11.Click
	public static void elementClick(WebElement element) {
		element.click();
	}
	//12.ActionsMoveToElement
	public static void mouseMoveToElement(WebElement target) {
		a = new Actions(driver);
		a.moveToElement(target).perform();;

	}
	//13.ActionsDragAndDrop
	public static void elementDragAndDrop(WebElement src,WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();;

	}
	//14.ElementDoubleClick
	public static void elementDoubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();

	}
	//15.SentenceFullClick
	public static void elementFullDoubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).click().perform();

	}
	//16.ActionsContextClick
	public static void elementContextClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).click();

	}
	//17.RobotEnter
	public static void rEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	//18.RobotUp
	public static void rUp() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}
	//19.RobotDown
	public static void rDown() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
	//20.RobotSelectAll
	public static void rSelectAll() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		}
	//21.RobotCopy
	public static void rCopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}
	//21.RobotPaste
	public static void rPaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}
	//22.AcceptAlert
	public static void acceptAlert() {
		al = driver.switchTo().alert();
		al.accept();

	}
	//23.DismissAlert
	public static void dismissAlert() {
		al = driver.switchTo().alert();
		al.dismiss();

	}
	//24.PromptAlert
	public static void promptAlert(String value) {
		al = driver.switchTo().alert();
		al.sendKeys(value);
		al.accept();

	}
	//25.PrintTextFromALert
	public static void printAlertText() {
		al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);

	}
	//26.SendKeysUsingJavaScriptExecutor
	public static void jsSendKeys(String attName,String passValue,WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('"+attName+"','"+passValue+"')", element);

	}
	//27.ClickUsingJavaScriptExecutor
	public static void jsClick(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);

	}
	//28.ScrollIntoViewJS-Top
	public static void jsScrollTop(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}
	//29.ScrollIntoViewJS-Bottom
		public static void jsScrollBottom(WebElement element) {
			js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);
			
		}
	//30.ScreenShot
		public static void screenShot(String fileName) throws IOException {
			t =(TakesScreenshot)driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\BAGULEYAN\\eclipse-workspace\\ScreenShots"+fileName+".png");
			FileUtils.copyFile(src, des);

		}
		//31.Frames Using Id
		public static void frameId(String id) {
			driver.switchTo().frame(id);

		}
		//32.Frames Using name
		public static void frameName(String name) {
			driver.switchTo().frame(name);

		}
		//33.Frames usingWebelement
		public static void frameWebElement(WebElement element) {
			driver.switchTo().frame(element);

		}
		//34.FramesUsingIndex
		public static void frameIndex(int i) {
			driver.switchTo().frame(i);

		}
		//35.ExitFromCurrentFrame
		public static void frameCurrentExit() {
			driver.switchTo().parentFrame();

		}
		//36.ExitFromAllTheFrames
		public static void frameAllExit() {
			driver.switchTo().defaultContent();

		}
		//ReadDataFromExcel
		public static String readData(String sheetName,int rowIndex,int cellIndex) throws IOException {
			File f = new File("C:\\Users\\BAGULEYAN\\eclipse-workspace\\MvnTrial\\TestData\\SampleData.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fi);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rowIndex);
			Cell cell = row.getCell(cellIndex); 
			int cellType = cell.getCellType();
			String cellvalue=null;
			if (cellType == 1) {
				 cellvalue = cell.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss ");
				 cellvalue = s.format(d);
			}
			else {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				 cellvalue = String.valueOf(l);
			}
			return cellvalue;

		}
		

}
