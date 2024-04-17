package com.springboot.ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.ems.Entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
