package com.designpatterns;

import com.designpatterns.state.Canvas;
import com.designpatterns.state.BrushTool;
import com.designpatterns.state.SelectionTool;

public class UseCanvas {

    public void workCanvas(){
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
