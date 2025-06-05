package com.designpatterns.abstractfactory;

public class AndroidDeveloper implements Employee {
    private int _salary;
    private final String _devCode = "AND";

    AndroidDeveloper(int salary){
        _salary = salary;
        
        System.out.println("Android Developer: Rs "+_salary);
    }
    
    // Contructor overloaded
    AndroidDeveloper(){
        System.out.println("Android Developer: Default Rs 30000");
    }
    
    public int get_salary() {
        return _salary;
    }

    public String get_dev() {
        return _devCode;
    }
}
