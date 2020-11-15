package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dto.MobileDTO;
import com.nit.model.Mobile;
import com.nit.repo.MobileCRUDRepo;

@Service("service")
public class MobileServiceImpl implements IMobileService {

	@Autowired
	private MobileCRUDRepo crudRepo;
	
	@Override
	public Integer addMobile(MobileDTO dto) {
	    Mobile mobile=new Mobile();
		BeanUtils.copyProperties(dto, mobile);
	    return crudRepo.save(mobile).getSno();
		
	}

	@Override
	public void deleteMobile(Integer sno) {
			crudRepo.deleteById(sno);
	}

	@Override
	public MobileDTO getMobileBySno(Integer sno) {
        MobileDTO  dto=new MobileDTO();  
        BeanUtils.copyProperties(dto, crudRepo.findById(sno).get());
		return dto;
  }
	@Override
	public List<MobileDTO> getAllMobile() {
		List<MobileDTO> listDTO =new ArrayList();
		 List<Mobile> listModel=(List<Mobile>) crudRepo.findAll();
		listModel.forEach(model->{
			  MobileDTO dto=new MobileDTO();
			  BeanUtils.copyProperties(model,dto);
			  listDTO.add(dto);
		});
			return listDTO;
	}

	@Override
	public void updateMobile(MobileDTO dto) {
		Mobile model=new Mobile();
		BeanUtils.copyProperties(dto, model);
	    crudRepo.save(model);
	    }

}
