package com.company;

public class Kalkulator {

    public static void main(String[] args) {
        long a = 5L;
        long b = 6L;

        dodawanie(a, b);
        dodawanie(10.2f, 20.4f);
    }

    public static void dodawanie(long a, long b) {
        long result = a + b;

        System.out.println(a + " + " + b + " = " + result);
    }

    public static void dodawanie(float a, float b) {
        float result = a + b;

        System.out.println(a + " + " + b + " = " + result);
    }

    public void odejmowanie(int a, int b){
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }
    public void zwieksz0Jeden(int a){
        //przypisanie nowej wartosci do zmiennej
        int result = a + 1;
        showResultAndA(a, result);

        //zwiekszenie wartosci o 1
        a = a +1;
        showResultAndA(a, result);
        //zwiekszenei wartosci o jeden, krótszy zapis
        a +=1;
        showResultAndA(a,result);
        //zwiekszanie warotisc zmiennej o 1 najkrótszy
        a++;
        showResultAndA(a,result);
    }

    public void showResultAndA(int a, int result) {
        System.out.println("result =" +result);
        System.out.println("a =" + a);
        System.out.println("----------------");
    }
}
