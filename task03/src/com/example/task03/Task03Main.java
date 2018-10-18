package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(3, 4);
        ComplexNumber complexNumber2 = new ComplexNumber(5, 2);

        System.out.println(complexNumber1.sum(complexNumber2).toString());
        System.out.println(complexNumber1.mult(complexNumber2).toString());
    }
}
