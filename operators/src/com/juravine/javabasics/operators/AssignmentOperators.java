package com.juravine.javabasics.operators;

public class AssignmentOperators {

    public static void main(String[] args) {

        //Assignment operators

        int e = 5;
        System.out.println("e=" + e);

        //add and assign
        e += 3;
        System.out.println("After adding 3 e=" + e);

        //subtract and assign
        e -= 2;
        System.out.println("After subtracting 2 e=" + e);

        //multiply and assign
        e *= 2;
        System.out.println("After multiplying by 2 e=" + e);

        //divide and assign
        e /= 3;
        System.out.println("After dividing by 3 e=" + e);

        //divide with remainder and assign
        e %= 2;
        System.out.println("After dividing by 2 remainder is e=" + e);

    }
}
