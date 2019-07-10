package com.han.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.han.config.ConfigBean;
import com.han.config.ConfigTestBean;

@RestController
public class UserController {
	
	@Value("${com.han.name}")
	private String name;
	
	@Value("${com.han.hello}")
	private String hello;
	
	@Value("${com.han.bignumber}")
	private String bignumber;
	
	@RequestMapping("/")
	public String index() {
		return hello + ", you are BIG? " + bignumber;
	}
	
	@Autowired
	ConfigBean configBean;
	
	@Autowired
	ConfigTestBean configTestBean;
	
	@RequestMapping("/hello")
	public String hello() {		
		return hello + " Mr " + name;
	}
	
	@RequestMapping("/test")
	public String test() {
		return "where are you comming from? " + configTestBean.getTest();
	}
	
	@RequestMapping("/want")
	public String want() {
		return "want = " + configBean.getWant();
	}
}
