package p7_if_statements.LessonIFStatement;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {

         /*
             Example 3:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz...");
        int age = input.nextInt();

        if (age<0) {
            System.out.println("Geçerli bir yas giriniz");

        } else if (age<5) {
            System.out.println("Bebek");
        }else if (age<13) {
            System.out.println("Cocuk");
        }else if (age<21) {
            System.out.println("Genc");
        }else if (age<31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanımlanmamış yas..."); // task da boyle istenmis; yoksa;

            //if (age<0 || age>31) {
            //System.out.println("Lutfen 0 ile 30 arasinda bir sayi giriniz"); // seklinde de ilk tanimlama yapilabilirdi

        }//Note; verilen değerlerin kodları yazılırken ya tam sağdan yada tam soldan baştan başlanmalıdır
        //yani ilk (0-4), ikinci(5-12), ucuncu(13-20), dorduncu (21-30) araligin kod dizilimi yazilir
        //bu aralıklar tanımlanmalı, negatif ve pozitif değerleri test etmeye gerek yoktur, aralık şartı verilmiş zaten.


        /* ÖZET
        veri alınacak ise Scanner class da object oluştur //  Scanner input = new Scanner(System.in);
        ilk mesajı veriniz //System.out.println("Lütfen yasınızı giriniz...");
        alınacak verinin gideceği yer kod dizilimi // int age = input.nextInt();

        Hatalı giriş için ilk filtreyi oluştur>> negatif bir değer girerse eğer //if (age<0) {
        hatalı girşler için mesajı yazdırınız //System.out.println("Geçerli bir yas giriniz");

        istediğiniz yaş aralıklarını tanımlayınız (Sayı doğrusu gibi düşün)
        } else if (age<5) { // yukarda filtre ile 0 dan büyük bir rakam olduğunu belirttik,
            System.out.println("Bebek"); //5 den küçük ise  "bebek" yazdır

        }else if (age<13) { //bir önceki aralığın son değeri bir sonraki aralığın belirleyici oluyor zaten
            System.out.println("Cocuk"); //13den küçük ise "çocuk" yazdır

        }else if (age<21) {
            System.out.println("Genc"); //21den küçük ise "genc" yazdır

        }else if (age<31) {
            System.out.println("Yetiskin"); //31 den küçük ise "yetişkin" yazdır


        } else {
            System.out.println("Tanımlanmamış yas..."); //tek tek belirtilen aralıklar dışında bir sayı ise geçersiz-tanımsız

            //Java nın matematği çok iyidir, verilen sayının hangi aralıkta olduğunu çok iyi bilir.
            //sen yeterki tanımlamayı iyi ve açık yap

         */


    }//main



}
