package com.juravine.javabasics.operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        //Arithmetic operators

        int a = 7;
        int b = 2;
        System.out.println("a=" + a + ", b=" + b);

        //add
        int additionResult = a + b;

        System.out.println("a+b=" + additionResult);

        //subtract
        int subtractionResult = a - b;
        System.out.println("a-b=" + subtractionResult);

        //divide
        int divisionResult = a / b;
        System.out.println("a/b=" + divisionResult);

        //throws ArithmeticException
        // int divisionByZero = a/0;

        //multiply
        int multiplicationResult = a * b;
        System.out.println("a*b=" + multiplicationResult);

        //divide with remainder
        int remainder = a % b;
        System.out.println("a%b=" + remainder);

    }
}
