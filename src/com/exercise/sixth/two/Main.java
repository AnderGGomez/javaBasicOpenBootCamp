package com.exercise.sixth.two;

public class Main {
    public static void main(String[] args) {
        int matriz[][] = {{1,3,5,7},{2,4,6,8}, {100,200,300,400}};
        int tamFila = matriz.length;
        int tamCol = matriz[0].length;
        for (int i = 0; i < tamFila; i ++){
            System.out.println("Fila : "+i);
            for (int j = 0; j < tamCol; j++) {
                System.out.println("Columna: "+j+" Valor: "+matriz[i][j]);
            }
        }

    }
}
