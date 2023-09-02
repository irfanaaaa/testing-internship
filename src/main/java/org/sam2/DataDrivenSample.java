package org.sam2;

import java.io.IOException;

import org.base.BaseClass;

public class DataDrivenSample extends BaseClass {
	public static void main(String[] args) throws IOException {
		
	
	
	createNewExcelFile(0, 0, "selenium");
	createCell(0, 1, "java");
	createCell(0, 2, "dataDriven");
	createCell(0, 3, "POM");
	
	//2nd Row
	createRow(1, 0, "Appium");
	createRow(1, 1, "cucumber");
	createRow(1, 2, "Junit");
	createRow(1, 3, "testNG");
	

}
}
