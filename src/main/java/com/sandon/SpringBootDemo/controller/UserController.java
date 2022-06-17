package com.sandon.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandon.SpringBootDemo.entity.Employee;
import com.sandon.SpringBootDemo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// http://localhost:8081/hello
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	// http://localhost:8081/queryEmployees
	@RequestMapping("/queryEmployees")
	public List<Employee> queryEmployees() {
		return userService.queryEmployees();
	}
}
