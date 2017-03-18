package com.hoomsun.mybatis.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class BigyoungUtil {

	/**
	 * 
	 * @param 通过application 加载上下文 然后通过template进行获得  datesoce 然后进行数据库操作
	 */
	
	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:com/hoomsun/mybatis/config/applicationContext.xml");
	JdbcTemplate jdbc=(JdbcTemplate) ctx.getBean("jdbcTemplate");
	String sql="insert into test(id,name) values(9,'asda') ";
	int row=jdbc.update(sql);
	System.out.println(row);
	}
}
