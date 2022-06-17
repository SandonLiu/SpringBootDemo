package com.sandon.SpringBootDemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sandon.SpringBootDemo.entity.Employee;

@Mapper
public interface UserMapper {
	List<Employee> fingAllEmployees();
}
