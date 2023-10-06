package p7_if_statements.P04_Nested_If;

import java.util.Scanner;

public class NestedIf04 {
    public static void main(String[] args) {

        /*
        Kullanicidan password girmesini isteyin

        Girdigi password 5'e bol ise son rakamini kontrol edin
        Son rakam 0 ise ekrana 5 bol cift sayi yazdirin
        Son rakam 0 degil ise 5'e bol tek sayi yazdirin

        Girilen password 5'e tam bol ise ekrana Tekrar deneyin yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Password giriniz");
        int pwd = input.nextInt();;

        if (pwd%5 ==0) {
            if (pwd %10==0) {
                System.out.println("5'e bolunen cift sayidir");
            }else {
                System.out.println("5'e bolunen tek sayidir");
            }

        } else {
            System.out.println("Tekrar deneyin");

        }

        input.close();

    }


}
