package com.example.first.service;

import com.example.first.exception.UserNotFoundException;
import com.example.first.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    private Map<Integer, User> userDB = new HashMap<>();
    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    public User createUser(User user){
        logger.info("Creating user.... INFO");
        logger.debug("Creating user.... DEBUG");
        logger.trace("Creating user.... TRACE");
        logger.warn("Creating user.... WARN");
        logger.error("Creating user.... ERROR");
        System.out.println(user.getEmail());
        userDB.putIfAbsent(user.getId(),user);
        return user;
    }
    public User updateUser(User user){
        if (!userDB.containsKey(user.getId())) {
            logger.error("Error when finding user with id {} ", user.getId());
            throw new UserNotFoundException("User with ID " + user.getId() + " does not exist");
        }
        userDB.put(user.getId(), user);
        return user;
    }
    public boolean deleteUser(int id) {
        if (!userDB.containsKey(id))
            throw new UserNotFoundException("User with ID " + id + " does not exist");
        userDB.remove(id);
        return true;
    }
    public List<User> getAllUsers() {
        if (userDB.isEmpty())
            throw new NullPointerException("No users found in the database");
        return new ArrayList<>(userDB.values());
    }

    public User getUserById(int id) {
        return userDB.get(id);
    }

    public List<User> searchUsers(String name, String email) {
        return userDB.values().stream()
                .filter(u -> u.getName().equalsIgnoreCase(name))
                .filter(u -> u.getEmail().equalsIgnoreCase(email))
                .toList();
    }
}
