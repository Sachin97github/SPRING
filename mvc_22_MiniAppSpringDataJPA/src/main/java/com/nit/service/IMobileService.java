package com.nit.service;

import java.util.List;

import com.nit.dto.MobileDTO;
import com.nit.model.Mobile;

public interface IMobileService {
	
	public Integer addMobile(MobileDTO dto);
	public void  deleteMobile(Integer sno);
	public MobileDTO getMobileBySno(Integer sno);
	public List<MobileDTO> getAllMobile();
	public void updateMobile(MobileDTO dto);
	
	

}
