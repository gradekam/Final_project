package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        System.out.println("Hello World");
        System.err.print("Błąd");
        System.out.println("następny komunikat");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj sowje imie: ");
        String imie = scanner.nextLine();
        System.out.println("odczytane imię to " + imie);
        */
        Scanner scanner = new Scanner(System.in);
        Kwadrat pierwszyObiektTypuKwadrat = new Kwadrat();

        pierwszyObiektTypuKwadrat.a = scanner.nextInt();

        int polePowierzchni = pierwszyObiektTypuKwadrat.policzPole();

        System.out.println("Pole wynosi: " + polePowierzchni);
    }
}
