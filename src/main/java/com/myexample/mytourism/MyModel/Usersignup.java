package com.myexample.mytourism.MyModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name ="signup")
public class Usersignup {

    @Id
    private String email;
    private String username;
    private String password;
    private String pswrepeat;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPswrepeat() {
        return pswrepeat;
    }
    public void setPswrepeat(String pswrepeat) {
        this.pswrepeat = pswrepeat;
    }


    @Override
    public String toString() {
        return "Usersignup [email=" + email + ", username=" + username + ", password=" + password + ", pswrepeat="
                + pswrepeat + "]";
    }







}
