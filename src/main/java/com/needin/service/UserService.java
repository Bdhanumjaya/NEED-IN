package com.needin.service;

import com.needin.exception.UserException;
import com.needin.model.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	// public String findUserMobileByJwt(String jwt) throws UserException;

}
