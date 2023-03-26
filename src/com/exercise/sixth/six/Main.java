package com.exercise.sixth.six;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<>();

        for (int i = 0; i<10; i++){
            enteros.add(i+1);
        }

        ArrayList<Integer> paresFinal = new ArrayList<>(
                enteros.stream().filter(n -> n%2 != 0).collect(Collectors.toList())
        );


        for (Integer num :
             paresFinal) {
            System.out.println(num);
        }


    }
}
