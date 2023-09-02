package org.neww;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;

public class NewExcel extends BaseClass {
	public static void main(String[] args) throws IOException  {
		File f= new File("C:\\Users\\RIYA\\irfana\\Maveninstallation\\Excel\\Excel.xlsx");
		Workbook wb= new XSSFWorkbook();
		Sheet s= wb.createSheet("A");
		Row r= s.createRow(0);
		Cell c= r.createCell(0);
		 c.setCellValue("Data1");
		 FileOutputStream fos= new FileOutputStream(f);
		 
		 wb.write(fos);
		

	}

}
