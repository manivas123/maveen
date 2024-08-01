package org.green;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheett {

	public static void main(String[] args) throws IOException {
		
		File file=new File("Excel\\mani (Recovered).xlsx");
		FileInputStream sterm=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(sterm);
		Sheet sheet = book.getSheet("Sheet1");
		for (int i = 0; i <sheet.getPhysicalNumberOfRows() ; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j <row.getPhysicalNumberOfCells() ; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
//				System.out.println(cellType);
				switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
//					System.out.println(stringCellValue);
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat formet=new SimpleDateFormat("dd/mm/yy");
						String format = formet.format(date);
//						System.out.println(format);
					}else {
					double numericCellValue = cell.getNumericCellValue();
	               long round = Math.round(numericCellValue);
	               if (round==numericCellValue) {
					String valueOf = String.valueOf(round);
//	            	  System.out.println(valueOf); 
	            	   
	            	  String valueOf2 = String.valueOf(numericCellValue);
	            	   System.out.println(valueOf2);
				}
	               
	               
//					System.out.println(round);
					
					
//					BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
//					String string = valueOf.toString();
//					System.out.println(string);
					
					}
					
					
					
					
					
					
					
					
					
					
					
				default:
					break;
				}
				
				
				
				
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
