package com.tcs.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.user.entity.User;

import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
	@GetMapping
	void getUser(){
		System.out.println("get user method");
	}
	@PostMapping
	void postUser(@RequestBody User user) {
		System.out.println("Sending user details"+user.getName());
	}
}
