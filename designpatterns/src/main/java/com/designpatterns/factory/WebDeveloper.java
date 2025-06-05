package com.designpatterns.factory;

public class WebDeveloper implements Employee{
    private int _salary;
    private final String _devCode = "WEB";

    WebDeveloper(int salary){
        _salary = salary;
        
        System.out.println("Web Developer: Rs "+_salary);
    }

    public int get_salary(){
        return _salary;
    }

    public String get_dev() {
        return _devCode;
    }
}
