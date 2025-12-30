package com.example.jpaDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserClassSpringBoot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public UserClassSpringBoot() {
    }

    public UserClassSpringBoot(String alice) {
        this.name = alice;
    }

//    public UserClassSpringBoot(long l, String alice) {
//        this.id=l;
//        this.name = alice;
//    }

    public void setId(Long id) {this.id = id;}

    public Long getId() {
        return this.id;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

}
