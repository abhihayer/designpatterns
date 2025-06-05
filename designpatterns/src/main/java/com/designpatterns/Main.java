package com.designpatterns;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {     
        UseEditor uedit = new UseEditor();
        System.out.println("current value: "+uedit.returnWork());
        
        UseCanvas uCanvas = new UseCanvas();
        uCanvas.workCanvas();

        System.out.println("_____________________________________________");
        UseSingleton uSingleton = new UseSingleton();
        uSingleton.useSingleton();

        System.out.println("_____________________________________________");
        try {
            uSingleton.breakSingletonRF();
        }
        catch(Exception e) {
            System.out.println("Exception : "+e.getMessage());
        }
        
        System.out.println("_____________________________________________");
        uSingleton.useEnumSingleton();

        System.out.println("_____________________________________________");
        try {
            uSingleton.breakSingletonSD();
        } catch (ClassNotFoundException | IOException e) {
            e.getMessage();
        }

        System.out.println("_____________________________________________");
        try {
            uSingleton.useSingletonSD();
        } catch (ClassNotFoundException | IOException e) {
            e.getMessage();
        }

        System.out.println("_____________________________________________");
        try {
            uSingleton.breakSingletonCL();
        } catch (CloneNotSupportedException e) {
            e.getMessage();
        }
        
        System.out.println("_____________________________________________");    
        UseFactory.useFactory();
        UseFactory.useAbstractFactory();
        
        System.out.println("_____________________________________________");
        System.out.println(UseBuilder.useBuilder().toString());
        System.out.println(UseBuilder.useBuilderModified().toString());

        System.out.println("_____________________With shallow cloning________________________");
        UsePrototype.usePrototype();
        System.out.println("_____________________With deep cloning________________________");
        UsePrototype.usePrototypeCloned();
    }
}