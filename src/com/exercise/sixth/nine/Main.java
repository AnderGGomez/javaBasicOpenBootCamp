package com.exercise.sixth.nine;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> phoneBook = new HashMap<>();

        try{
            InputStream fileIn = new FileInputStream("src/com/exercise/sixth/nine/phoneBook.csv");;
            PrintStream fileOutNames = new PrintStream("src/com/exercise/sixth/nine/names.txt");
            PrintStream fileOutPhones = new PrintStream("src/com/exercise/sixth/nine/phones.txt");

            phoneBook = readPhoneBook(fileIn);
            ArrayList<String> names = new ArrayList<>(phoneBook.keySet());
            ArrayList<String> phones = new ArrayList<>(phoneBook.values());
            //names = (ArrayList<String>) phoneBook.keySet();
            //phones = (ArrayList<String>) phoneBook.values();

            writeOutFile(names, fileOutNames);
            writeOutFile(phones, fileOutPhones);


        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static Map readPhoneBook(InputStream fileIn) throws IOException {
        Map<String,String> dataPhone = new HashMap<>();

        BufferedInputStream ficheroBuffer = new BufferedInputStream(fileIn);


        BufferedReader reader = new BufferedReader(new InputStreamReader(ficheroBuffer, StandardCharsets.UTF_8));
        String dato = reader.readLine();
        while (dato != null ){
            String[] cadena = dato.split(",");
            String name = cadena[0];
            String phone = cadena[1];
            if( !name.equals("name") && !phone.equals("phone") ){
                dataPhone.put(name,phone);
            }
            dato = reader.readLine();
        }

        return dataPhone;
    }

    public static void writeOutFile(ArrayList<String> list , PrintStream fileOut) throws IOException {
        for (String item:
             list ) {
            String newLine = item+"\r\n";
            fileOut.write((newLine.getBytes()));
        }
    }
}
