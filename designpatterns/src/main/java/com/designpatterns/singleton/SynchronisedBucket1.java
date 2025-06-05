package com.designpatterns.singleton;

public class SynchronisedBucket1 {
    private static SynchronisedBucket1 synchronisedBucket1;

    private SynchronisedBucket1(){
        System.out.println("bucket got created");
    }
    
    public synchronized static SynchronisedBucket1 getSynchronisedBucket1(){
        if(synchronisedBucket1==null){
            synchronisedBucket1 = new SynchronisedBucket1();
        }

        return synchronisedBucket1;
    }

}

/*
 * Thread safety
 */