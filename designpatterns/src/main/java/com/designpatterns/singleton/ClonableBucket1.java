package com.designpatterns.singleton;

public class ClonableBucket1 implements Cloneable{
    private static ClonableBucket1 clonableBucket1;

    private ClonableBucket1(){
        System.out.println("ClonableBucket1 got created");
    }
    
    public static ClonableBucket1 getClonableBucket1(){
        if(clonableBucket1==null){
            clonableBucket1 = new ClonableBucket1();
        }

        return clonableBucket1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
