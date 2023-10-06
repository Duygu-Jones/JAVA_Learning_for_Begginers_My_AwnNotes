package p7_if_statements.LessonIFStatement;

import java.util.Scanner;

public class If05 {
    public static void main(String[] args) {

         /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
               (0 <= X <= 120) olmalı

               Eger calisan kadin ise;
                60 yasindan buyukse "Emekli Olabilir "yazdirin

               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */
        //Nested-İnner-Outter yapılar; içiçe-gömülü yapılar

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetiniz");
        String gender = input.next();

        System.out.println("Yaşınız");
        int age = input.nextInt();
        //girişte user a 2 ana mesaj verdik, (cinsiyet ve yaş) önemli filtrelerdir

        if (age<0 || age>120) { //değerleri 0 ile 120 olmalı şartlı ifadeyi yani filtreyi ilk başa konmalı.
            System.out.println("Lütfen yaşı 0 ile 120 arasında giriniz");

        }else if (gender.equalsIgnoreCase("Kadın") ) {
            if (age >60) {
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Calışmalı..."); // kadin grubu icin diger yas araligini ifade eder
            }

        } else if (gender.equalsIgnoreCase("Erkek")) {

            if (age>65) {
                System.out.println("Emekli olabilir");

            } else {
                System.out.println("Calışmalı"); // erkek grubu icin 65 den kucuk ise "calismali" yazdirir

            }

        } else{
            System.out.println("Tanımlı değil..."); // buradaki else cinsiyet icin filtrleme yapiyor
        }


        /* OZET

        if .......... sout....
            if ........sout....
            else..........sout....

        else if ......sout....
            if.........sout....
            else........ sout....

        else .......  sout....

         */

        //Nested yani bu sekildeki içiçe yapıların kullanılması pek tavsiye edilmiyor.


    }//main


}
