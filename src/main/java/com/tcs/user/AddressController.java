package com.tcs.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.user.entity.Address;
import com.tcs.user.service.AddressService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressService addressService ;
	@PostMapping
	void saveAddress(@RequestBody Address address) {
		addressService.saveAddress(address);
		log.debug("Address: "+address.getCity());
	}
}
