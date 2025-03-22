package com.pack.test;

public class TestFunction {
    @FunctionalInterface
    interface Square{
            int calculateArea(int a);
    }

    interface OperationType {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        //Square s  =  (int x)-> x*x;
        Square sq = s-> s * s;

        System.out.println("Square Area: "+sq.calculateArea(5));

        OperationType add = (a, b) -> a + b;
        System.out.println("Additon: " + add.operation(6, 7));

    }
}
