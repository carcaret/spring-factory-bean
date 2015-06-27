package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.FactoryBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = 
		    	   new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		
		FactoryBean bean = (FactoryBean) context.getBean("factoryBean", "test param");
		System.out.println(bean.echoParam());
		
	}
	
}
