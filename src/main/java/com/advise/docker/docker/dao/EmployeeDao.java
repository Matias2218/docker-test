package com.advise.docker.docker.dao;

import com.advise.docker.docker.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Long> {
}
