package com.example.pbiproject.entity;


import lombok.*;
import org.aspectj.weaver.ast.Not;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empid;
    private String name;
    private long number;
    private String email;
    private String password;
    private String address;
    private String dateofbirth;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
    List<Sallery> salleries=new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();


}
