package com.han.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.han")
public class ConfigBean {

	private String want;
	
	public String getWant() {
		return want;
	}

	public void setWant(String want) {
		this.want = want;
	}

}
