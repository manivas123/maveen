package org.green;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.ant.util.DateUtils;

public class MavenProject {
	
public static void main(String[] args) throws IOException {
	
	File file=new File("C:\\Users\\SCLPT 059\\eclipse-workspace\\Mavennn\\Excel\\mani (Recovered).xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet("Sheet1");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		
		for (int j = 0; j <row.getPhysicalNumberOfCells() ; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
//			System.out.println(cellType);
			
			switch (cellType) {
			case STRING:
				String stringCellValue = cell.getStringCellValue();
//				System.out.println(stringCellValue);
				
				break;

			case NUMERIC:
				
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat format=new SimpleDateFormat("dd/mm/yy");
					String format2 = format.format(dateCellValue);
					System.out.println(format2);
				} else {

					double numericCellValue = cell.getNumericCellValue();
//					System.out.println(numericCellValue);
					long round = Math.round(numericCellValue);
					System.out.println(round);
					
					
					if (round==numericCellValue) {
						
						String valueOf = String.valueOf(round);
						System.out.println(valueOf);
					} else {
						String valueOf = String.valueOf(numericCellValue);
                        System.out.println(valueOf);
					}
					
					
					
				}
				
				
				
				
				
								
				
				
				
				
				
			default:
				break;
			}
			
			
			
			
			
			
		}
		
		
		
		
		
	}
	
}
}
