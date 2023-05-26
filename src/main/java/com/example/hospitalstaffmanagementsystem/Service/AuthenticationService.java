package com.example.hospitalstaffmanagementsystem.Service;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String name,String password){

    boolean isValidUsername=  name.equalsIgnoreCase("HospitalManagement");
    boolean isValidPassword=password.equalsIgnoreCase("hospital");
    return  isValidUsername && isValidPassword;
    }
}
