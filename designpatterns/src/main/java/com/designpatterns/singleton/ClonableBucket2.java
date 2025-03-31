package com.designpatterns.singleton;

public class ClonableBucket2 {
    private static ClonableBucket2 clonableBucket2;

    private ClonableBucket2(){
        System.out.println("ClonableBucket2 got created");
    }
    
    public static ClonableBucket2 getClonableBucket2(){
        if(clonableBucket2==null){
            clonableBucket2 = new ClonableBucket2();
        }

        return clonableBucket2;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return clonableBucket2;
    }
}
