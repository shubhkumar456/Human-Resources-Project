package com.example.Human.Resources.Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculatorwithdouble {

    @RequestMapping("/Adition")
    public String add(){
        double a = 120.5;
        double b = 15.9;
        double result = a+b;
        return "The sum of addition in double :-"+result;
    }

    @RequestMapping("/multiplication")
    public String multiply(){
        double a = 12.0;
        double b = 12.0;
        double result = a*b;
        return "the sum of the multi is :- "+result;
    }

    @RequestMapping("/substraction")
    public String subs(){
        double a = 120.5;
        double b = 4.2;
        double result = a-b;
        return "the sum of the divide is :- "+result;
    }

    @RequestMapping("/divide")
    public String div(){
        double a = 120.5;
        double b = 4.2;
        double result = a/b;
        return "the sum of the divide is :- "+result;
    }

}
