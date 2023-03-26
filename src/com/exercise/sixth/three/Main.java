package com.exercise.sixth.three;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vec = new Vector(5);
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);

        vec.remove(1);
        vec.remove(2);

        System.out.println(vec.toString());
    }
}
