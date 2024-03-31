package com.codezen.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final  Logger log = LoggerFactory.getLogger(AddressController.class);

	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Address> getAddressById(@PathVariable Integer id){
		log.info("Inside Address Controller");
		return new ResponseEntity(addressService.getAddressById(id), HttpStatus.OK);
		
	}

}
