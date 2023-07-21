package com.myexample.mytourism.MyRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myexample.mytourism.MyModel.Usersignup;

public interface mySignuprepo extends JpaRepository<Usersignup , String>{
    // Usersignup findByUsername(String username);
    // Usersignup findByEmail(String email);
    Usersignup findByEmail(String email);
}
