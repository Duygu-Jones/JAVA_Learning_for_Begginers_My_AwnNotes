package p7_if_statements.P3_If_ElseIf_Else;

import java.util.Scanner;

public class C03_If_ElseIf_Else {
    /*
    Kullanicidan notunu alin ve asagidaki gibi harflendirme yapiniz
    not<50 ise     D
    50<=not<60 ise C
    60<=not<80 ise B
    80<=not<=100 ise A veriniz
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int score = input.nextInt();  // sadece sayilari kabul eder, farkli bir karakter girilirse eger hata verir

        if (score<0) { //<0 durumu icin.
            System.out.println("Gecerli bir not giriniz");


        }else if (score < 50) {
            System.out.println("D");

        } else if (score<60) {
            System.out.println("C");

        } else if (score<80) {
            System.out.println("B");

        }else if(score<=100){
            System.out.println("A");



        }else {   // >100 durumu icin.
            System.out.println("Gecerli not giriniz");
        }


    }




}
