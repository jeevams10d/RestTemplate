package com.example.resttemplatefirst.controller;

import com.example.resttemplatefirst.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class EmployeeController {

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

        @GetMapping("/getAllEmployee")
        public String getAllEmployee() {
        String url = "http://localhost:8082/getAllEmployee";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> repo = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("------taking employee---------");
        System.out.println(repo.getBody());
        System.out.println();
        return repo.getBody();

    }

    @PostMapping("/addAllEmployee")
    public String addAllEmployee(@RequestBody EmployeeDto employeeDto){
        String url = "http://localhost:8082/addAllEmployee";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <EmployeeDto> entity = new HttpEntity<EmployeeDto>(employeeDto,headers);
        ResponseEntity<String> repo = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        System.out.println("------taking employee---------");
        System.out.println(repo.getBody());
        System.out.println();
        return "Insert Successfully";

    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@PathVariable int empId,@RequestBody EmployeeDto employeeDto){
        String url = "http://localhost:8082/updateEmployee/"+empId;
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <EmployeeDto> entity = new HttpEntity<EmployeeDto>(employeeDto,headers);
        ResponseEntity<String> repo = restTemplate.exchange(url, HttpMethod.PUT, entity, String.class);
        System.out.println("------taking employee---------");
        System.out.println(repo.getBody());
        System.out.println();
        return "update Successfully";

    }

    @DeleteMapping("/deleteEmployee")
    public String updateEmployee(@PathVariable int empId){
        String url = "http://localhost:8082/deleteEmployee/"+empId;
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <EmployeeDto> entity = new HttpEntity<EmployeeDto>(headers);
        ResponseEntity<String> repo = restTemplate.exchange(url, HttpMethod.DELETE, entity, String.class);
        System.out.println("------taking employee---------");
        System.out.println(repo.getBody());
        System.out.println();
        return "deleted Successfully";

    }


}
