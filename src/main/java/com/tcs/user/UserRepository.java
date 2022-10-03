package com.tcs.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.user.entity.Address;
import com.tcs.user.entity.Contact;

public interface UserRepository extends JpaRepository<Address, Integer>{

	void save(Contact contact);

}
