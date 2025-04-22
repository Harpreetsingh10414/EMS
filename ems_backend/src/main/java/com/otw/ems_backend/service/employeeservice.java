package com.projKK.crud.service;

import org.springframework.stereotype.Service;

import com.projKK.crud.entity.employee;
import com.projKK.crud.repository.employeerepository;

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
