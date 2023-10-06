package p5_scanner;

import java.util.Scanner;

public class Lesson02 {

    public static void main(String[] args) {

        /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */


        Scanner input = new Scanner(System.in); //Object oluşturan kalıp kod dizilimidir. Class basinda bir kez yapilmasi yeterli

        System.out.println("Adinizi ve Soyadinizi giriniz"); //Kullanıcıya mesaj verildi
        String fullName = input.nextLine(); //2 kelimelik
        System.out.println("fullName = " + fullName);// etiket yazdırma; ciktida nasil yazilacaini gosteriyoruz
        //etiket yazıdırmak için kısa yol kelime.soutv >>> enter tıkla (fullName.soutv > enter)

        /* NOTES;
        nextLine() method u kullanicidan cok kelimeli string almak icin kullanilir; İsim ve soyisim 2 kelime.
        String data tipinde "input.next ();" veya "input.nextLine ();" medhodu kullanılır.
        Object (Nesne);
        -Functionality (Method) == Aktif özellikleri getirir (hareket, taşıma.. vs)
        -Feature (Fields/Variables) == Pasif özellikler (renk, şekil, isim vs)
        Application: ise Üründür. >>>>sout
        */

        System.out.println("Yasinizi giriniz..");
        byte age = input.nextByte();
        System.out.println("age = " + age);

        System.out.println("Boyunuzu giriniz..");
        float height = input.nextFloat();
        System.out.println("height = " + height);

        System.out.println("Kilonuzu giriniz..");
        short weight = input.nextShort();
        System.out.println("weight = " + weight);

        System.out.println("Medeni durumunuzu giriniz..");
        //next() methodu kullanicidan tek kelimeli string almak icin kullanilir
        String maritalStatus = input.next();
        System.out.println("maritalStatus = " + maritalStatus);

        /*NOTES
        next (); buradaki parantezin boş olmasının sebebi, kullanıcıdan alınan veri için bekler, gelen veri temsili oraya gelir,
        oradan da data type ın bulunduğu  isim kavanozuna atar (=) assignment operatorü ile.
        gelen veriyi ve bu ismi ilişkilendirmiş olur
        next.... data type na gore secilir, methoddur yani functional aktiftir
        /*
        OZET:
        Standart gorevler (main method - Scanner object kod kalibi yaz)
        1-Main Class olurturulur >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> "public static void main (String [] args) {} "

        2-Object olusturmak icin >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"Scanner" kullanilir
        3-Scanner icerisinde de Scanner kod kalibi yazilir (stracture) >>>> "Scanner input = new Scanner(System.in);

        Fonsiyonel gorevler (mesaj ver-veriyi tanimla kodla- veriyi cek- yazdir)
        4-Kullaniciya mesaj verilir >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> "System.out.println("Adinizi ve Soyadinizi giriniz"); "
        5-Verilen mesajin kodu yazilir - veri tipine gore data Type sec;
          yani kullanicidan alinacak veriyi sisteme cekecek kod>>>>>>>>>>>> "String fullName = input.nextLine ();
        6-son olarak da etiteki ile yazdirma/ciktida nasil gorunecegi>>>>>>> "System.out.println("fullName: " + fullName);


         */




    }
}
