package p09_switch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*
        Kullanicidan ay ismini girmesini isteyin
        girilen ayin kac gun oldugunu yazdiran kod olusturun
         */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz");
        String mounthName = input.next();

        switch (mounthName.toLowerCase()){
            case "january":
            case "march":
            case "may":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println(31);
                break;
            case "February":
                System.out.println("28 veya 29");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println(30);
                break;


            default:
                System.out.println("Gecerli bir ay ismi giriniz");

        }












    }
}
