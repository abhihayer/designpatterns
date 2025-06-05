package com.designpatterns.singleton;

public class ReflectSafeBucket {
    private static ReflectSafeBucket bucket;

    private ReflectSafeBucket() {
        if(bucket!=null){
            throw new RuntimeException("Singleton pattern class: object already exits.");
        }
        System.out.println("Reflect Safe bucket got created");
    }
    
    public static ReflectSafeBucket getReflectSafeBucket(){
        if(bucket==null){
            bucket = new ReflectSafeBucket();
        }

        return bucket;
    }
}
