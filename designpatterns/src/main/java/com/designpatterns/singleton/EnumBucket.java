package com.designpatterns.singleton;

public enum EnumBucket {

    INSTANCE;

    private EnumBucket(){
        System.out.println("Instance created: Enum Bucket");
    }
}
