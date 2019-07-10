package com.han.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.han.db.DBConnector;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	DBConnector connector;
	
	@RequestMapping(value= {"/",""})
	public String helloTask() {
		connector.configure();
		return "hello task";
	}

}
