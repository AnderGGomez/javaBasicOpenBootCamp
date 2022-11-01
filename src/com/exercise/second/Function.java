package com.exercise.second;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un precio y reciba el valor con IVA(19%) incluido\n");

        double value = input.nextDouble();
        System.out.println("El valor con iva es : "+getIncludeIVA(value));

    }

    static double getIncludeIVA(double value){
        return value * 1.19;
    }
}
