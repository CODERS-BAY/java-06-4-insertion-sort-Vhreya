package com.codersbay;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {25, 10,15, 4, 7, 13,2};

        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < numbers[j - 1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j - 1];
                numbers[j - 1] = temp;
                System.out.println(Arrays.toString(numbers));

                for (int i = j - 1; i >= 1; i--) {
                    if (numbers[i] < numbers[i - 1]) {
                        int temp2 = numbers[i];
                        numbers[i] = numbers[i - 1];
                        numbers[i - 1] = temp2;
                        System.out.println(Arrays.toString(numbers));
                    }

                }
            /*if (numbers[numIdx] < numbers[numIdx-1]){
                int temp = numbers[numIdx];
                numbers[numIdx] = numbers[numIdx-1];
                numbers[numIdx-1] = temp;
            }*/
            }

        }
    }
}