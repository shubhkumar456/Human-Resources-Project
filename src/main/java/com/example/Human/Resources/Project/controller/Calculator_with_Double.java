package com.example.Human.Resources.Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_with_Double {

    @RequestMapping("/Addition")
    public double add(){
        double result = 12.5+34.4;
        return result;
    }

    @RequestMapping("/Division")
    public double div(){
        double result = 1222.5+34.4;
        return result;
    }


    @RequestMapping("/Substraction")
    public double sub(){
        double result = 100.5+34.4;
        return result;
    }


    @RequestMapping("/Multiplication")
    public double multiply(){
        double result = 12.5*34.4;
        return result;
    }

}
