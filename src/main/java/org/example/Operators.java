package org.example;

public class Operators {
    public static void arithmeticOperators() {
        int a = 1;
        int b = 2;
        double div = (double) a / b;
        //+-*/
        // / -> casting = converstion

        System.out.println("Division of two numbers %s,%s is: %s ".formatted(a, b, div));
        System.out.println("Division of two numbers " + a + "," + b + " is: " + div);
    }

    public static void moduloOperator(int a, int b) {
        //1:2 = 0 reminder 1 --> revert operation: 0 * 2 + zvysok (1) = 1
        int modulo = a % b;
        //+-*/
        // / -> casting = converstion

        System.out.println("Modulo of two numbers %s,%s is: %s ".formatted(a, b, modulo));


    }
        // a++ ->, take a first, and then assign value: a = a+1

    public static boolean isNumberOdd(int i) {
        int modulo = i % 2;
        if (modulo == 1) {
            return true;
        }

        if (modulo == 0) {
            return false;
        }

        return true;
    }

    public static boolean isNumberOdd_2(int i) {

        if (i % 2 == 1) {
            return true;
        }

        return false;
    }

    public static boolean isNumberOdd_3(int i) {

        if (i % 2 == 1)
            return true;

        return false;
    }

    public static boolean isNumberOdd_4(int i) {
        return i % 2 == 1;
    }

    public static void incrementOperator() {

        int a = 4, b = 2;
        System.out.println("Increment: " + a++);
        System.out.println("value: " + a);

        System.out.println("Increment: " + (++a));
        System.out.println("value: " + a);


        // a++ ->, take a first, and then assign value: a = a+1

    }
    public static void decrementOperator() {

        int a = 1, b = 2;
        System.out.println("Decrement: " + a--);
        System.out.println("value: " + a);

        System.out.println("Decrement: " + (--a));
        System.out.println("value: " + a);

    }
    public static boolean isNumberEven(int i) {
        return false;
    }
    public static void additionalAssignment() {

        int a = 1;
        System.out.println("AdditionalAssignment : " + (a+=2)); //a+=2 je to iste ako a = a + 2 -'a' navýši o to čo je za =
        System.out.println("value: " + a);

        System.out.println("AdditionalAssignment : " + (a=4));
        System.out.println("value: " + a);

    }
    public static void subtractionAssignment() {

        int a = 1;
        System.out.println("SubtractionAssignment : " + (a-=2));
        System.out.println("value: " + a);

        System.out.println("SubtractionAssignment : " + (a=-4));
        System.out.println("value: " + a);

    }
    public static void multiplicationAssignment() {

        int a = 1;
        System.out.println("multiplicationAssignment : " + (a*=2));
        System.out.println("value: " + a);

    }
    public static void divisionAssignment() {

        double a = 1;
        System.out.println("divisionAssignment : " + ( a/=2));
        System.out.println("value: " + a);
    }
    public static void modulusAssignment() {

        int a = 1;
        System.out.println("modulusAssignment : " + (a%=2));
        System.out.println("value: " + a);
    }
}
