package com.chen.spring.learn.bean;

/**
 * Created by chenxingyu on 2018/5/22.
 */
public class Account {
    private String name;

    public Account(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
