package com.ibm.demo.model;


import org.springframework.data.domain.ExampleMatcher.PropertyValueTransformer;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Login")
public class Account {

  
    private String id;
    private String phone;
    private String password;
    private String accId;
     private String name; 

    public Account(){}

    public Account(String phone, String password,String accId,String name) {
        this.phone = phone;
        this.password = password;
        this.accId = accId;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getaccId() {
        return accId;
    }
    public void setaccId(String accId) {
        this.accId = accId;
    }
    
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
}
