package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nit.dto.MobileDTO;
import com.nit.model.Mobile;
import com.nit.repo.MobilePageRepo;

@Service("service")
public class MobileServiceImpl implements IMobileService {

	@Autowired
	private MobilePageRepo repo;
	
	@Override
	public Page<MobileDTO> getAllByPage(Pageable pageable) {
		
		   Page <Mobile> pageModel=repo.findAll(pageable);
		   List<Mobile> listModel=pageModel.getContent();
		   List<MobileDTO> listDTO=new ArrayList();
		   System.out.println("Service :: ");
		   listModel.forEach(System.out::println);
		   
		   // Convert listModel to listDTO
		   listModel.forEach(model->{
			   MobileDTO dto=new MobileDTO();
			   BeanUtils.copyProperties(model, dto);
               listDTO.add(dto);			   
		   });
		   
		   System.out.println("After Conversion :: "); 
		   listDTO.forEach(System.out::println);
		   
		   //Convert pageModel to pageDTO
		   Page<MobileDTO> pageDTO= new PageImpl(listDTO,pageModel.getPageable(),pageModel.getTotalElements());
		   return pageDTO;
	}

}
