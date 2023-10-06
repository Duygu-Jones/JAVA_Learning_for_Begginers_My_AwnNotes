package p7_if_statements.P04_Nested_If;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin

        Eger sayi pozitif ise 10'dan buyuk olup olmadigina bakin
        Eger sayi 10 dan buyuk ise (Buyuksun)
        Eger 10 dan kucuk ise (Normalsin )yazdir

        Eger sayi poztif degil ise -10 dan buyuk olup olmadigina bakin
        Eger -10 dan buyuk ise (Negatifsin)
        Eger -10 dan kucuk ise (cok negatifsin) yazdirin
         */


        Scanner input =new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int sayi = input.nextInt();

        //NESTED IF===> OUTTER-IF      // Inner-if

        if (sayi > 0) {
            if (sayi>10) {
                System.out.println("Buyuksun");

            }else {
                System.out.println("Normalsin");
            }

        }else {

            if (sayi >-10) {
                System.out.println("Negatifsin");
            }else {
                System.out.println("Cok negatifsin");
            }
        }
        input.close();









    }




}
