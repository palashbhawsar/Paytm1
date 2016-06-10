package com.aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.aartek.model.UserRegistration;

@Component
public class RegistrationValidator {
	public boolean supports(Class<?> paramClass) {
		return UserRegistration.class.isAssignableFrom(paramClass);
	}
	public void validate(Object UserRegistration, Errors errors) {
	UserRegistration registration =(UserRegistration)UserRegistration;
	ValidationUtils.rejectIfEmpty(errors,"first_name" , "error.firstname.empty","cannot be null");
	ValidationUtils.rejectIfEmpty(errors,"last_name" , "error.lastname.empty","cannot be null");
	ValidationUtils.rejectIfEmpty(errors, "mobile_no", "error.mobilenumber.empty","cannot be null");
	ValidationUtils.rejectIfEmpty(errors, "email_id", "error.emailId.empty","cannot be null");
	ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty","cannot be null");
	ValidationUtils.rejectIfEmpty(errors, "address", "error.address.empty","cannot be null");
	
	/*if (registration.getEmail_id() != null && registration.getEmail_id().trim().length() > 0) 
	{
		if (registration.getEmail_id().contains("@") != true) {
			errors.rejectValue("emailid", "error.email.first.rule");
		} else if (registration.getEmail_id().contains(".com") != true
				&& registration.getEmail_id().contains(".net") != true
				&& registration.getEmail_id().contains(".co.in") != true) {
			errors.rejectValue("emailid", "error.email.second.rule");
		} else {
			errors.rejectValue("emailid", "error.email.required");
		}
	}
*/
		}	
	}

