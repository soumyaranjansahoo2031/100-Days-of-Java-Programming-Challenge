package com.example.jpaDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends JpaRepository<UserClassSpringBoot, Long> {
}
