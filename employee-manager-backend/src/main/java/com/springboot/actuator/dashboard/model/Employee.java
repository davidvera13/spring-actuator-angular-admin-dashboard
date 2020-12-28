package com.springboot.actuator.dashboard.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="employees")
@Getter @Setter @ToString
public class Employee implements Serializable {

    private static final long serialVersionUID = -3132342076756833409L;
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String employeKeyId;

    private String name;

    private String email;

    private String jobTitle;

    private String phone;

    private String imageUrl;
}
