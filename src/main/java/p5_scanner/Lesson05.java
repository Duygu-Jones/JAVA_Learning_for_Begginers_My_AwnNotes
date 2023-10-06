package p5_scanner;

import java.util.Scanner;

public class Lesson05 {

    public static void main(String[] args) {

        /*Kullanicidan alacaginiz 5 basamakli bir sayinin;
        ilk iki ve son iki basamagindaki rakamlarin toplamini yazdiran kodu yaziniz.*/
        //kullanılacak sayımız    ==>   45678
        //print ==> 45 + 78 = 123 şeklinde yazdırınız

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz..");
        int num = input.nextInt(); //45678 beş basmaklı sayının girileceği ve atanacağı yer //("num" etiketine 45678 beş basmklı sayısı atandı

        //bir tamsayiyi 1000 e bölersek son 3 basamağı silmiş oluruz java da.
        int firstTwo = num/1000; // "firstTwo is 45"

        // % ==> Modulud Operator : solunda bulunan sayının, sağında bulunan sayıya bölümünden kalanını verir.
        // örnek : dolayısıyla %10 her zaman  bize birler basamağında bulunan sayıyı verir.

        int lastTwo = num%100; // num >>> yani 45678 sayısının 100 ile böl kalan demek ve int data types(en büyük tam sayı datası)
        System.out.println(firstTwo + lastTwo); //sample print 45 + 78 sonuç >>> "123"
        System.out.println("toplam: " + (firstTwo + lastTwo)); // etiketli print >> "toplam = 123"  //parantez ile işlem önceliğine dikkat, yoksa sıralı birleştirir





        /*ÖZET;
        Scanner class da object oluşturuldu //>> Scanner input = new Scanner(System.in);
        kullanıcıya msj verildi // >> System.out.println("5 basamakli bir sayi giriniz..");
        mesajdan gelecek verinin etiketi yani tanımlı kodu yazıldı // >>> int num = input.nextInt(); //kullanıcının girdiği 5 basmaklı sayı 45678;
        (45678 sayısı input.nextInt(); methodu ile sisteme alındı, ve = assignment operatörünün solunda bulunan "num" etiketli "int" data type kutusuna atadı-tanımladı
        num dediğimiz yerde bu sayı kasdedilmiş oluyor.

        task da tam sayı istendiği için int data type seçilir, tam sayılar(integers) içinde en büyük ve düzgün data int. (byte-short-int-Long(Long da L koymak gerekir pek tercih edilmez;num/1000L;)

        Java küsüratlı sayı sevmez, virgülden sonrasını görmez
        Bu yüzden 5 basamaklı bir sayıyı; 45678 i 1000 e bölersek 3 sıfır nedeniyle 45,678 olur
        ve virgülden sonrasını görmez bize ilk iki basabağı kalır task da istenildiği gibi.
         ilk iki basmak için tanım kodu >>> int firstTwo = num/1000; // 45


        Java da beş basamaklı bir sayının son iki (birler ve onlar) basamağını elde etmek için ise
        "modulus operator (%)" kullanılır >>>> kalan bulunur,
        45678 sayısından 78 elde etmek için sayının 100 ile böl kalan 78 şeklinde bulunur
        yani son iki basamak için tanım kodu yazılır >>>> int lastTwo = num % 100;   // 78

        sample print 45 + 78 sonuç >>> "123" //>>> System.out.println(firstTwo + lastTwo);
        etiketli print >> "toplam = 123"  // >>> System.out.println("toplam: " + (firstTwo + lastTwo));
        parantez ile işlem önceliğine dikkat, yoksa sıralı birleştirir yazdırır

         */


    }
}
