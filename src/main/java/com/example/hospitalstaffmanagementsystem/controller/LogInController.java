package com.example.hospitalstaffmanagementsystem.controller;

import com.example.hospitalstaffmanagementsystem.Service.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class LogInController {

  /*  private AuthenticationService authenticationService;
     public LogInController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }*/

    /* *//**//*  @GetMapping("/login")*/
    @RequestMapping(value = "/", method = RequestMethod.GET)
/*
    public String gotoLoginPage(ModelMap model) {*/
    public String gotoWelcomePage(ModelMap model) {
        model.put("name", "Liza");
        return "welcomePage";
    }
  /*  @RequestMapping(value = "login",method = RequestMethod.POST)
    public  String gotoWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap model) {
       if(authenticationService.authenticate(name, password)){

       model.put("name",name);
       *//*model.put("password",password);*//*
        return "welcomePage";

       }
       model.put("errorMessage","Invalid Credentials! Please try again");
       return "login";
    }
*/
}
