package com.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnectionDeep implements Cloneable{
    private String ip;
    private String data;
    private List<String> domain = new ArrayList<>();

    public List<String> getDomain() {
        return domain;
    }
    public void setDomain(List<String> domain) {
        this.domain = domain;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void loadData(){
        data = "Huge data. it takes suppose 10 mins to load";
        domain.add("www.google.com");
        domain.add("www.instagram.com");
        domain.add("www.flipkart.com");
        System.out.println("LOADING : "+data);
    }

    @Override
    public String toString(){
        return ip+" : "+data+" : "+domain;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        NetworkConnectionDeep networkConnectionDeep = new NetworkConnectionDeep();
        networkConnectionDeep.setData(data);
        networkConnectionDeep.setIp(ip);

        for(String d:domain){
            networkConnectionDeep.getDomain().add(d);
        }
        
        return networkConnectionDeep;
    }
}
