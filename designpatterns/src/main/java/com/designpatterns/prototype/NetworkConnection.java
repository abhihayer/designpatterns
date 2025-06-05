package com.designpatterns.prototype;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String data;
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
        System.out.println("LOADING : "+data);
    }

    @Override
    public String toString(){
        return ip+" : "+data;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
