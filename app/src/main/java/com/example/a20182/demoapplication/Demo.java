package com.example.a20182.demoapplication;

/**
 *The Class to discribe the application object,
 * use which to record the information.
 * Include some origin info and other new info used for the App Running.
 */

import android.content.ComponentName;
import android.graphics.drawable.Drawable;

public class Demo {
    private String name;

    //无参构造函数
    public Demo(){}

    //有参构造函数
    public Demo(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
