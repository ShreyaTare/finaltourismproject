package com.myexample.mytourism.MyModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tour")
public class Usercontatct {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String email;
    private String name;
    private String msg;

    


    // public Usercontatct(int id, String email, String name, String msg) {
    //     this.id = id;
    //     this.email = email;
    //     this.name = name;
    //     this.msg = msg;
    // }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Usercontatct [id=" + id + ", email=" + email + ", name=" + name + ", msg=" + msg + "]";
    }

    





}
