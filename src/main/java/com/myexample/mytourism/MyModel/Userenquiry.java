package com.myexample.mytourism.MyModel;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="enquiry")
public class Userenquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    private String name;
    private String mobile;
    private String email;
    private String spackage;
    private int price;
    

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
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSpackage() {
        return spackage;
    }
    public void setSpackage(String spackage) {
        this.spackage = spackage;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    


    @Override
    public String toString() {
        return "Userenquiry [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", spackage="
                + spackage + ", price=" + price + "]";
    }







}
