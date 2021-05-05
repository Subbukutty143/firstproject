package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\data1.xlsx");
		//FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("Sheet1");
		 Row row = sheet.createRow(0);
		 Cell cell = row.createCell(0);
	
		
		
		
	}
	

}
