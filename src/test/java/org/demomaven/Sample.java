package org.demomaven;

import org.BaseClass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class Sample extends BaseClass{
	@AfterClass
	public static void ac() {
		browserClose();

	}
	
	@Test
	public void test2() {
		valuePass(driver.findElement(By.id("pass")), "bagu");

	}
	@Test
	public void test1() {
		urlPass("https://www.facebook.com/");
		valuePass(driver.findElement(By.id("email")), "12345");

	}
	
	@Before
	public void before() {
		System.out.println("BeforeTest");

	}
	@After
	public void after() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public static void bc() {
		chromebrowserLaunch();
		maxWindow();

	}
	
	
//	 public static void main(String[] args) throws IOException { 
		
	/*edgebrowserLaunch();
		maxWindow();
		urlPass("https://www.facebook.com/");
		wait(5);
		
		LogInElements l = new LogInElements();
		valuePass(l.getUsername(), readData("Sheet1", 1, 0));
		valuePass(l.getPassword(), readData("Sheet1", 2, 2));
		elementClick(l.getLoginBtn());*/
		

		
		
		/*File f = new File("C:\\Users\\BAGULEYAN\\eclipse-workspace\\MvnTrial\\TestData\\SampleData.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);
		System.out.println(cell);*/
		
		/*File f = new File("C:\\Users\\BAGULEYAN\\eclipse-workspace\\MvnTrial\\TestData\\SampleData2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet sheet = book.getSheet("Data1");
		Row row = sheet.createRow(1);
		Cell cell0 = row.createCell(0);
		Cell cell1 = row.createCell(1);
		cell0.setCellValue("Bagu");
		cell1.setCellValue("12345");
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
		System.out.println("finish");*/
		
		
		
		/*Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet("Data1");
		Row row = sheet.createRow(0);
		Cell cell0 = row.createCell(0);
		Cell cell1 = row.createCell(1);
		cell0.setCellValue("Username");
		cell1.setCellValue("Password");
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
		System.out.println("finish");*/
		
		
		
	}


