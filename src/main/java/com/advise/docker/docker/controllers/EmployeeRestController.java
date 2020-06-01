package com.advise.docker.docker.controllers;

import com.advise.docker.docker.models.Employee;
import com.advise.docker.docker.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRestController {

    final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public List<Employee> getAll()
    {
        return employeeService.getAll();
    }
}
