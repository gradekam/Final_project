package com.company;

public class Uczen {
    public static void main(String[] args) {
        Kalkulator.dodawanie(1L, 20L);
        Kalkulator.dodawanie(1.2f,2.5f);

        Kalkulator casio = new Kalkulator();
        casio.odejmowanie(5,3);
        casio.zwieksz0Jeden(5);
    }
}
