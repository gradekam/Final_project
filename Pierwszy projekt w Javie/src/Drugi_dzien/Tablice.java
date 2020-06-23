package Drugi_dzien;

public class Tablice {
    public static void main(String[] args) {
        int[] tablica = {1,5,6,24,2,35,8,2,5,10};

        wyswetlenieTablicyOdPierwszegoElelemtu(tablica);
        System.out.println("---------------------");
        System.out.println(); //znak nowej linii

        wyswieltenieOdOsatniegoElementu(tablica);
        System.out.println("---------------------");
        System.out.println(); //znak nowej linii

        for (int elem : tablica) {
            System.out.println(elem);
        }
        System.out.println("---------------------");
        System.out.println(); //znak nowej linii

        int[] tablica2 = new int[10];//tablica ma 10 elemetów
        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = i;

        }
        wyswieltenieOdOsatniegoElementu(tablica2);
    }

    public static void wyswieltenieOdOsatniegoElementu(int[] tablica) {
        for (int i = tablica.length - 1; i >=0 ; i--) {
            System.out.println(tablica[i]);
        }
    }

    public static void wyswetlenieTablicyOdPierwszegoElelemtu(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}
