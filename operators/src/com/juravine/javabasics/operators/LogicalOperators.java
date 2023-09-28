package com.juravine.javabasics.operators;

public class LogicalOperators {

    public static void main(String[] args) {

        //logical operators

        boolean i = true;

        boolean j = false;

        //bitwise AND
        boolean bitwiseAndResult = i & j;
        System.out.println("Result of " + i + " AND " + j + " is " + bitwiseAndResult);

        //bitwise OR
        boolean bitwiseOrResult = i | j;
        System.out.println("Result of " + i + " OR " + j + " is " + bitwiseOrResult);

        //bitwise NOR
        boolean bitwiseNorResult = i ^ j;
        System.out.println("Result of NOT " + i + " OR NOT " + j + " is " + bitwiseNorResult);

        //logical AND
        boolean andResult = i && j;
        System.out.println("Result of " + i + " AND " + j + " is " + andResult);

        //logical OR
        boolean orResult = i || j;
        System.out.println("Result of " + i + " OR " + j + " is " + orResult);

    }
}
