package com.exercise.sixth.reverseString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = scan.nextLine();

        String cadena = reverse(frase);
        System.out.println("La frase al reves es: \n"+cadena);
    }

    public static String reverse(String texto) {
        String cadenaAlReves = "";
        for (int i = 0; i < texto.length() ; i++) {
            char a = texto.charAt(i);
            cadenaAlReves = a + cadenaAlReves;
        }
        return cadenaAlReves;
    }
}

