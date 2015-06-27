package com.spring.bean;

public class FactoryBeanGet extends FactoryBean {

	private int id;

	protected FactoryBeanGet(int id) {
		this.id = id;
	}

	@Override
	public String getProperty() {
		return Integer.toString(id);
	}

}
