package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserRegistration;
import com.aartek.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	
	private RegistrationRepository regisRepo;
	public boolean saveRegistrationService(UserRegistration regis)
	{
		
		System.out.println("Inside Service Method" +regis.getFirst_name()+" "+regis.getLast_name());
		UserRegistration userMember = (UserRegistration) regis;
		List<UserRegistration> list = null;
		
			list=regisRepo.saveLoginRepo(regis);
			System.out.println("after service method");
			if (list.size() == 0) {
			userMember = null;
			return false;
		} else {
			userMember = (UserRegistration) ( list.get(0));
			return true;
		}
	}
}
