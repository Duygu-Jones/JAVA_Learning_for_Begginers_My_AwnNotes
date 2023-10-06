package p7_if_statements;

import java.util.Scanner;

public class C01_Logical_Operator {
    public static void main(String[] args) {

        /*
        Logical Operators (Mantik Islemleri)

        1)"AND" operator:  Sembolu==> "&" veya "&&" dir; && sembolu daha hizli calisir, bu yuzden genellikle && kullanilir
        (&& cift sembol condition True/False kontol edeerken bir tarafi kontorl eder
        & tek sembol ise her iki tarafi da kontrol ettigi icin daha yavastir

            true && true  = true
            true && false = false
            false && true = false
            fasle && false = false

            * bir tane false olmasi sonucun False olmasi icin yeterlidir, && operatoru mukemmeliyetcidir

         2) "OR" operator: Sembolu==> "||" dir ; cift cubuk
            true && true  = true
            true && false = true
            false && true = true
            fasle && false = false
            * OR operatoru ise cok rahat relactir sadece bir tane true ile yetinir sonuc true olmasi icin.

         3) "NOT" operator; Sembolu ==> "!" dir. (Exclamation MArk)
            !True (dogru degildir)   = False
            !False (Yanlis degildir) = True

        */

        /* Example:
        Kullanicidan bir Tamsayi alin,
        Sayi 3 basamakli ise console'a "3 Basamakli" yazdirin
        Sayi 2 basamakli ise console'a "2 Basamakli" yazdirin
        Sayi 3 basamakli veya 2 basamakli degil ise console'a "Ikisinde degil" yazdirin
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int a = input.nextInt();

        if (a>99  && a< 1000){
            System.out.println("3 Basamaklidir");
        }
        if (a>9 && a<100){
            System.out.println("2 Basamaklidir");
        }
        if (!(a>99  && a< 1000) && !(a>9 && a<100)){ // && olmali ki birinin false olmasi digerini de false algilar sonuc false olmali
            System.out.println("Ikiside degildir");
        }

        input.close();


    }//




}//
