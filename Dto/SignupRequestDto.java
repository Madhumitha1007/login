package com.spring.security.login.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class SignupRequestDto {
    @Id
    private String name;
    private String gender;
    private String emailid;
    private String phonenumber;
    private String password;

}
