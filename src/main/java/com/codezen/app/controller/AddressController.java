package com.codezen.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codezen.app.model.Address;
import com.codezen.app.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Address> getAddressById(@PathVariable Integer id){
		return new ResponseEntity(addressService.getAddressById(id), HttpStatus.OK);
		
	}

}
