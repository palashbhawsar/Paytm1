package com.aartek.repository;

import java.util.List;
import org.apache.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class loginRepository {
	private static final Logger logger = Logger.getLogger(loginRepository.class);
	
	@Autowired
	
	private HibernateTemplate hibernateTemplate;

		@SuppressWarnings("unchecked")
		public List<Object> userSignIn(String emailId, String password) {
			
			logger.info("inside repo");
				List<Object> login = null;
			login=hibernateTemplate.find("from UserRegistration a1 where a1.email_id=? and a1.password=?",emailId ,password);
logger.info("after template");
			return login;

		}
		

	}



