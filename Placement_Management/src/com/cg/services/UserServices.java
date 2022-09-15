package com.cg.services;

import com.cg.entities.User;

public interface UserServices {
	User addNewUser(User user) ; 
	User updateUser(User user) ; 
	User login(User user); 
	boolean logOut();
}