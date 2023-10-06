package p7_if_statements.LessonIFStatement;

import java.util.Scanner;

public class If00 {

    public static void main(String[] args) {

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in); //Kullanıcıdan alındığı dediği için
        System.out.println("Lütfen bir sayi giriniz.."); //Kullanıcay mesaj verildi
        int num = input.nextInt(); //verimiz bir sayı olacak ise int data seçilir ve next'li methodu girilir.

        //1.yol: //İf compareson cümlelerinde (şartlı karşılaştırmalı) Data type mutlaka Boolean dır.
        if (num % 2 == 0) { // okunuşu "num(ber) 2'ye böl kalan 0'dır ve 0 ==0 True dur
            System.out.println("Cift sayi..."); //çıktıda "Çift sayı" yazar
        }

        if (num % 2 != 0) {  // eğer number ın 2'ye böl kalan !=0 (eşit değil) ise
            System.out.println("Tek sayi..."); //çıktıda "tek sayı" yazar
        }

        //2.yol:
        //iki durumlu senarylar için Java "İf Else" statement oluşturmuştur.

        if(num%2==0) { //eğer =0 ise
            System.out.println("Cift sayı"); //Cift sayı"

        }else{ //değil ise
            System.out.println("Tek sayı"); //Tek sayı
        }


        /*ÖZET
          Primitive Data Type > Boolean > boolean ==> True / False satatement ynai İf Statement tır.
          bu yüzden İf Statement kodlar boolean dır ve 2 byte yer kaplar hazıfada.

          1. veri kullanıcıdan alınacak ise Scanner class da object oluşturulur
          2. kullanıcıya mesaj verilir
          3. istediğimiz veri tipinde alınacak değer için kod dizimi yazılır

          4. if(){ // koşul belirtilir // if(num%2==0) {
          5. birinci durum için sağlıyor ise çıktıda nasıl görüneceği tanımlanır // System.out.println("Cift sayı");

          6. }else{ // diğer durum için ((num % 2 != 0))
          7. ikinci durum sağlıyor ise çıktıda nasıl görüneceği tanımlanır // System.out.println("Tek sayı");

         */







    }

}
