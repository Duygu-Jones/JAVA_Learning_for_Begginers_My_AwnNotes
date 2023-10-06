package p09_switch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        kullanicidan ay ismini alin
        kacinci ay odugunu yazdirin

         */


        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz");
        String month = input.next();

        switch (month.toLowerCase()) {
            case "january" -> System.out.println(1);
            case "february" -> System.out.println(2);
            case "march" -> System.out.println(3);
            case "april" -> System.out.println(4);
            case "may" -> System.out.println(5);
            case "June" -> System.out.println(6);
            case "July" -> System.out.println(7);
            case "August" -> System.out.println(8);
            case "September" -> System.out.println(9);
            case "October" -> System.out.println(10);
            case "November" -> System.out.println(11);
            case "December" -> System.out.println(12);
            default -> System.out.println("Gecerli bir ay ismi giriniz");
        }





















    }
}
