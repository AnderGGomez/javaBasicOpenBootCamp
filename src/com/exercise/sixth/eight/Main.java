package com.exercise.sixth.eight;

import java.io.*;

public class Main {
    public static void main(String[] args) {


        try{
            InputStream fichero = new FileInputStream("src/com/exercise/sixth/eight/phoneBook.csv");;
            PrintStream out = new PrintStream("src/com/exercise/sixth/eight/destino.txt");

            copyFile(fichero, out);

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    public static void copyFile (InputStream fileIn, PrintStream fileOut) throws IOException {
        BufferedInputStream ficheroBuffer = new BufferedInputStream(fileIn);
        int dato = ficheroBuffer.read();
        while (dato != -1 ){
            fileOut.write(dato);
            dato = ficheroBuffer.read();
        }
    }
}
