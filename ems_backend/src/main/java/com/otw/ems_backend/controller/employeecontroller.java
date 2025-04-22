package com.otw.ems_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otw.ems_backend.entity.employee;
import com.otw.ems_backend.service.employeeservice;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")

public class employeecontroller {

	private final employeeservice empserv;

	@PostMapping("/employee")
	public employee postEmployee(@RequestBody employee Employee) {
		System.out.println("Received: " + Employee);

		return empserv.postEmployee(Employee);
	}
}
