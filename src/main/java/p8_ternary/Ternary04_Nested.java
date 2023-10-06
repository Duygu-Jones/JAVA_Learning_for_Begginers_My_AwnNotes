package p8_ternary;

import java.util.Scanner;

public class Ternary04_Nested {

    public static void main(String[] args) {


        /*
        Kullanicidan bir tamsayi girmesini isteyin

        sayi 3 basmakli ise "3 Basmakli" yazdir
            3 basmakli degil ise cift olup olmadiigni kontrol et
                    Cift ise "Cift sayi" yazdir
                    Degilse "3 basmakli olmayan tek sayi " yazdir
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int sayi = input.nextInt();

        String result = sayi>99 && sayi<1000 ? "3 Basamakli" : (sayi%2==0 ? "3 basmakli olmayan Cift sayi" : "3 basamakli olmayan tek sayi");
        System.out.println(result);


        input.close();





    }

}
