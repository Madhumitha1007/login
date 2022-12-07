package com.spring.security.login.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String gender;
    private String emailid;
    private String phonenumber;
    private String usertype;
    private String password;
    private String ssotype;
    private Integer logincount;
    //private DateTime loginAt;
    //private DataTime createdAt;
   // private DataTime updatedAt;
    private boolean isActive = true;
}
