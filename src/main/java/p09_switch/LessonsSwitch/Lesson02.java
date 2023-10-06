package p09_switch.LessonsSwitch;

import java.util.Scanner;

public class Lesson02 {
    public static void main(String[] args) {

        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           ornek; 8 ==> August - September - October - November - December

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen baslangıc ayının kaçıncı ay olduğunu girniz..");
        int numOfMonth = input.nextInt();

        switch (numOfMonth) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Gecerli ay numarasi giriniz../ 1 ile 12 arasinda bir sayi giriniz");


                //default ; else mantiginda calisir, ne olursan gel anlaminda. belirtilen kriterler disindaki her durumu kabul eder


                /* break keywordu cok onemli:
                verilen task de; girilen sayiya denk gelen ayi ve sonraki aylari sonuna kadar yazdir denilmis
                 "break" key wordu en sonunuc ayin sonuna yazilir bu durumda
                 Java, girilen sayiya denk gelen aydan giris yapar, ve "break" keyworduna kadar hepsini yazdirir.
                 Break; Java icin (true-false ararken) kod okurken full stopdur, orada dur der
                 //konumu cok onemlidir, defaulttan once girilmeli ki defaultu da yazdirmasin
                 // defaulttan sonra break yazilmasi gereksizdir, burasi zaten kod sonudur, fazladan yazmaya gerek yoktur

                 eger hepsine "break" girilseydi burada dur demektir javada ve sadece tek bir sayiya denk gelen ayi yazdirir ve dururdu.
                 //girilen sayi "8" ise sadece "August" yazdirirdi

                  ***SWITCH 3 den fazla senaryo var ise kullanilir
                  If den daha basit ve aciktir yazilimi, Java basit sever

                 */

                 /*
                 int numOfMonth = input.nextInt();
                 switch (numOfMonth) {
        Note : switch condition parantezi icine YES> 1) String 2) char  3) byte 4) short 5) int >>  kullanabilirsiniz
               switch condition parantezi icine NO>  1) long 2) boolean 3) float 4) double      >>  kullanilmaz */




        }// switch sonu



    }//main
}
