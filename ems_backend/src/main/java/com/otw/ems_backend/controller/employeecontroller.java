package src.main.java.com.otw.ems_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projKK.crud.entity.employee;
import com.projKK.crud.service.employeeservice;

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
