package com.spring.bean;

public class FactoryBeanPost extends FactoryBean {

	private String param;

	protected FactoryBeanPost(String param) {
		this.param = param;
	}

	@Override
	public String getProperty() {
		return param;
	}

}
