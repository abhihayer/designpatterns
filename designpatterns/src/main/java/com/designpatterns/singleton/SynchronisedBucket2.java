package com.designpatterns.singleton;

public class SynchronisedBucket2 {
    private static SynchronisedBucket2 synchronisedBucket2;

    private SynchronisedBucket2(){
        System.out.println("bucket got created");
    }
    
    public static SynchronisedBucket2 getSynchronisedBucket2(){
        if(synchronisedBucket2==null){
            synchronized(SynchronisedBucket2.class){
                if(synchronisedBucket2==null){
                    synchronisedBucket2 = new SynchronisedBucket2();
                }
            }
        }
        return synchronisedBucket2;
    }

}

/*
 * Thread safety
 */