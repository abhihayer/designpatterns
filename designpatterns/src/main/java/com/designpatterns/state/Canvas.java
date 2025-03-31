package com.designpatterns.state;

public class Canvas {
    private Tool currentTool;

    public void mouseUp(){
        currentTool.mouseDown();
    }

    public void mouseDown(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
