package com.nit.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nit.model.Student;

@Component("excelView")
public class StudentExcelView extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook wrbk, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
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
		
		Sheet sheet=wrbk.createSheet("Student Report");
		int i=0;
		for(Student dto:list) {	
			Row row=sheet.createRow(i);
			row.createCell(0).setCellValue(dto.getName());
			row.createCell(1).setCellValue(dto.getEmail());
			row.createCell(2).setCellValue(dto.getContact());
			row.createCell(3).setCellValue(dto.getAddress());
			i++;
		}
		
		
	}
	
	


}
