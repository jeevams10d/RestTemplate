package com.example.resttemplate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resttemplate.model.EmployeeEntity;
import com.example.resttemplate.repository.EmployeeRepository;

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


    public String updateEmployee(int empId, EmployeeEntity employeeEntity) {
    	Optional<EmployeeEntity>opEmp=employeeRepository.findById(empId);
        if(opEmp.isPresent())
        {
            employeeRepository.save(employeeEntity);
            return "update succesfully";
        }
        else
        {
            return "id not found";
        }
    }

    public void deleteEmployee(int empId) {
         employeeRepository.deleteById(empId);
    }
}
