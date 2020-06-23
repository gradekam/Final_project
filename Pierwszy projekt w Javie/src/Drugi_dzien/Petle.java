package Drugi_dzien;

public class Petle {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": jestem w petli");
            if (i == 2) {
                break;
            }
        }
        System.out.println("jestem poza petla");

        powerOfNumber(5,3);

        int index = 10;
        while (index >= 0) {
            if (index % 3 ==0){
                index--;
                continue;
            }
            if (index !=0){
            System.out.println(index);
            }
            if (index ==0) {
            System.out.println("Boom");
            }
            index--;
        }


        do{
            if (index > 0){
                System.out.println(index);
            }
            else  {
                System.out.println("Boom");
            }
            index--;
        }while (index >=0);

    }

    public static void powerOfNumber(int liczbaKtoraChcemyPodnieszcDoPotegi, int potega) {
        int result = 1; //liczba do potegi zerowej
        for (int i = 0; i < potega; i++) {
            result = result * liczbaKtoraChcemyPodnieszcDoPotegi; //result *=number;
        }
        System.out.println(result);
    }
}
