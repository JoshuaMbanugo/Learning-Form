package com.learning.start;

public class nameList {
    private String[] names;
    private int count;

    public nameList(int length) {
        names = new String[length];
    }

    public void addName(String name) {
        if(names.length == count) {
            String[] newNames = new String[count * 2];
            for (int i = 0; i < count; i++) {
                newNames[i] = names[i];
            }
            names = newNames;
        }
        names[count++] = name;
    }

    public void print() {
        for(int i = 0; i < count; i++) {
            System.out.println(names[i]);
        }
    }
}
