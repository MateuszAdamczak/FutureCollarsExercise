package com.futurecollars.lekcja5.zadanie1;

public class WordInformant {

    private static String text;

    public WordInformant(String text) {
        this.text = text;
    }

    public static boolean isEmpty() {
        return text.isEmpty();
    }

    public static boolean isPalindrome() {
        boolean result = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }

    public static int getTextLength() {
        return text.length();
    }

    public static void wordInformant() {
        if (!isEmpty()) {
            System.out.println(isPalindrome());
            System.out.println(getTextLength());
        } else {
            System.out.println("Dodaj znaki");
        }
    }
}




