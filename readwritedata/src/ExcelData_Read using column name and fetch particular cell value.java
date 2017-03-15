package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelData {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		File f = new File("./Excel/samp.xls");

		FileInputStream fis = new FileInputStream(f);

		HSSFWorkbook wb = new HSSFWorkbook(fis);

		HSSFSheet sh = wb.getSheet("Sheet1");

		ArrayList<String> colHeaders = new ArrayList<String>();
		
		ArrayList<String> rowHeaders = new ArrayList<String>();

		int totalCols = sh.getRow(0).getLastCellNum();
		int rowCount = sh.getLastRowNum();	
		System.out.println(rowCount);
		System.out.println(totalCols);

		String cellVal, rowVal;

		for (int iCol = 0; iCol < totalCols; iCol++) {

			cellVal = sh.getRow(0).getCell(iCol).getStringCellValue();
			colHeaders.add(iCol, cellVal);

		}

		for (int iRow = 0; iRow < rowCount; iRow++) {

			rowVal = sh.getRow(iRow).getCell(0).getStringCellValue();
			rowHeaders.add(iRow, rowVal);

		}
		//System.out.println("=============== column headers ================");
		
		String value;
		
		//iterate through all the columns to fetch rows
		

		for (String colName : colHeaders) {

			for (int allRows = 1; allRows <= rowCount; allRows++) {

				

				value = sh.getRow(allRows).getCell(colHeaders.indexOf(colName))
						.getStringCellValue();

				System.out.println(value);
				
			}
		}

		// Fetch a specific cell value by providing row and column header value

		Scanner getCell = new Scanner(System.in);

		 String rowH = getCell.next();

		String colH = getCell.next();

		if (colHeaders.contains(colH) & rowHeaders.contains(rowH)) {

			value = sh.getRow(rowHeaders.indexOf(rowH)).getCell(colHeaders.indexOf(colH))
					.getStringCellValue();

			System.out.println(value);
		}

	}

}
