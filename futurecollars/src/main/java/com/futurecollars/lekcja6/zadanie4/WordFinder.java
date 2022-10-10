package com.futurecollars.lekcja6.zadanie4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordFinder {

    public void getSearchWord(String text) {
        try {
            Path path = Paths.get("src/main/java/com/futurecollars/lekcja6/zadanie4/data.txt");
            String content = Files.readString(path);
            boolean Word = content.contains(text);
            System.out.println(content);
            System.out.println(Word);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
