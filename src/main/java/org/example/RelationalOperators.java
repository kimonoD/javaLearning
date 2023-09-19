package org.example;

public class RelationalOperators {

    public static void all() {

        int a = 1;
        int b = 2;
        boolean equal = a == b, notEqual = a != b, greater = a > b, less = a < b,
                greaterThenOrEqual = a >= b, lessThenOrEqual = a <= b;

        String first = "first", second = "second";
        boolean comparison = first == second;
        comparison = first.equals(second);
        // boolean comparison = first.equals(second); = boolean comparison = first == second;
    }

}
