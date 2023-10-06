package p8_ternary;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir tamsayi alin
        egert 0 dan kucuk ise Ngatif yazdirin
        buyuk ise Negatif degil yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int s = input.nextInt();
        String result = s<0 ? "Negatif"  : "Negatif degil";
        System.out.println(result);

        System.out.println("----------");

        System.out.println("Lutfen 3 kenar uzunlugu giriniz");
        int k1= input.nextInt();
        int k2= input.nextInt();
        int k3= input.nextInt();
        System.out.println((k1 == k2 || k1 == k3 || k2 == k3 ? "Ikizkenar ucgen" : "ikizkenar degil"));

        input.close();
    }




}
