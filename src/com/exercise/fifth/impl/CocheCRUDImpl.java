package com.exercise.fifth.impl;

import com.exercise.fifth.interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Metodo Guardar");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo buscar todos");
    }

    @Override
    public void delete() {
        System.out.println("Metodo borrar");
    }
}
