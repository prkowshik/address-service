package com.codezen.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codezen.app.entity.AddressEntity;
import com.codezen.app.model.Address;
import com.codezen.app.repository.AddressRepository;

@Service
public class AddressService {
    private static final  Logger log = LoggerFactory.getLogger(AddressService.class);

	
	@Autowired
	private AddressRepository addressRepository;

	public Address getAddressById(Integer id) {
		Address addressRequest = new Address();
		AddressEntity address = addressRepository.findById(id).get();
		log.info("Found the Address ={}", address.getId());

		BeanUtils.copyProperties(address, addressRequest);
		return addressRequest;
	}
	
	

}
