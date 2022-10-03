package com.tcs.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.user.entity.Contact;
import com.tcs.user.service.ContactService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	ContactService contactService;
	@PostMapping
	void saveContact(@RequestBody Contact contact) {
		contactService.saveContact(contact);
		log.debug("Contact: "+contact.getEmail());
	}
}
