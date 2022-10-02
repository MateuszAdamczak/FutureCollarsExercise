package com.futurecollars.lekcja2.zadanie4;

public class AgeVerification {
    public static void main(String[] args) {

        System.out.println(isAdult(15));

    }


    public static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}
