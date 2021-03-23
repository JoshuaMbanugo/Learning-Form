package com.learning.start;

import javax.swing.*;

public class Main {
    public static void main (String args[]) {


        //Constructors
        JFrame frame = new Training("Training");
        Words s = new Words();
        Words x = new Words();
        Recursion y = new Recursion();
        DataStructures d = new DataStructures();
        Arr a = new Arr();
        Array numbers = new Array(3);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        nameList nameList = new nameList(3);
        nameList.addName("Joshua");
        nameList.addName("Sarah");
        nameList.addName("Deborah");
        nameList.addName("Jedidiah");


        frame.setVisible(true);

        System.out.println("Systems online");








//        System.out.println(s.start);
//        System.out.println("---------------------------------------------------------------------------\n");
//        x.printStart();
//        System.out.println("---------------------------------------------------------------------------\n");
//        x.printLast();
//        System.out.println("---------------------------------------------------------------------------\n");
//        x.instance();
//        System.out.println("---------------------------------------------------------------------------\n");
//        a.ar();
//        System.out.println("---------------------------------------------------------------------------\n");
//        numbers.print();
//        System.out.println("---------------------------------------------------------------------------\n");
//        nameList.print();


    }
}
