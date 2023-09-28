package com.juravine.javabasics.operators;

public class DifferenceBetweenPostfixAndPrefix {
    public static void main(String[] args) {

        //postfix
        int i = 4;
        int m = i++;

        //same result
        //int i = 4;
        //int m = i;
        //i++;

        //prefix
        int j = 4;
        int n = ++j;

        //same result
        //int j = 4;
        //j++;
        //int n = j;

        System.out.println("i = " + i + ", j = " + j + ", m = " + m + ", n = " + n);
    }
}
