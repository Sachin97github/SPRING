package com.nit.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.nit.model.Student;

@Component("pdfView")
public class StudentPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc, PdfWriter writer,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
	
		List<Student> list=new ArrayList();
		for(int i=1;i<5;i++)
		{
			Student std=new Student();
			std.setName("Name"+i);
			std.setEmail("name"+i+"@gmail.com");
			std.setContact("9999999");
			std.setAddress("address"+i);
			list.add(std);
		}
		Paragraph para=new Paragraph("Student Report Pdf",new Font(Font.HELVETICA,20,Font.BOLDITALIC));
		Table t=new Table(4,4); //cols rows
		t.addCell("Name");t.addCell("Email");t.addCell("Contact");t.addCell("Address");
		
		for(Student std: list)
		{
			t.addCell(std.getName());
			t.addCell(std.getEmail());
			t.addCell(std.getContact());
			t.addCell(std.getAddress());
		}
		
		doc.add(para);
		doc.add(t);
  }

}
