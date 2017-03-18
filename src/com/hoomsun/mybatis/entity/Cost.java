package com.hoomsun.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class Cost implements Serializable{
	private Integer id;  // 与cost表字段一致
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cost [id=" + id + ", name=" + name + "]";
	}
	
}
