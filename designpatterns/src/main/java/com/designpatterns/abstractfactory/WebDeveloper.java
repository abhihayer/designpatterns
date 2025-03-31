package com.designpatterns.abstractfactory;

public class WebDeveloper implements Employee{
    private int _salary;
    private final String _devCode = "WEB";

    WebDeveloper(int salary){
        _salary = salary;
        
        System.out.println("Web Developer: Rs "+_salary);
    }
    
    // Contructor overloaded
    WebDeveloper(){
        System.out.println("Web Developer: Default Rs 35000");
    }

    public int get_salary(){
        return _salary;
    }

    public String get_dev() {
        return _devCode;
    }
}
