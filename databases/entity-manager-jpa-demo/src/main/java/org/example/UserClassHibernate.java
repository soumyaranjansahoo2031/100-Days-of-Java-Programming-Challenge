package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserClassHibernate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public UserClassHibernate() {
    }

    public UserClassHibernate( String alice) {
        this.name = alice;
    }

//    public UserClassSpringBoot(long l, String alice) {
//        this.id=l;
//        this.name = alice;
//    }

    public Long getId() {
        return this.id;
    }
}
