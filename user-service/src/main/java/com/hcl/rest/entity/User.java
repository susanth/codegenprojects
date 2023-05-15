package com.hcl.rest.entity;
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int a;
    private String b;
    private String status;
    
    // Getters and Setters
}