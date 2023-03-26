package com.exercise.sixth.five;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayFrases = new ArrayList<>(Arrays.asList("hola","mundo","array","list"));
        LinkedList<String> listaFrases = new LinkedList<>(arrayFrases);

        System.out.println("ArrayList\n");
        for (String s : arrayFrases){
            System.out.println(s);
        }

        System.out.println("\nLinkedList\n");
        for (String a: listaFrases){
            System.out.println(a);
        }
    }
}
