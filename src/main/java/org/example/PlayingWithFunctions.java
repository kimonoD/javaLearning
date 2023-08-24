package org.example;

public class PlayingWithFunctions {
    //compute area of triangle
    public static double computeTriangleArea(double side, double heightOnSide) {
        return side * heightOnSide / 2.0;
    }

    public static double computeTriangleArea(double side, String heightOnSide) {
        return side * Double.parseDouble(heightOnSide) / 2.0;
    }

    //compute area of triangle and print the result if it is wanted
    //recursion -> error, infinite loop or memory error
    public static double computeTriangleAreaRecursion(double side, double heightOnSide, boolean shouldPrint) {
        System.out.println("Computed area of triangle is " + side * heightOnSide / 2.0);
        return computeTriangleArea(side, heightOnSide, shouldPrint);
    }


    public static double computeTriangleArea(double side, double heightOnSide, boolean shouldPrint) {
        double area = side * heightOnSide / 2.0;
        if (shouldPrint) {
            System.out.println("Computed area of triangle is " + area);
        }

        return area;
    }

    public static void printSumMultiplyDivisionDifference(int a, int b) {
        int multiply = a * b;
        double division = (double) a / (double) b;
        int difference = a - b;
        int sum = a + b;
        System.out.println("Sum: " + sum);
        System.out.println("Multiply: " + multiply);
        System.out.println("Division: " + division);
        System.out.println("Difference: " + difference);
    }

    //create function which print sum of 2 numbers (double) if the sum is greater than 2 print otherwise result should not be printed
    //also print the numbers
    //call printSumGreaterThen2(2,4) -> result: Numbers are: 2,4
    //call printSumGreaterThen2(-2,4) -> result:
    //call printSumGreaterThen2(-4,4) -> result:
    public static double printSumGreaterThen2(double scitanec1, double scitanec2, boolean shouldPrint) {
        double summary = scitanec1 + scitanec2;
        if (scitanec1 + scitanec2>2){
        System.out.println("The summary of your numbers is: " + summary);
        }
        return summary;


    }

    //create function which calculates circumference of triangle and print result if user wants(through parameter)

}
