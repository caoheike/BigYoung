package com.hoomsun.mybatis.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.hoomsun.mybatis.dao.CostMapperDao;


public class BigyoungGetjdbc {



  public void addtest(){
		ApplicationContext atx=new ClassPathXmlApplicationContext("classpath:com/hoomsun/mybatis/config/applicationContext.xml");

		CostMapperDao  dao=atx.getBean(CostMapperDao.class);
		
	
	dao.AddTest();  
	  
  };
  

}
