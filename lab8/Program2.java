package ru.mirea.gib04.lab8;

import java.io.IOException;
import java.nio.charset.*;
import java.nio.file.*;

public class Program2 {
    public static void main(String[] args) throws IOException {
        String fileName = "Note.txt";
        String search = "Hello Everyone!";
        String replace = "Всем привет!";
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(fileName);
        Files.write(path,
                new String(Files.readAllBytes(path), charset).replace(search, replace)
                        .getBytes(charset));
    }
}