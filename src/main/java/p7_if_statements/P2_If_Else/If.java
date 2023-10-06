package p7_if_statements.P2_If_Else;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        /*
    Kullanicidan bir karakter alin.
    Bu character buyuk harf ise "Buyuk Harf" yazdirin.
    Bu character kucuk harf ise "Kucuk Harf" yazdirin.
    Bu character harf degil ise "Harf Degil" yazdirin.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir character giriniz");
        char ch = input.next().charAt(0);

        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }
        if (ch>='a' && ch<='z') {
            System.out.println("Kucuk Harf");
        }
        if (!(ch>='A' && ch<='Z') && !(ch>='a' && ch<='z')) {
            System.out.println("harf Degil");
        }
        input.close();




    }//




}
