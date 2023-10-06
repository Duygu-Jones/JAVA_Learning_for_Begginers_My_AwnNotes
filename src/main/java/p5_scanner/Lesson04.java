package p5_scanner;

import java.util.Scanner;

public class Lesson04 {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz //"Kullanıcı" kelimesini görünce Scanner olduğunu anlayalım
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz...");
        float shortSide = input.nextFloat();

        System.out.println("Dikdortgenin uzun kenar uzunluğunu giriniz...");
        float longSide = input.nextFloat();

        System.out.println("Alan = " + (shortSide * longSide));
        System.out.println("Cevre = " + (2*shortSide + 2*longSide));


        //verilen task içerisinde "user" kelimesi ve veri alacağımızı görünce Scanner class dan bir "object" oluşturlur
        //istenilen görevler için tek tek tanımlama yapılır mesaj verilir
        //her bir mesaj ardına için kod yazılır
        //çıktı için işlem tanımlanır, etiketli isteniyorsa .....("isim = " + (işlemler));
        //örnek >> System.out.println("Alan = " + (shortSide * longSide));






    }
}
