package com.example.resttemplate.services;

import com.example.resttemplate.model.EmployeeEntity;
import com.example.resttemplate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity addAllEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }


    public EmployeeEntity updateEmployee(int empId, EmployeeEntity employeeEntity) {

    }

    public void deleteEmployee(int empId) {
         employeeRepository.deleteById(empId);
    }
}
