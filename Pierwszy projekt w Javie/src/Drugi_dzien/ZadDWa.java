package Drugi_dzien;

import java.util.Scanner;

public class ZadDWa {
    public static void main(String[] args) {
        int liczba = 5;

        int[] tablicaPotega = new int[10];//tablica ma 10 elemetów
        for (int i = 0; i < tablicaPotega.length; i++) {

            tablicaPotega[i] = powerOfNumber(liczba, i);

        }
        wyswetlenieTablicyOdPierwszegoElelemtu(tablicaPotega);

        wypiszPrzerwe();

        for (int i = 0; i < 100; i++) {
            if (i %3 ==0) {
                System.out.println(i);
            }
        }
        wypiszPrzerwe();

        Scanner scanner = new Scanner(System.in);

        float [] tabela3 = new float[3];



        /*for (int i = 0; i < tabela3.length; i++) {
            System.out.println("Podaj liczbe nr " + (i+1) +": ");
            float wartosc = scanner.nextFloat();

            tabela3 [i] = wartosc;
        }

        float suma = 0;
        for (int i = 0; i < tabela3.length; i++) {
            suma = suma  + tabela3[i];

        }
        System.out.println(suma);*/

        wypiszPrzerwe();

        String sexk = "kobieta";
        String sexm = "mężczyzna";
        System.out.println("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj płeć: ");
        String sex = scanner.nextLine();
        if (sex.equals(sexk)) {
            System.out.println("Dzień dobry Pani " + imie);
        }
        if (sex.equals(sexm)) {
                System.out.println("Dzień dobry Panu " +imie);
            }

        }

    public static void wypiszPrzerwe() {
        System.out.println("----------------");
        System.out.println();
    }

    public static int powerOfNumber(int liczbaKtoraChcemyPodnieszcDoPotegi, int potega) {
        int result = 1; //liczba do potegi zerowej
        for (int i = 0; i < potega; i++) {
            result = result * liczbaKtoraChcemyPodnieszcDoPotegi; //result *=number;
        }
        return result;
    }

    public static void wyswetlenieTablicyOdPierwszegoElelemtu(int[] tablica) {
        for (int value : tablica) {
            System.out.println(value);
        }
    }


}
