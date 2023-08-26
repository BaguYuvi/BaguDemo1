package org.ddftasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseExcelSheet {

	public static void main(String[] args) throws IOException {
		
		File f = new File("\\Users\\BAGULEYAN\\eclipse-workspace\\MvnTrial\\TestData\\BaseSheet.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet("StudentDetails");
		Row row0 = sheet.createRow(0);
		Cell cell0 = row0.createCell(0);
		Cell cell1 = row0.createCell(1);
		cell0.setCellValue("Name");
		cell1.setCellValue("coursename");
		
		Row row1 = sheet.createRow(1);
		Cell cell2 = row1.createCell(0);
		Cell cell3 = row1.createCell(1);
		cell2.setCellValue("Bagu");
		cell3.setCellValue("Java");
		
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
		System.out.println("FINISH");
		

	}

}
