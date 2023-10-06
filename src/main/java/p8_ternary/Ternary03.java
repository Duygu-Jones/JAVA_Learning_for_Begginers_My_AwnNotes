package p8_ternary;

import java.util.Scanner;

public class Ternary03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen urun miktarini sayi olarak giriniz");
        int miktar = input.nextInt();
        System.out.println("urun birim fiyatini giriniz");
        double fiyat = input.nextDouble();

        double topMiktar = miktar>1000  ?   fiyat*miktar*0.9    :   fiyat;  //10'da 1'i cikarsa 0.9 kalir ve kalanla carpma yap kisa yol
        System.out.println(topMiktar);

        input.close();



    }
}
