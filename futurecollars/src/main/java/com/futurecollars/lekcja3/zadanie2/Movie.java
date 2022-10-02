package com.futurecollars.lekcja3.zadanie2;

public class Movie {

    private String title;
    private String directorFullName;
    private int duration;
    private int productionYear;

    public Movie(String title, String directorFullName, int duration, int productionYear) {
        this.title = title;
        this.directorFullName = directorFullName;
        this.duration = duration;
        this.productionYear = productionYear;
    }

    public String getTitleMovie() {
        return title;
    }

    public String getDirectorFullName() {
        return directorFullName;
    }

    public int getDuration() {
        return duration;
    }

    public int getProducitonYear() {
        return productionYear;
    }

    public void setTitleMovie(String titleMovie) {
        this.title = titleMovie;
    }

    public void setDirectorFullName(String directorFullName) {
        this.directorFullName = directorFullName;
    }

    public void setMovieTime() {
        this.duration = duration;
    }

    public void setProducitonYear(int producitonYear) {
        this.productionYear = producitonYear;
    }
}
