package com.futurecollars.lekcja6.zadanie1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {
    public void printFileContent() {
        try {
            Path path = Paths.get("src/main/java/com/futurecollars/lekcja6/zadanie1/data.txt");
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
