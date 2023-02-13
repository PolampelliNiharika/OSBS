package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity 
//@JsonIgnoreProperties(value = "aId" , allowGetters = true , allowSetters = true)
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aId;//primary key

	private String adminName;
	
	private String emailId;
	
	private String username;
	
	private String password;
	
	private String role;
	
	
}
