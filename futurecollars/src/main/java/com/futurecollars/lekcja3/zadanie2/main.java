package com.futurecollars.lekcja3.zadanie2;

public class main {
    public static void main(String[] args) {

        Movie movie = new Movie("Avatar", "James Cameron", 180, 2009);

        System.out.println(movie.getTitleMovie());
        System.out.println(movie.getDirectorFullName());
        System.out.println(movie.getDuration());
        System.out.println(movie.getProducitonYear());
    }
}
