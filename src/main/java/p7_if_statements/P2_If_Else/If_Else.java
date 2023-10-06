package p7_if_statements.P2_If_Else;

import java.util.Scanner;

public class If_Else {

    /*Kullanicidan bir sayi aliniz.
    Sayi negatif ise "Negatif Sayi" yazdiriniz
    Degil ise "negatif Degil" yazdiriniz

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int a = input.nextInt();

        if (a >= 0) {
            System.out.println("Negatif Degil..");
        }else {
            System.out.println("Negatif Sayi");
        }


        System.out.println("======================");




        if (a >= 0) {
            System.out.println("Negatif Degil..");
        }
        if (a<0){
            System.out.println("Negatif Sayi");
        }
        input.close();


        /*
        Yukardaki if-else ve if-if statementler ayni kodlardir ayni sonucu verir
        FAKAT;
        if-else sadece 1 tane condition icerir
        if-if ise 2 tane condition icerir.
        Java her condition u kontrol etmek zorundadir bu da Java'yi yavaslatir yorar.

        Her zaman clean, simple code yazalim tercih edelim.
         */






    }


}
