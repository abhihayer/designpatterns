package com.designpatterns;

import com.designpatterns.momento.Editor;
import com.designpatterns.momento.History;

public class UseEditor {
    public Editor editor;
    public History history;

    public UseEditor() {
        editor = new Editor();
        history = new History(); 
    }

    public String returnWork() {
        editor.setContent("a");
        history.push(editor.createState());
        
        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        return editor.getContent(); 
    }

}
