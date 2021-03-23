package com.learning.start;

import java.util.Spliterator;

public class DataStructures {


    /*
    -------------------------NOTES--------------------------------
    Linear search, goes 1 by 1 through a list. <- slower with huge list
    Binary search starts from the middle number. <- a lot faster

    Constant = 0(1)
    Logarithmic O(log n)
    Linear O(n)
    Quadratic O(n^2)
    O(2n)

    lookup O(1)
    Insert O(n)
    Delete O(n)

     */

    public void log(int[] numbers) {
        // O(1)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);
    }

    public void log2(int[] numbers) {
        // O(n)
        for(int i = 0; i < numbers.length; ++i)
            System.out.println(numbers[i]);
    }

    public void logForEach(int[] numbers) {
        for(int number : numbers) {
            System.out.println(number);
        }
    }

    public void numString(int[] numbers, String[] names) {

        for (int number : numbers) {
            System.out.println(number);
        }

        for (String name : names) {
            System.out.println(name);
        }

    }

    public void log3(int[] numbers) {
        //O(n ^ 2)

        for(int number : numbers) {
            System.out.println(number);
        }

        for(int first : numbers) {
            for (int second : numbers) {
                System.out.println(first + ", " + second + ", ");
            }
        }
    }

    public void greet(String[] names) {
        String[] copy = new String[names.length];

        for (int i = 0; i < names.length; ++i) {
            System.out.println("Hi " + names[i]);
        }
    }


}
