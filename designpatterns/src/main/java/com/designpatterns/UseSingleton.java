package com.designpatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.designpatterns.singleton.Bucket;
import com.designpatterns.singleton.ClonableBucket1;
import com.designpatterns.singleton.EnumBucket;
import com.designpatterns.singleton.ReflectSafeBucket;
import com.designpatterns.singleton.SerializedBucket1;
import com.designpatterns.singleton.SerializedBucket2;

public class UseSingleton {
    // Use pattern
    public void useSingleton(){
        Bucket bucket = Bucket.getBucket();
        System.out.println("Bucket hascode: "+bucket.hashCode());
    }

    public void useEnumSingleton(){
        EnumBucket enumBucket = EnumBucket.INSTANCE;
        System.out.println(enumBucket.hashCode());
    }

    public void useSingletonSD() throws FileNotFoundException, IOException, ClassNotFoundException{
        SerializedBucket2 bucket1 = SerializedBucket2.getBucket();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Bucket.ob"));
        oos.writeObject(bucket1);
        oos.close();
        System.out.println("Serialization done...");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Bucket.ob"));
        SerializedBucket2 bucket2 = (SerializedBucket2) ois.readObject();
        ois.close();
        System.out.println(bucket1.hashCode());
        System.out.println(bucket2.hashCode());
    }

    // Break Pattern
    public void breakSingletonSD() throws FileNotFoundException, IOException, ClassNotFoundException{
        SerializedBucket1 bucket1 = SerializedBucket1.getBucket();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Bucket.ob"));
        oos.writeObject(bucket1);
        oos.close();
        System.out.println("Serialization done...");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Bucket.ob"));
        SerializedBucket1 bucket2 = (SerializedBucket1) ois.readObject();
        ois.close();
        System.out.println(bucket1.hashCode());
        System.out.println(bucket2.hashCode());
    }

    public void breakSingletonRF() throws Exception{

        // Reflection unsafe bucket
        Bucket bucket1 = Bucket.getBucket();
        System.out.println(bucket1.hashCode());

        Constructor<Bucket> constructor = Bucket.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Bucket bucket2 = constructor.newInstance();
        System.out.println(bucket2.hashCode());

        // Reflection safe bucket
        ReflectSafeBucket reflectBucket1 = ReflectSafeBucket.getReflectSafeBucket();
        System.out.println(reflectBucket1.hashCode());

        try{
            Constructor<ReflectSafeBucket> reflectConstructor = ReflectSafeBucket.class.getDeclaredConstructor();
            reflectConstructor.setAccessible(true);
            ReflectSafeBucket reflectBucket2 = reflectConstructor.newInstance();
            System.out.println(reflectBucket2.hashCode());
        }
        catch(InvocationTargetException e){  
            System.out.println("Exception caught: " + e.getTargetException());
        }
    }

    public void breakSingletonCL() throws CloneNotSupportedException{
        ClonableBucket1 clonableBucket1 = ClonableBucket1.getClonableBucket1();
        ClonableBucket1 clonableBucket2 = (ClonableBucket1) clonableBucket1.clone();
        System.out.println(clonableBucket1.hashCode());
        System.out.println(clonableBucket2.hashCode());

    }
}
