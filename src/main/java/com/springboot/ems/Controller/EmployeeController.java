package com.springboot.ems.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ems.Entities.Employee;
import com.springboot.ems.Service.EmployeeService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	
	@PostMapping("/")
	public Employee saveemployeedetails(@RequestBody Employee employee){
		return employeeservice.saveemployee(employee);
	}
	
	@PutMapping("/")
	public Employee updateemployedetails(@RequestBody Employee employee){
		return employeeservice.updateemployee(employee);
	}
	
	@DeleteMapping("{id}")
	public void deleteemployee(@PathVariable("id")int id) {
		
		Employee employee = employeeservice.findbyid(id);
		 employeeservice.deleteemployee(employee);
	}
	
	@GetMapping("{id}")
	public Employee getemployee(@PathVariable("id") int id){
		return employeeservice.findbyid(id);
	}
	
	@GetMapping("/")
	public List<Employee> findallemployee() {
		List<Employee> patients = employeeservice.findall();
		return patients;
	}

}
