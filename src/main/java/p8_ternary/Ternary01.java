package p8_ternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int s = input.nextInt();

        if (s>9)   {System.out.println("Rakam degil");}  else   {System.out.println("Rakam");} //===> if-else conditions

        String result = s>9 ? "Rakam degil" : "Rakam";          //ternary yazim bicimi= her zaman bir dataya atama yap yani sepete koy
        System.out.println(result);


        System.out.println((s > 99 && s < 1000 ? "3 basamakli" : s));   // data type lari farkli ise; data type icine atamakla ugrasma direk SOUT !!

        input.close();
    }

}
