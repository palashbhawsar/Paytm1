package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserRegistration;

import com.aartek.repository.loginRepository;

@Service
public class loginService {
	@Autowired
	private loginRepository loginRepository;
	public boolean userSignIn(UserRegistration login){
		UserRegistration userMember =(UserRegistration)login;
		System.out.println("inside service");
		System.out.println(login.getEmail_id());
		
		List<Object> list = null;
		if (userMember != null) 
	{
	String emailID = login.getEmail_id();
	String password = login.getPassword();		
	if (emailID != null && password != null)
	 {
	list = loginRepository.userSignIn(emailID, password);
			}
		}
	if (list.size() == 0)
	 {
	userMember = null;
	return false;
	} 
	else
	 {
	userMember = (UserRegistration) list.get(0);
	return true;
	}
	}

}
