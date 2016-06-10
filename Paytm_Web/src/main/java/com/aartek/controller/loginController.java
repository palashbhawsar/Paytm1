package com.aartek.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserRegistration;
import com.aartek.service.loginService;

@Controller
public class loginController  {
@Autowired	
private loginService loginService;
/*@RequestMapping(value="/UserRegistration",method={RequestMethod.GET,RequestMethod.POST})
public String showLogin(@ModelAttribute("UserRegistration") UserRegistration login,Map<String,Object> map){
	map.put("UserRegistration", new UserRegistration());
	System.out.println("inside controller");
	UserRegistration status=loginService.userSignIn(login);
	if(status==null){
		Map<String,String> map1 = new HashMap<String,String>();

map1.put("invalid", "invalid user id and password");
		return "login";
	}
	else{
		return "welcome";
	}

}

}*/

@RequestMapping(value = "/UserRegistration1", method = RequestMethod.GET)
public String showLogin(Map<String, Object> map) {
	map.put("UserRegistration1", new UserRegistration());
	return "login";
}

@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
public String saveUser(@ModelAttribute("UserRegistration1") UserRegistration login) {
	
	System.out.println("inside controller");
	
	boolean status = loginService.userSignIn(login); 
	
	if(status == false){
		Map<String,String> map = new HashMap<String,String>();

		map.put("invalid","invalid user id and password");
		return "login";
	}
	else{
		return "welcome";
	}

}
}
