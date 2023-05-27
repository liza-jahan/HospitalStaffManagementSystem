package com.example.hospitalstaffmanagementsystem.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

public class SecurityConfiguration {

    public InMemoryUserDetailsManager createUserDetailsManager(){
       UserDetails userDetails= User.withDefaultPasswordEncoder()
                .username("Liza")
                .password("liza123")
               .roles("USER","ADMIN")
               .build();
        return new InMemoryUserDetailsManager(userDetails);
    }
}