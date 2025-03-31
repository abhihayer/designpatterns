package com.designpatterns;

import com.designpatterns.factory.Employee;
import com.designpatterns.factory.EmployeeFactory;
import com.designpatterns.factory.Exception.EmptyDevCodeException;
import com.designpatterns.abstractfactory.*;

public class UseFactory {

    public static void useFactory(){
        try{
            EmployeeFactory.newEmployee("AND", 50000);
            Employee employeeWEB = EmployeeFactory.newEmployee("WEB", 60000);
            EmployeeFactory.newEmployee("", 0);
            
            int salaryWEB = employeeWEB.get_salary();
            System.out.println(salaryWEB);
        }
        catch(EmptyDevCodeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void useAbstractFactory(){
        com.designpatterns.abstractfactory.Employee emp = com.designpatterns.abstractfactory.EmployeeFactory.newEmployee(new AndroidDevFactory());
    }
}
