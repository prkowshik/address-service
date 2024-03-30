package com.codezen.app.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.codezen.app.entity.Address;
import com.codezen.app.model.AddressRequest;
import com.codezen.app.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	public AddressRequest getAddressById(Integer id) {
		AddressRequest addressRequest = new AddressRequest();
		Address address = addressRepository.findById(id).get();

		BeanUtils.copyProperties(address, addressRequest);
		return addressRequest;
	}
	
	

}
