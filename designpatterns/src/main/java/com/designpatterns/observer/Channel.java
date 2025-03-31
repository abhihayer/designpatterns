package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    List<Observer> subscriber = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        subscriber.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        subscriber.remove(ob);
    }

    @Override
    public void notifyChanges() {
        for(Observer ob:subscriber){
            ob.notified();
        }    
    }

}
