package com.vkeyws.fiqih_1202154123_modul5;

/**
 * Created by AS on 3/25/2018.
 */

public class adddata {
    String todo, desc, prior;

    //membuat konstruktor
    public adddata(String todo, String desc, String prior) {
        this.todo = todo;
        this.desc = desc;
        this.prior = prior;
    }

    //membuat method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }

}
