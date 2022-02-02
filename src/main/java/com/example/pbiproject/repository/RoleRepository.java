package com.example.pbiproject.repository;

import com.example.pbiproject.entity.Employee;
import com.example.pbiproject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
