package org.example;

import java.util.ArrayList;
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

        array  = new String[5];
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

}
