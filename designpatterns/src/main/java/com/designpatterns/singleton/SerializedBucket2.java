package com.designpatterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializedBucket2 implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for serialization
    private static SerializedBucket2 bucket;

    private SerializedBucket2() {
        System.out.println("Bucket got created");
    }

    public static SerializedBucket2 getBucket() {
        if (bucket == null) {
            bucket = new SerializedBucket2();
        }
        return bucket;
    }

    // Prevents multiple instances during deserialization
    public Object readResolve() throws ObjectStreamException {
        return bucket; 
    }
}
