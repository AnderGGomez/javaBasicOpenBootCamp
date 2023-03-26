package com.exercise.sixth.seven;

public class Main {
    public static void main(String[] args) {
        try {
            DividePorCero (5, 0);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }
    }

     static void DividePorCero(int a, int b) throws ArithmeticException{
        try {
            double r = a/b;
            System.out.println(r);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }
    }
}
