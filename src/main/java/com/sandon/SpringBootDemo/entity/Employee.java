package com.sandon.SpringBootDemo.entity;

import lombok.Data;

@Data
public class Employee {
	// 必须跟数据库字段保持一致
	private String empId;
	private String empName;
}
