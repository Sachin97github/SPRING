package com.nit.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface FileMgmtService {
	
	public List<String> getAllFiles(String uploadStore);
}
