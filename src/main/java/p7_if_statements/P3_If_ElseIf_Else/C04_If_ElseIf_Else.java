package p7_if_statements.P3_If_ElseIf_Else;

import java.util.Scanner;

public class C04_If_ElseIf_Else {
    /*
    Kullanicidan bir yil girmesini isteyiniz
    Eger yil 1000'e bol ise "Mileniyum" yazdiriniz
    Eger yil 100'e bol ise "Yuzyil" yazdiriniz
    Eger yil 1000'e bol ise "Onyil" yazdiriniz
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int year = input.nextInt();

        if (year<=0){
            System.out.println("Yil 0 veya negatif bir deger olamaz");
        } else if (year%1000==0) {
            System.out.println("Mileniyum");
        } else if (year%100==0) {
            System.out.println("Yuzyil");
        } else if (year%10==0) {
            System.out.println("Onyil");
        }else {
            System.out.println("Hicbiri");
        }


    }
}
