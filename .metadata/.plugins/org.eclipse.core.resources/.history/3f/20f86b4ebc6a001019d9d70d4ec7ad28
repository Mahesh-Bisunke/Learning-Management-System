package com.learningmgmt.entity;

import java.time.LocalDateTime;

import com.learningmgmt.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	
	private long id;
	
	private String name;
	
	@Column(unique=true , nullable=false)
	private String email;
	
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private String profileImage; //we can store url or path
	
	@Column(columnDefinition = "TEXT")
	private String bio;
	
	private LocalDateTime dateCreated;
	
}
