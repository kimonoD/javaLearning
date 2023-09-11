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
      return i%2==1;
    }


    public static boolean isNumberEven(int i) {
        return false;
    }

}
