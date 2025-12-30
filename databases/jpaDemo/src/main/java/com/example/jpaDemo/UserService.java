package com.example.jpaDemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public UserClassSpringBoot createUser(UserClassSpringBoot user){
        return userRepository.save(user);
    }

    public List<UserClassSpringBoot> getUsers(){
        return userRepository.findAll();
    }
}
