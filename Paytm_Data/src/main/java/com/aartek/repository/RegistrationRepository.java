package com.aartek.repository;


import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserRegistration;


@Repository
public class RegistrationRepository {
private static final Logger loger = Logger.getLogger(RegistrationRepository.class);
	@Autowired
	
	private HibernateTemplate hibernateTemplate;
	public ArrayList<UserRegistration> saveLoginRepo(UserRegistration regis)
	{
		loger.error("message");
		System.out.println("inside repository");
		//System.out.println(regis.getFirst_name()+"  "+regis.getLast_name());	
		ArrayList<UserRegistration> login = new ArrayList<UserRegistration>();
		login=null;
		hibernateTemplate.save(regis);
		login = (ArrayList<UserRegistration>) hibernateTemplate.loadAll(UserRegistration.class);
		ArrayList<UserRegistration> reg=(ArrayList<UserRegistration>)login;
		System.out.println("after getting data ");
		
		
		
		return reg;
		

	}
	
	
	
	
	
	
	


	}
