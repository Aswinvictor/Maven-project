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

public class Read_AllData {
	public static void all_data() throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Excel\\Trail.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheet.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				System.out.print("    ");
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String cellValue = cell.getStringCellValue();
					System.out.print("  " + cellValue);
				} else if (cellType.equals(cellType.NUMERIC)) {
					double cellType2 = cell.getNumericCellValue();
					int value = (int) cellType2;
					System.out.print("  " + value);
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) throws IOException {
		all_data();
	}

}
