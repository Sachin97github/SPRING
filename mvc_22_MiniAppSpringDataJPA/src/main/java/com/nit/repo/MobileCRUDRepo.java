package com.nit.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nit.model.Mobile;

public interface MobileCRUDRepo extends CrudRepository<Mobile,Integer> {
	

}
