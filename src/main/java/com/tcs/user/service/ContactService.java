package com.tcs.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.user.UserRepository;
import com.tcs.user.entity.Contact;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class ContactService {
	@Autowired
	UserRepository userRepository;
	
	public void saveContact(Contact contact) {
		log.debug("Adding Mobile and email into db");
		userRepository.save(contact);
	}
}
