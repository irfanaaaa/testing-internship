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

public class PrintRandmDatas {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\RIYA\\irfana\\Maveninstallation\\Excel\\Sampledatas.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		Sheet mySheet= wb.getSheet("Data");
		
		for (int i = 0; i <mySheet.getPhysicalNumberOfRows(); i++) {
			Row iterateRow=mySheet.getRow(0);
			
			for(int j=0;j<iterateRow.getPhysicalNumberOfCells();j++)
			{
				Cell iterateCell=iterateRow.getCell(j);
				System.out.println(iterateCell);
			}
			
		}
	}

}
