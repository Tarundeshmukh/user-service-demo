package com.tcs.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.user.UserRepository;
import com.tcs.user.entity.Address;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class AddressService {
	@Autowired
	UserRepository userRepository;
	
	public void saveAddress(Address address) {
		log.debug("about to add address into db");
		userRepository.save(address);
	}
}
