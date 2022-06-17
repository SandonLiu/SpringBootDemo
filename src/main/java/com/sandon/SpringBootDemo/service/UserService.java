package com.sandon.SpringBootDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandon.SpringBootDemo.entity.Employee;
import com.sandon.SpringBootDemo.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public List<Employee> queryEmployees() {

		List<Employee> employeeInfoList = userMapper.fingAllEmployees();
		List<Employee> resList = new ArrayList<Employee>();
		if (employeeInfoList.size() == 0) {
			return new ArrayList<Employee>();
		}

		for (int i = 0; i < employeeInfoList.size(); i++) {

			Employee employee = new Employee();
			// 设定雇员ID
			employee.setEmpId(employeeInfoList.get(i).getEmpId());
			// 设定雇员名字为（empID + empName）
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(employeeInfoList.get(i).getEmpId());
			strBuilder.append(employeeInfoList.get(i).getEmpName());
			employee.setEmpName(strBuilder.toString());

			resList.add(employee);
		}

		return resList;
	}
}
