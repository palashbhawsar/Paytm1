package com.aartek.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserRegistration;
import com.aartek.service.RegistrationService;
import com.aartek.validator.RegistrationValidator;


@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService regService;
	@Autowired
	private RegistrationValidator registrationvalidator;
	@RequestMapping("/UserRegistration")
	public String showLogin(Map<String,Object> map)
	{
		map.put("UserRegistration", new UserRegistration());
		System.out.println("inside view page");
		return "registration";
	}
	
	@RequestMapping(value = "/saveRegistration", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("UserRegistration") UserRegistration regis,BindingResult bindingresult,Model model)
	{
		registrationvalidator.validate(regis, bindingresult);
		
		if(bindingresult.hasErrors()){
		return "registration";
	}
		
		System.out.println("inside registration controller");
System.out.println(regis.getFirst_name());
		
		boolean status=regService.saveRegistrationService(regis);
		System.out.println(status);
		if(status==false)
		{
			Map<String, String> map=new HashMap<String,String>();
			map.put("unsucessfull"," Registration fail");
			System.out.println("after controller");
			return "registration";

		}
		else
		{
			System.out.println("inside registration");
			return "welcome";
		}
	}
/*@RequestMapping(value="/UserRegistraion", method={RequestMethod.GET,RequestMethod.POST})
public String signUp(@ModelAttribute("UserRegistration")String registration, BindingResult result, ModelMap model, Map<String,Object> map, HttpServletRequest request){
	boolean status = false;
	registrationvalidator.validate(registration, result);
	if(result.hasErrors()){
		return registration;
	}
	else{
	return signUp(registration, result, model, map, request);
	}
}
*/

}	
	
	