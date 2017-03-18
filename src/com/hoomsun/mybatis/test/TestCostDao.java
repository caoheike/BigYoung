package com.hoomsun.mybatis.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hoomsun.mybatis.dao.CostMapperDao;
import com.hoomsun.mybatis.entity.Cost;

public class TestCostDao {
	public static void main(String[] args) {
		String conf="com/hoomsun/mybatis/config/applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
		
		
		System.out.println(ac);
	CostMapperDao dao=ac.getBean("costMapperDao",CostMapperDao.class);
	System.out.println("=============="+dao);
	Cost cost=dao.findByID(1);
	System.out.println("=============="+cost.getName());
	
	

	}
}
