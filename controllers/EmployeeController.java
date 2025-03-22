package com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.controllers;

import com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.entities.EmployeeEntity;
import com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.repositories.EmployeeRepository;
import com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/employees")
public class EmployeeController {

//for required args constructor add private final compulsarily
    private final EmployeeService employeeService;


//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

    @GetMapping("/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity) {

        return employeeService.createNewEmployee(employeeEntity);

    }
}
