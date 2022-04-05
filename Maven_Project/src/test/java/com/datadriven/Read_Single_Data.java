package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Single_Data {

	public static void read_Particular_Data() throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Excel\\Trail.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String string = cell.getStringCellValue();
			System.out.println(string);

		} else if (cellType.equals(cellType.NUMERIC)) {
			double value = cell.getNumericCellValue();
			int cell_value = (int) value;
			System.out.println(cell_value);

		}
	}

	public static void main(String[] args) throws IOException {
		read_Particular_Data();
	}
}
