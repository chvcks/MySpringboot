package com.han.db.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.han.db.DBConnector;
@Component
@Profile("devdb")
public class DevDBConnector implements DBConnector {

	@Override
	public void configure() {
		// TODO Auto-generated method stub
		System.out.println("devdb");
	}

}
