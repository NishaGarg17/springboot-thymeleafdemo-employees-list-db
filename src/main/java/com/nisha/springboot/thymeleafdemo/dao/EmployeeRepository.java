package com.nisha.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisha.springboot.thymeleafdemo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// that's all there is no need to writy any code....
}
