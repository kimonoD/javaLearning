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
        //local change

        //change from remote

        PrimitiveDataTypes.playWithBooleans();
        System.out.println("I have a functional chair " + PrimitiveDataTypes.iHaveFunctionalChair(true, true));
        System.out.println("I have a functional chair " + PrimitiveDataTypes.iHaveFunctionalChair(true, true));

        double area = PlayingWithFunctions.computeTriangleArea(2, 4);
        double area2;
        area2 = PlayingWithFunctions.computeTriangleArea(2, 4);
        double side = 2.3, height = 5.6;
        double area_3 = PlayingWithFunctions.computeTriangleArea(side, height);
        



    }

    /**
     * sum -> function name
     *
     * @param a - parameter with type
     * @param b - parameter with type
     * @return return type
     * private -> access modifier
     * static - keyword
     */
    private static int sum(int a, int b) {
        int ffff;
        return a + b;
    }
}
