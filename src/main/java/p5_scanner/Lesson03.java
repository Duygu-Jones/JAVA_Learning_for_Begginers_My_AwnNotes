package p5_scanner;

import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in); //1.adım Scanner da object oluşturuldu

        System.out.println("Lütfen iki sayı giriniz..."); //mesaj verildi >> 4 ve 5 sayılarını kullan
        double firstnumber = input.nextDouble();
        double secondnumber = input.nextDouble();

        System.out.println("toplam = " + (firstnumber + secondnumber) );
        System.out.println("cikarma = " + (firstnumber - secondnumber) );
        System.out.println("carpma = " + (firstnumber * secondnumber) );
        System.out.println("bolme = " + (firstnumber / secondnumber) );

        //ÖZET:
        // etiket yazdırma yani çıktıda nasıl görüneceği ve nasıl işlem yapılacağını gösteren kısım
        //data yı double seçme nedeni, kullanıcı nın hangi sayıyı gireceği belli değil çok büyük küsüratlı sayı girebilir
        //bolme ve carpma isleminin oldugu her veri Double olarak girilmeli
        //etiketsiz sacede yapılan işlemin sonucunu görmek için düz de yazılabilir;
        // Örnek >> System.out.println("firstnumber + secondnumber); // çıktı>> "9"
        // etiketli yazım>> System.out.println("toplam = " + (firstnumber + secondnumber) ); //çıktı>> "toplam = 9.0"



    }
}
