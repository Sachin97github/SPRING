package com.nit.view;

import java.util.ArrayList;
import java.util.Date;
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
public class StudentPDFView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Student> listStudent=new ArrayList();
		Paragraph para=null;
		para=new Paragraph("Students Details Report",new Font(Font.BOLD,20));

		for(int i=1;i<5;i++)
		 {
			 Student std=new Student();
			 std.setSno(i);
			 std.setName("name"+i);
			 std.setAddress("Address"+i);
			 std.setPer(65.5f);
			 std.setDob(new Date());
			  listStudent.add(std);
		 }
		
		Table t=new Table(5,listStudent.size());  //col row
		t.addCell("Sno");t.addCell("Name");t.addCell("Address");
		t.addCell("Percentage");t.addCell("Dob");
		for(Student std:listStudent)
		{
			t.addCell(String.valueOf(std.getSno()));
			t.addCell(std.getName());
			t.addCell(std.getAddress());
			t.addCell(String.valueOf(std.getPer()));
			t.addCell(String.valueOf(std.getDob()));
		}
		document.add(para);
		document.add(t);
			
	}
}
