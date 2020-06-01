package com.advise.docker.docker.services;

import com.advise.docker.docker.models.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();
}
