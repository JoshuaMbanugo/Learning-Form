package com.learning.start;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arr {

    public void ar() {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 50;
        numbers[2] = numbers[0] + numbers[1];
        System.out.println(Arrays.toString(numbers));

    }


}
