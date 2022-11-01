package com.exercise.third;

import java.util.Arrays;
import java.util.Optional;

public class ConcatString {
    public static void main(String[] args) {
        String[] names = new String[]{"Ana" , "Maria", "Martha"};
        String concatNames2="";
        for (String elem: names) {
            concatNames2+=elem+" ";
        }
        System.out.println(concatNames2);

        String concatNames = Arrays.stream(names).reduce((acum, elem)-> acum.concat(" "+elem)).get();
        System.out.println(concatNames);
    }
}
