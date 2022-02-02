package com.example.pbiproject.service;


import com.example.pbiproject.entity.Employee;
import com.example.pbiproject.entity.Role;
import com.example.pbiproject.entity.Sallery;
import com.example.pbiproject.repository.EmployeeRepository;
import com.example.pbiproject.repository.RoleRepository;
import com.example.pbiproject.repository.SalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SalleryRepository salleryRepository;

    @Autowired
    private RoleRepository roleRepository;

    public Employee registration(Employee employee){
        return employeeRepository.save(employee);
    }

    public Role addRole(Role role){
        return roleRepository.save(role);
    }

    public Sallery addsallery(Sallery sallery){
        return salleryRepository.save(sallery);
    }

    public List<Employee> employeeList(){
        return employeeRepository.findAll();
    }

    public Employee getempbyid(long id){
       Optional<Employee> employee= employeeRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        };
        return null;
    }
}
