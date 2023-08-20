package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Sum of 4,5 is " + sum(4, 5));
        System.out.println("Sum of 5,6 is " + sum(5, 6));
        System.out.println("Sum of 2,3 is " + sum(2, 3));

        int a = 10;
        int b = 20;
        int sum = sum(a, b);

        int p = 2;
        int d = 3;
        sum = sum(p, d);

        System.out.println("Sum of from function " + sum);

        //git:
        //add
        //commit
        //push to origin -> into github repository
        //pull / mergujes

        //change from remote
    }

    private static int sum(int a, int b) {
        int ffff;
        return a + b;
    }
}
