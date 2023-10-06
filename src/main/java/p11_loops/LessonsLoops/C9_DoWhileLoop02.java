package p11_loops.LessonsLoops;

import java.util.Scanner;

public class C9_DoWhileLoop02 {
    public static void main(String[] args) {

        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */


        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lutfen bir sayi giriniz");
            int num = input.nextInt();

            if (num >= 100) {
                System.out.println("Kazandiniz");
            }else {
                System.out.println("Kaybettiniz!!");
                break;
            }

        }while (true); //sonsuz dongu olusturuldu "true" ile



    }//main
}
