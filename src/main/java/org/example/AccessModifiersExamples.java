package org.example;

public class AccessModifiersExamples {

    public static void publicAccess(){

    }

    private static void privateAccess(){

    }

    protected static void protectedAccess(){

    }

    public static void callingInsideClass(){

        AccessModifiersExamples.publicAccess();
        protectedAccess();
        privateAccess();
    }
}
