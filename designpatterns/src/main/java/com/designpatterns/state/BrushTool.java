package com.designpatterns.state;

public class BrushTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Solid line");
    }

}