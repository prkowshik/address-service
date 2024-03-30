package com.codezen.app.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codezen.app.entity.AddressEntity;
import com.codezen.app.model.Address;
import com.codezen.app.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	public Address getAddressById(Integer id) {
		Address addressRequest = new Address();
		AddressEntity address = addressRepository.findById(id).get();

		BeanUtils.copyProperties(address, addressRequest);
		return addressRequest;
	}
	
	

}
