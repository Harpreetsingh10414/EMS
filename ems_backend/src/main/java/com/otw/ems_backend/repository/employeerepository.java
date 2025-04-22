package com.projKK.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projKK.crud.entity.employee;

@Repository

public interface employeerepository extends JpaRepository<employee, Long> {

}
