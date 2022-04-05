package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void write_data() throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Excel\\Trail.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("User details").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("User details").getRow(0).createCell(1).setCellValue("id");
		wb.getSheet("User details").createRow(1).createCell(0).setCellValue("Aswin");
		wb.getSheet("User details").getRow(1).createCell(1).setCellValue("27254");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("success");
	
	}

	public static void main(String[] args) throws IOException {
		write_data();
	}

}
