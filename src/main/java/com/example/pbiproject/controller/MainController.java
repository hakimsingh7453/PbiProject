package com.example.pbiproject.controller;


import com.example.pbiproject.entity.Employee;
import com.example.pbiproject.entity.Role;
import com.example.pbiproject.entity.Sallery;
import com.example.pbiproject.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class MainController {

    @Autowired
    private MainService service;

    @PostMapping(value = "/registration")
    public ResponseEntity<Employee> registration(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(service.registration(employee), HttpStatus.CREATED);
    }

    @PostMapping(value = "/addrole")
    public ResponseEntity<Role> addrole(@RequestBody Role role){
        return new ResponseEntity<Role>(service.addRole(role),HttpStatus.CREATED);
    }

    @PostMapping(value = "/updatesallery")
    public ResponseEntity<Sallery> updatesallery(Sallery sallery){
        return new ResponseEntity<Sallery>(service.addsallery(sallery),HttpStatus.CREATED);
    }

    @GetMapping("/employeelist")
    public List<Employee> employeeList(){
        return service.employeeList();
    }

    @GetMapping(value = "/findemployee/{id}")
    public Employee getbyid(@PathVariable("id") long id){
        return service.getempbyid(id);
    }
}
