package com.designpatterns.factory;

import com.designpatterns.factory.Exception.EmptyDevCodeException;

public class EmployeeFactory {

    public static Employee newEmployee(String devCode, int salary) throws EmptyDevCodeException {
        switch (devCode) {
            case "AND":
                return new AndroidDeveloper(salary);

            case "WEB":
                return new WebDeveloper(salary);        
            
            default:
                throw new EmptyDevCodeException("Dev Code is empty");
        }
    }
}
