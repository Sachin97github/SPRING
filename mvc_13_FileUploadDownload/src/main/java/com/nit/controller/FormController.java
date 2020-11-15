package com.nit.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nit.model.JobSeekerInfo;
import com.nit.service.FileMgmtService;

@Controller
public class FormController {
	
	@Autowired
	private ServletContext sc;
	@Autowired
	private FileMgmtService service;
	
	@GetMapping("/form.htm")
	public String showGetForm(@ModelAttribute JobSeekerInfo info)
	{
		info.setName("Default");
        info.setLocation("BPL");
		return "form";
	}

	@PostMapping("/form.htm")
	public String showPostForm(Map<String,Object> map,@ModelAttribute("jobSeekerInfo") JobSeekerInfo info)throws Exception
	{
	   String folderLocation=sc.getInitParameter("fileStore");
	   File file=new File(folderLocation); 
	     
	   if(!file.exists())
	      file.mkdir();
	   
	  String resumeFileName=info.getResume().getOriginalFilename();
	  String photoFileName=info.getPhoto().getOriginalFilename();
	  
	  InputStream isResume=info.getResume().getInputStream();
	  InputStream isPhoto= info.getPhoto().getInputStream();
	  
	  OutputStream osResume=new FileOutputStream(folderLocation+"/"+resumeFileName);
	  OutputStream osPhoto=new FileOutputStream(folderLocation+"/"+photoFileName);
	  
	  IOUtils.copy(isResume, osResume);
	  IOUtils.copy(isPhoto, osPhoto);
	  
	  map.put("info","Uploaded Succesfully"); 
	  return "sucess";
	}
	
	@GetMapping("/showList.htm")
	public String showAllFiles(Map<String,Object> map)
	{
		map.put("listFiles",service.getAllFiles(sc.getInitParameter("fileStore")));
		return "download";
	}
	
	@GetMapping("/download.htm")
	public String downloadFile(HttpServletResponse res,@RequestParam("filename") String fileName) throws IOException
	{
		//Gives add File name With Path
		String filePath=sc.getInitParameter("fileStore")+"/"+fileName;
	    File file=new File(filePath);
		//Set Length to response Object 
	    res.setContentLengthLong(file.length());
	    //get MimeType from context by Giving full file path
		String mimeType=sc.getMimeType(filePath);
		// if MIME type is null then use Universal MIME Type "application/octet-stream"
    	res.setContentType(mimeType==null?"application/octet-stream":mimeType);
    	//File input Stream of File 
		InputStream fileInStream=new FileInputStream(filePath);
		//OutputStream associated with ResponseObject
		OutputStream outputStream=res.getOutputStream();
		//It will tell that its  an attachment File 
		res.addHeader("Content-Disposition", "attachment;fileName="+fileName);
		//Copy Streams
		IOUtils.copy(fileInStream, outputStream);
		// DS will recongnize that <See Internet>
		return null;
		}

}
