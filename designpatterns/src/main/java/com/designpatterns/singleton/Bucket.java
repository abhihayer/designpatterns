package com.designpatterns.singleton;

public class Bucket {
    private static Bucket bucket;

    private Bucket(){
        System.out.println("bucket got created");
    }
    
    public static Bucket getBucket(){
        if(bucket==null){
            bucket = new Bucket();
        }

        return bucket;
    }
}
