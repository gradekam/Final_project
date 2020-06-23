package com.company;

public class Warunki {
    public static void main(String[] args) {
        zabawaZIfem();

        int zmienna = 3;
        switch (zmienna) {
            case 1:
                System.out.println("dknmwdkn");
                break;
            case 3:
                System.out.println("ndkcnoe");
                break;
            default:
                System.out.println("najsfno");
                break;
        }

    }

    public static void zabawaZIfem() {
        System.out.println("Początek programu");

        int a = 15;
        int b = 20;
        float c = 2.5f, d = 10.3f;

        if (a < b) {
            System.out.println("a mnijdz od b");
        }
        if (a > b) {
            System.out.println("a wieksze niz b");
        }
        System.out.println("koniec programu");
    }
}
