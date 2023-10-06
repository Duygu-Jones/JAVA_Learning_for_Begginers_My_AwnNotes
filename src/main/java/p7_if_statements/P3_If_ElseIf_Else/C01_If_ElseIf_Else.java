package p7_if_statements.P3_If_ElseIf_Else;

import java.util.Scanner;

public class C01_If_ElseIf_Else {

    /*
    Kullanicidan bir tamsayi alin
    Eger tamsayi 0 dan kucuk ise ekrana "Negatif" yazdirin
    0 ise Notr,
    0 dan buyuk ise poztif yazdirin
     */

    public static void main(String[] args) {

        // 3 farkli condition var, bu yuzden if - else if - else kullanilir

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        double sayi = input.nextDouble();


        if(sayi<0) {
            System.out.println("Negatif");

        }else if (sayi==0){
            System.out.println("Notr");

//        } else if (sayi>0) {
//            System.out.println("Pozitif");

        } else {
            System.out.println("Pozitif");
        }


   //Note:
    //Soruda 3 durum belirtilmis, ilk iki durum if ve else-if ile saglandi, kalan ucundu durum ise
        // son olarak else ile belirtilkdi baska bir durum kalmadigi icin
        //input.nextDouble() olarak veri alindigi icin eger farkli bir karakter girilirse zaten hata verecek almayacak veriyi
        // bu yuzden tekrar else-if ve else belirtmeye gerek yoktur
        // java da her zaman kisa kod var ise kisa yol secilir


    }//




}
