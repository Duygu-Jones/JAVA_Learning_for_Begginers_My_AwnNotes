package p8_ternary;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Ternary05_Nested {
    /*
    artik yil(leap year)
        100'e bol yilardan 400'e bolunenler artik yildir
        100'e bol.meyenlerden 4'e bol ler artik yildir
    Kullanicidan alinan yilin artik yil olup olmadigini belirleyen kodu yaziniz
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int year = input.nextInt();;

       String result=  year%100==0 ? (year%400==0 ? "Artik yil" : "Artik yil degil") : (year%4==0 ? "Artik yil" : "Artik yil degil");
        System.out.println(result);
        input.close();








    }


}
