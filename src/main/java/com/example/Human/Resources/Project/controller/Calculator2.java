package com.example.Human.Resources.Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator2 {

    @RequestMapping("/addi")
    public String add(){
        int a = 12;
        int b = 15;
        int result =a+b;
        return "The addition is  =  "+result;
    }

    @RequestMapping("/subs")
    public String sub(){
        int a = 200;
        int b = 35;
        int result = a-b;
        return "The substraction is  =  "+result;
    }

    @RequestMapping("/multy")
    public String mult(){
        int a = 23;
        int b = 23;
        int result = a*b;
        return "The sum of multiply is : "+result;
    }

    @RequestMapping("/guda")
    public String div(){
        int a = 1000;
        int b = 2;
        int result = a/b;
        return "The division is  =  "+result;
    }

}
