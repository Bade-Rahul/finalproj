package com.bankapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class AppUser {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String username;
	private String password;
	
}
