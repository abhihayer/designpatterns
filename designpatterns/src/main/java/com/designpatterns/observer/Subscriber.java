package com.designpatterns.observer;

public class Subscriber implements Observer{

    @Override
    public void notified() {
        System.out.println("New video uploaded : Notification");
    }

}
