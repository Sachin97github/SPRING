package com.nit.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nit.dto.MobileDTO;

public interface IMobileService {
	
	public Page<MobileDTO> getAllByPage(Pageable pageable);

}
