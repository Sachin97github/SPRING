package com.nit.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nit.model.Mobile;

public interface MobilePageRepo extends PagingAndSortingRepository<Mobile, Integer> {

}
