package com.otw.ems_backend.service;

import org.springframework.stereotype.Service;

import com.otw.ems_backend.entity.employee;
import com.otw.ems_backend.repository.employeerepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class employeeservice {

	private final employeerepository emprep;

	public employee postEmployee(employee employee) {
		System.out.println("Working:postEmployee ");
		return emprep.save(employee);
	}

}
