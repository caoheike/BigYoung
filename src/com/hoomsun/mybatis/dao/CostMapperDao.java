package com.hoomsun.mybatis.dao;

import com.hoomsun.mybatis.entity.Cost;
import com.hoomsun.mybatis.util.MyBatisDao;




@MyBatisDao
public interface CostMapperDao {
	public Cost findByID(int id);
	public int AddTest();
}
