package com.springboot.ems.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ems.Entities.Employee;
import com.springboot.ems.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	

	public Employee saveemployee(Employee employee){
		return employeeRepo.save(employee);
	}
	
	public Employee updateemployee(Employee employee){
		return employeeRepo.save(employee);
	}
	
	public void deleteemployee(Employee employee){
		employeeRepo.delete(employee);
	}
	
	public Employee findbyid(int id){
		return employeeRepo.findById(id).get();
	}
	
	public List<Employee> findall(){		
		return employeeRepo.findAll();
	}

}
