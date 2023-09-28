package com.juravine.javabasics.operators;

public class ComparisonOperators {

    public static void main(String[] args) {
        //Comparison operators

        int f = 6;
        int g = 7;

        //equals
        boolean equalResult = f == g;
        System.out.println("Result of 6==7 is " + equalResult);

        //greater than
        boolean greaterThanResult = f > g;
        System.out.println("Result of 6>7 is " + greaterThanResult);

        //less than
        boolean lessThanResult = f < g;
        System.out.println("Result of 6<7 is " + lessThanResult);

        //greater or equals
        boolean greaterOrEqualsResult = f >= g;
        System.out.println("Result of 6>=7 is " + greaterOrEqualsResult);

        //less or equals
        boolean lessOrEqualsResult = f <= g;
        System.out.println("Result of 6<=7 is " + lessOrEqualsResult);

    }
}
