package com.tcs.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Address {
	@Id  //primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String house;
	private String city;
}
