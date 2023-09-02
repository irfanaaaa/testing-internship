package org.saam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\RIYA\\irfana\\Maveninstallation\\Excel\\Sampledatas.xlsx  ");
		FileInputStream fis=new FileInputStream(f);
		
		
		Workbook wb=new XSSFWorkbook(fis);
		
		
		Sheet mySheet=wb.getSheet("Data");
		
		
		Row particularRow=mySheet.getRow(0);
		
		Cell particularCell=particularRow.getCell(1);
		System.out.println(particularCell);
	}

}
