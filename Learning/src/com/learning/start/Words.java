package com.learning.start;

class Words {
    String start = "Start";
    String[] words = {"Happy", "Hally", "Stitch", "Stan", "Stanly"};
    int payment = 10000;

    void printStart() {
        for (String w : words) {
            if (w.startsWith("St"))
                System.out.println(w + " Starts with St");

        }
    }

    void printLast() {
        for (String l : words) {
            if (l.endsWith("ly"))
                System.out.println(l + " Ends with ly");
        }
    }
}