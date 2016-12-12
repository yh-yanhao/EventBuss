package com.example.lenovo_pc.eventbus;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Bean {
    private String name;

    public Bean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                '}';
    }
}
