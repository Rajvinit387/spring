package com.example.apixl.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.example.apixl.entities.product;

public class Helper {
	
	
	public static boolean checkformat(MultipartFile file)
	{
	String contentString=	file.getContentType();
	if(contentString.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		return true;
	else {
		return false;
	}
	}
	
	public static List<product> convert(InputStream is)
	
	{
		List<product> list= new ArrayList<>();
		try {
			
			XSSFWorkbook workbook=	new XSSFWorkbook(is);
		    XSSFSheet sheet=	workbook.getSheet("Sheet1");
		    
		    int row=0;
		   Iterator<Row> iterator= sheet.iterator();
		   
		   while(iterator.hasNext())
		   {
			   
			   Row row1=  iterator.next();
			   if(row==0)
			   {
				   row++;
				   continue;
			   }
			Iterator<Cell>  cellsIterator=  row1.iterator(); 
			
			int cid=0;
			product product =new product();
			
			while(cellsIterator.hasNext())
			{
				Cell cell=cellsIterator.next();
				
				switch(cid)
				{
				case 0: product.setId((int)cell.getNumericCellValue());
				          break;
				
				case 1: product.setFirstname((String)cell.getStringCellValue());
				 break;
				
				case 2: product.setSecondname((String)cell.getStringCellValue());
				 break;
				
				case 3: product.setGender((String)cell.getStringCellValue());
				 break;
				
				case 4: product.setCountry((String)cell.getStringCellValue());
				 break;
				
				
				case 5: product.setAge((int)cell.getNumericCellValue());
				 break;
				 
				 
				 default: break;
				
				}
				cid++;
			}
			list.add(product);
			   
			   
		   }
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	

}
