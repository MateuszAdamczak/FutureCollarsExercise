package com.futurecollars.lekcja6.zadanie0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Files.writeString(Paths.get("src/main/resources/data.txt"), "Kurs\n" + "Java\n" + "Lekcja 6\n" + "Pliki\n" + "Wyjątki\n" + "Pliki\n" + "Koniec pliku");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
