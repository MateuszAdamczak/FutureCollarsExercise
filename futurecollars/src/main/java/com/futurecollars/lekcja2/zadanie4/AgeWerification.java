package com.futurecollars.lekcja2.zadanie4;

public class AgeWerification {
    public static void main(String[] args) {
        System.out.println(ageWerification(15));
        System.out.println(ageWerification(22));
    }


    public static String ageWerification(int age) {
        String result;
        if (age >= 18) {
            return "Pełnoletni";
        }
        return "Niepełnoletni";
    }
}
