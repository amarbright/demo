package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://amar-gae-project-342615.ue.r.appspot.com")
@RestController
public class TestController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

}