package com.example.Human.Resources.Project.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @RequestMapping("/Plus")
    public int add(){
        int a = 23;
        int b = 23;
        int result = a+b;
        return result;
    }

    @RequestMapping("/minus")
    public int subs(){
        int a = 123;
        int b = 23;
        int result = a-b;
        return result;
    }


    @RequestMapping("/multiply")
    public int mult(){
        int a = 23;
        int b = 23;
        int result = a*b;

        return result;
    }


    @RequestMapping("/division")
    public int div(){
        int a = 230;
        int b = 23;
        int result = a/b;
        return result;
    }



}
