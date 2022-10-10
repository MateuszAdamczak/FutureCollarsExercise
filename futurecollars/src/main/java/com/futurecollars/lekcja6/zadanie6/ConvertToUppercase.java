package com.futurecollars.lekcja6.zadanie6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertToUppercase {

    public void wordsConventer() {
        try {
            Path path = Paths.get("src/main/java/com/futurecollars/lekcja6/zadanie6/data.txt");
            String content = Files.readString(path);
            String wordsConventer = content.toUpperCase();
            Files.writeString(Path.of("src/main/java/com/futurecollars/lekcja6/zadanie6/output.txt"), wordsConventer);
            System.out.println(wordsConventer);
        } catch (IOException exception) {
            exception.printStackTrace();

        }
    }
}