package com.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class ConfigBeanImpl implements ConfigBean{

	@Override
	public String expandParam(String param) {
		return String.format("expanded %s", param);
	}

}
