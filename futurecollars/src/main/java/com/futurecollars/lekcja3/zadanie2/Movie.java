package com.futurecollars.lekcja3.zadanie2;

public class Movie {

    private String titleMovie;
    private String directorFullName;
    private int movieTime;
    private int producitonYear;

    public Movie(String titleMovie, String directorFullName, int movieTimeInMinutes, int producitonYear) {
        this.titleMovie = titleMovie;
        this.directorFullName = directorFullName;
        this.movieTime = movieTimeInMinutes;
        this.producitonYear = producitonYear;
    }

    public String getTitleMovie() {
        return "Tytuł: " + titleMovie;
    }

    public String getDirectorFullName() {
        return "Reżyser: " + directorFullName;
    }

    public String getMovieTime() {
        return "Czas filmu: " + movieTime + " min";
    }

    public String getProducitonYear() {
        return "Rok produkcji: " + producitonYear;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public void setDirectorFullName(String directorFullName) {
        this.directorFullName = directorFullName;
    }

    public void setMovieTime() {
        this.movieTime = movieTime;
    }

    public void setProducitonYear(int producitonYear) {
        this.producitonYear = producitonYear;
    }
}
