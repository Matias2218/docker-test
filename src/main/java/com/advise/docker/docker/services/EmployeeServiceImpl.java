package com.advise.docker.docker.services;

import com.advise.docker.docker.dao.EmployeeDao;
import com.advise.docker.docker.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<Employee> getAll() {
        return (List<Employee>) employeeDao.findAll();
    }
}
