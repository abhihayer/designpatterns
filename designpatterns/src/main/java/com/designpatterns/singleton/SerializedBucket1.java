package com.designpatterns.singleton;

import java.io.Serializable;

public class SerializedBucket1 implements Serializable{
    private static SerializedBucket1 bucket;

    private SerializedBucket1(){
        System.out.println("bucket got created");
    }
    
    public static SerializedBucket1 getBucket(){
        if(bucket==null){
            bucket = new SerializedBucket1();
        }

        return bucket;
    }

}
