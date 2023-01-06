package com.futurecollars.lekcja6.zadanie3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CharacterCounter {

    public void printNumberOfCharacters() {
        try {
            Path path = Paths.get("src/main/java/com/futurecollars/lekcja6/zadanie5/data.txt");
            String content = Files.readString(path);
            System.out.println(content.length());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}