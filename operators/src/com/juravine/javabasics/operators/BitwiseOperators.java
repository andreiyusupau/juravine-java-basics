package com.juravine.javabasics.operators;

public class BitwiseOperators {

    public static void main(String[] args) {
        //Bitwise operators

        int h = 0b1000;

        //bitwise shift right
        int bitwiseShiftRightResult = h >> 1;
        System.out.println("Result of bitwise move right on h=8 is " + bitwiseShiftRightResult);


        //bitwise shift left
        int bitwiseShiftLeftResult = h << 1;
        System.out.println("Result of bitwise move left on h=8 is " + bitwiseShiftLeftResult);

        int e = -8;

        //bitwise shift right with sign
        var bitwiseShiftRightWithSign = e >>> 1;
        System.out.println("Result of bitwise move right with sign on e=-8 is " + bitwiseShiftRightWithSign);
    }
}
