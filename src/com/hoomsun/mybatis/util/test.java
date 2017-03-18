package com.hoomsun.mybatis.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.hoomsun.mybatis.dao.CostMapperDao;


public class test implements ApplicationContextAware{

	private static ApplicationContext applicationContext;
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
	applicationContext = arg0 ;

	}
	
	 public static Object getBean(Class<CostMapperDao> class1) throws BeansException {
		Object object = null; 
		object = applicationContext.getBean(class1); 
		return object;
		
	}

	  public static Object getBean(String name, Class requiredType) throws BeansException {
		    return applicationContext.getBean(name, requiredType);
		  }
		



}
