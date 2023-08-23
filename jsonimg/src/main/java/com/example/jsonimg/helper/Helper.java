package com.example.jsonimg.helper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.example.jsonimg.model.Userg;



public class Helper {

	 public  static String[] HEADERS= {
			
			"id",
			"city",
			"name"		
	};
	
	public static String sheetname ="user_desc";
	
	public static ByteArrayInputStream datatoexcel(List<Userg> lists) throws IOException 
	{
		
		
		
		Workbook workbook= new XSSFWorkbook();
		ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream();
		
		try {
			
			
		
	    Sheet sheet =  workbook.createSheet(sheetname);
	    Row row  = sheet.createRow(0);
	     for(int i=0; i< HEADERS.length; i++)
	     {
	    	Cell cell= row.createCell(i);
	    	cell.setCellValue(HEADERS[i]);
	    	 
	     }
	         
		int rowindex=1;	
		
		for(Userg userg: lists)
		{
		Row row1=	sheet.createRow(rowindex);
		rowindex++;
		row1.createCell(0).setCellValue(userg.getId());
		row1.createCell(1).setCellValue(userg.getCityString());
		row1.createCell(2).setCellValue(userg.getNameString());
		
		}
		
		workbook.write(byteArrayOutputStream);
		return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		finally {
		     	byteArrayOutputStream.close();
		      	workbook.close();
		}
		
		
		
	
	}
	
	
}
