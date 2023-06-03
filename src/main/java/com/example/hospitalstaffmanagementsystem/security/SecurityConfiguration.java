package com.example.hospitalstaffmanagementsystem.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;
import java.util.function.Function;

@Configuration
public class SecurityConfiguration {


/*
    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {

        UserDetails userDetails1 = createNewUser("liza", "liza123");
        UserDetails userDetails2 = createNewUser("ranga", "dummydummy");

        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
    }

    private UserDetails createNewUser(String username, String password) {
        Function<String, String> passwordEncoder
                = input -> passwordEncoder().encode(input);

        UserDetails userDetails = User.builder()
                .passwordEncoder(passwordEncoder)
                .username(username)
                .password(password)
                .roles("USER","ADMIN")
                .build();
        return userDetails;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //All URLs are protected
    //A login form is shown for unauthorized requests
    //CSRF disable
    //Frames


   *//* public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()

                .authorizeHttpRequests()
                .requestMatchers("/list-todos")
                .authenticated() .anyRequest().permitAll()
                .and()
                .formLogin().defaultSuccessUrl("/add-todo").permitAll()
                .and().logout().logoutSuccessUrl("/").permitAll().and().build();

    }*/


    /*
     * @Override public void configure(AuthenticationManagerBuilder auth) throws
     * Exception { auth.authenticationProvider(authenticationProvider()); }
     *
     * @Override public void configure(HttpSecurity http) throws Exception {
     * http.authorizeRequests() .antMatchers("/users").authenticated()
     * .anyRequest().permitAll() .and() .formLogin() .usernameParameter("email")
     * .defaultSuccessUrl("/users") .permitAll() .and()
     * .logout().logoutSuccessUrl("/").permitAll(); }
     */

}
