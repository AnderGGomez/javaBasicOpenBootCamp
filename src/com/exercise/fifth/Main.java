package com.exercise.fifth;

import com.exercise.fifth.impl.CocheCRUDImpl;
import com.exercise.fifth.interfaces.CocheCRUD;

public class Main {
    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
