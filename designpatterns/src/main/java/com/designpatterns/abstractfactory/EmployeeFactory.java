package com.designpatterns.abstractfactory;

public class EmployeeFactory {

    public static Employee newEmployee(EmployeeAbstractFactory factory,String devCode, int salary) {
        return factory.createEmployee();
    }

    // overload method
    public static Employee newEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
}
