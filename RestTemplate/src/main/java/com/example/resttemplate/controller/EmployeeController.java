package com.example.resttemplate.controller;

import com.example.resttemplate.model.EmployeeEntity;
import com.example.resttemplate.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServices employeeServices;
	@GetMapping("/getAllEmployee")
	public List<EmployeeEntity>getAllEmployee(){
      return employeeServices.getAllEmployee();
	}


	@PostMapping("/addAllEmployee")
	public  EmployeeEntity addAllEmployee(@RequestBody EmployeeEntity employeeEntity){
		return employeeServices.addAllEmployee(employeeEntity);
	}

	@PutMapping("/updateEmployee/empId")
	public  String updateEmployee(@PathVariable int empId,@RequestBody EmployeeEntity employeeEntity){
		return employeeServices.updateEmployee(empId,employeeEntity);
	}

	@DeleteMapping("/deleteEmployee/empId")

	public  void deleteEmployee(@PathVariable int empId){
		 employeeServices.deleteEmployee(empId);
	}
}
