package p7_if_statements.P2_If_Else;

import java.util.Scanner;

public class If_Else2 {
    public static void main(String[] args) {

        /*Example1;
        Kullanicidan bir character aliniz.
        Bu character harf ise console'a "Harf" yazdirin
        Degil ise console'a "harf Degildir" yazdirin.
               */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz");
        char ch = input.next().charAt(0);

        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            System.out.println("Harf");
        }else {
            System.out.println("Harf Degildir");
        }


        /*Example2:
        Kullanicidan bir sayi aliniz ve tamsayinin mutlak degerini ekrana yazdirin
        a>=0 ise ==>Mutlak deger=a
        a<0  ise ==>Mutlak deger= -a
         */

        System.out.println("==============");

        System.out.println("Lutfen bir integer giriniz");
        int a = input.nextInt();

        if (a>=0){
            System.out.println(a);
        }else {
            System.out.println(-a); //  (-a) veya (-1*a) seklinde de yazilabilir
        }









    }



}
