package org.example;

import java.util.Arrays;

public class OneDimensionalArray {
    public static void declaration() {
        int[] array;
        // old style: int array_2[];
    }

    public static void declarationWithAllocation() {
        //allocation
        int[] array = new int[5];
        System.out.println("Array has length: " + array.length);
        System.out.println("Array has length: " + Arrays.toString(array));
    }

    public static void initialisation() {
        //allocation
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array has length: " + array.length);
        System.out.println("Array has length: " + Arrays.toString(array));
    }

    public static void declarationWithAssignment() {
        //allocation
        String[] array = new String[3];
        System.out.println("Array has length: " + array.length);
        System.out.println("Array has length: " + Arrays.toString(array));

        array[0] = "One";
        array[1] = "Two";
        array[2] = "Three";
        System.out.println("Array has length: " + array.length);
        System.out.println("Array has length: " + Arrays.toString(array));

        array = new String[5];
        System.out.println("Array has length: " + Arrays.toString(array));
    }


    public static void iteratingOverArray() {
        //allocation
        String[] array = new String[5];
        array[0] = "One";
        array[1] = "Two";
        array[2] = "Three";
        array[3] = "Four";
        array[4] = "Five";
        //array[5] = "Six";
        System.out.println("Array has length: " + Arrays.toString(array));
        for (String string : array) {
            System.out.println(string);
        }

    }

    public static void sumViaStream() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Arrays.stream(array).sum();

        System.out.println("Sum of all the elements of an array: " + sum);
        System.out.println("Array has length: " + array.length);
        System.out.println("Array numbers are: " + Arrays.toString(array));
    }

    public static int sumViaRawLoop() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //motivation:
        int sum = array[0] + array[1];
        sum = array[0] + array[1] + array[2];
        //sum = array[0] + array[1] + array[2] + ... + array[9];

        //motivation
       /* sum = 0;
        sum = sum + array[0];
        sum = sum + array[1];
        sum = sum + array[2];
        //...
        sum = sum + array[9];
       */

        sum = 0;
        //index = index + 1; <=> index ++ <=> index+=1;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }

        sum = array[0];
        for (int index = 1; index < array.length; index++) {
            sum = sum + array[index];
        }

        sum = array[0];
        for (int index = 1; index <= array.length - 1; index++) {
            sum = sum + array[index];
        }

        sum = array[0];
        for (int index = 1; index <= array.length - 1; index++) {
            sum += array[index];
        }

        System.out.println("Sum of all the elements of an array: " + sum);
        System.out.println("Array has length: " + array.length);
        System.out.println("Array numbers are: " + Arrays.toString(array));

        return sum;
    }

    public static int sumViaSimpleForLoop() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //motivation:
        int sum = 0;

        for (int element : array) {
            sum += element;
        }

        return sum;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

}



