package com.adamoubello;

public enum SingletonEnum {

    INSTANCE("Initial enum info");

    private String info;

    private SingletonEnum(String info) {
        this.info = info;
    }

    public SingletonEnum getInstance() {
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
