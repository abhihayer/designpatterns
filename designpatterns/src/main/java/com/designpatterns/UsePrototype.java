package com.designpatterns;

import com.designpatterns.prototype.NetworkConnection;
import com.designpatterns.prototype.NetworkConnectionDeep;

public class UsePrototype {

    public static void usePrototype(){

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadData();

        System.out.println(networkConnection);

        try{
            NetworkConnection networkConnectionCloned = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnectionCloned);
        }
        catch (Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }

    }

    public static void usePrototypeCloned(){

        NetworkConnectionDeep networkConnectionDeep = new NetworkConnectionDeep();
        networkConnectionDeep.setIp("192.168.4.4");
        networkConnectionDeep.loadData();

        System.out.println(networkConnectionDeep);

        try{
            NetworkConnectionDeep networkConnectionClonedDeep = (NetworkConnectionDeep) networkConnectionDeep.clone();
            System.out.println(networkConnectionClonedDeep);
        }
        catch (Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }
    }
    
}
