package com.futurecollars.lekcja3.zadanie3;

public class main {
    public static void main(String[] args) {
        TicketSeller TicektSeller = new TicketSeller("Marek", "Nowak", 2015, 3000);

        System.out.println(TicektSeller.getName());
        System.out.println(TicektSeller.getSurname());
        System.out.println(TicektSeller.getYearOfEmployment());
        System.out.println(TicektSeller.calculateMonthlySalary());

        Manager Manager = new Manager("Jurek", "Owsiak", 2012, 5000,500 );

        System.out.println();
        System.out.println(Manager.getName());
        System.out.println(Manager.getSurname());
        System.out.println(Manager.getYearOfEmployment());
        Manager.setSalaryBonus(700); //Dodaj możliwość zmiany wysokości bonusu dla managera
        System.out.println(Manager.calculateMonthlySalary());

    }
}