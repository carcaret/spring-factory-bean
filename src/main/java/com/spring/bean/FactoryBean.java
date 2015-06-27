package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class FactoryBean {

	@Autowired
	private ConfigBean configBean;
	
	private String param;

	private FactoryBean(String param) {
		this.param = param;
	}

	public static FactoryBean createInstance(String param) {
		return new FactoryBean(param);
	}

	public String echoParam() {
		return configBean.expandParam(param);
	}

}
