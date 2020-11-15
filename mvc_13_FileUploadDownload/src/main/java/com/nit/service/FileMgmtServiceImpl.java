package com.nit.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FileMgmtServiceImpl implements FileMgmtService {
	@Override
	public List<String> getAllFiles(String uploadStore) {
	     File files=new File(uploadStore);
	    File content[] = files.listFiles();
	    List<String> filesNameList=new ArrayList();
	    for(File f:content)
	    {
	    	if(f.isFile())
	         filesNameList.add(f.getName());
	    }
		return filesNameList;
	}

}
