package com.aartek.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
@Component
public class TestInterceptor extends HandlerInterceptorAdapter {
	@Override
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	throws Exception 
	{
		System.out.println("in preHandle");
	
  	return true;
	}

		
	@Override
		
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
	ModelAndView modelAndView) throws Exception 
	{
			
	System.out.println("in postHandle");

		
	}

		
	@Override
		
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
	throws Exception 
	{
			
	System.out.println("in afterCompletion");

		
	}

	}


