package Drugi_dzien;

public class CiagiZnakowe {

    public static void main(String[] args) {
        String str1 = new String("Test");
        String str2 = new String("Test");
        System.out.println(str1);
        System.out.println(str2);

        if (str1.equals(str2)) {
            System.out.println("te same");
        }
        else{
            System.out.println("Różne");
        }

        System.out.println("Długość stringa: " + str1.length());
        System.out.println(str1.startsWith("Te"));
        System.out.println(str2.isEmpty());
        System.out.println(str2.chars());
        System.out.println(str1.toLowerCase().startsWith("te"));

        String result1 = str1.toLowerCase(); //test
        String result2 = result1.toUpperCase(); //TEST
        char result3 = result2.charAt(2);  //przypisuje S
        System.out.println(result3 + " " + (byte) result3);  //wyświetlam

        System.out.printf("100.0 / 3.0 = %5.2f %2d", 100.0 / 3.0, 10); // wynikiem będzie liczba zmiennoprzecinkowa składająca się z 5-ciu znaków i 2 cyfr po przecinku
        System.out.println();
        System.out.printf("100 / 3 = %4d", 100 / 3); // wynikiem będzie liczba całkowita zajmująca 4 znaki - wynik dzielenia będzie zaokrąglony
    }
}
