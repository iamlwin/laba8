package ru.mirea.gib04.lab8;

import java.io.*;

public class Program {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("Note.txt", false))
        {
            // запись всей строки
            String text = "Hello Everyone!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('1');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}