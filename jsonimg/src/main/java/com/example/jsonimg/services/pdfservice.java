package com.example.jsonimg.services;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;


@Service
public class pdfservice {
	
	
	private Logger logger= LoggerFactory.getLogger(pdfservice.class);
	
	public ByteArrayInputStream createpdf()
	{
		logger.info("pdf creation started");
		String titleString="welcome to pdf";
		String contentString="Vinit is very cute";
		ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
		Document document= new Document();
		PdfWriter.getInstance(document, byteArrayOutputStream);
		document.open();
		Font titlefFont= FontFactory.getFont(FontFactory.HELVETICA_BOLDOBLIQUE,25);
		Paragraph paragraph=new Paragraph(titleString,titlefFont);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		Font paraFont= FontFactory.getFont(FontFactory.HELVETICA,18);
		Paragraph para1= new Paragraph(contentString);
		para1.add(new Chunk("      next text added"));
		document.add(para1);
		document.close();
		return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
	}

}
