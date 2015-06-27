package com.spring.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class FactoryBean {

	@Autowired
	protected ConfigBean configBean;
	
	private String property;
	
	@PostConstruct
	public void init(){
		this.property = configBean.expandParam("property");
	}

	public abstract String getProperty();
	
	public static FactoryBean GET(int id) {
		return new FactoryBeanGet(id);
	}
	
	public static FactoryBean POST(String param){
		return new FactoryBeanPost(param);
	}

}
