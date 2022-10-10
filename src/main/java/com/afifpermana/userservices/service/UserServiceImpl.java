/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.afifpermana.userservices.service;

import com.afifpermana.userservices.dto.User;
import java.util.List;
import com.afifpermana.userservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Apip
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required=true)
   private UserRepository userRepository;
    
    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUser(String id) {
        return userRepository.getUser(id);
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public User deleteUser(String id) {
        return userRepository.deleteUser(id);
    }
    
}
