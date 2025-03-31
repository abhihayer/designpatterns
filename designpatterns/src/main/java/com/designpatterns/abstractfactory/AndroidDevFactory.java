package com.designpatterns.abstractfactory;

public class AndroidDevFactory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
