package com.tcs.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.user.entity.Address;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/address")
public class AddressController {
	
	@PostMapping
	void postAddress(@RequestBody Address address) {
		log.debug("Address: "+address.getCity());
	}
}
