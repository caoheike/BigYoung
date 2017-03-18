package com.hoomsun.mybatis.controller.login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hoomsun.mybatis.dao.CostMapperDao;
import com.hoomsun.mybatis.util.BigyoungGetjdbc;
import com.hoomsun.mybatis.util.test;


//进入登入页面
@Controller
@RequestMapping("/login")

public class LoginController {
//	@Resource
	@Autowired
    private CostMapperDao dao;
	public CostMapperDao getDao() {
		return dao;
	}

	public void setDao(CostMapperDao dao) {
		this.dao = dao;
	}
	
	//测试代码是否提交成功1

	@RequestMapping(value="/toLogin",method=RequestMethod.GET)
	public String toLogin(){
//		int row=dao.AddTest();
//		if(row>0){
//			System.out.println("执行成功");
//		}else{
//			System.out.println("执行失败");
//		}
//        new BigyoungGetjdbc().addtest();
		
		new test();
		CostMapperDao tt=(CostMapperDao) test.getBean(CostMapperDao.class);
		
			tt.AddTest();
		return "login";
	}
	
}
