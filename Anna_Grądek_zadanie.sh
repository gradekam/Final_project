#!/bin/bash

kalkulator () {
echo "Witaj w moim kalkulatorze"
    read -p "Proszę podaj liczbę a: " a
    read -p "Proszę podaj liczbę b: " b

    echo "Suma: $((a + b))"
    echo "Różnica: $((a - b))"
    echo "Iloczyn: $((a * b))"
    echo "Iloraz: $((a / b))"
    echo "Potęgowanie: $((a ** b))"
    echo "Dzielenie modulo: $((a % b))"
}

petla_while () {
    while true; do
        read -p "Czy wykonać petlę?: " result
        case ${result} in
          t|Tak|tak|TAK)
                echo "Oczywiście :)"
                continue;;
          n|nie|Nie|NIE)
                echo "Skoro nie chcesz, to przerwę petlę"
                break;;
	  *)
	   echo "Proszę wpisz mi coś, co zrozumiem, po polsku! \"Tak\" lub  \"Nie\" "
	   	continue;;
        esac
    done
}


case ${1} in
    kalkulator) kalkulator;;
    petla) petla_while;;
    *) echo "Aby przetestować funkcje wybierz: kalkulator, petla";;
esac
