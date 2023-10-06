package p09_switch;

import java.util.Scanner;

public class Switch01 {

    /*
    Switch() statement if-else-if ile ayni isi yapar
    Switch() statement daha kolay yazilir ve okunur
    2'den fazla durum var ise if-else-if yerine tercih edilir, daha okunur oldugu icin
     */

    /*
    SORU:
    Kulllanici hafta gununun numarasini girsin ve kod haftanin gununu  print etsin==> 7 gun, 7 farkli durum var
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen haftanin kacinci gununde oldugunu yaziniz");
        int day = input.nextInt();

        //if-else-if:
        if (day==1){
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Lutfen 1 ile 7 arasinda bir sayi giriniz---if-else");
        }



        //Switch;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Lutfen 1 ile 7 arasinda bir sayi giriniz---switch");
        }
        input.close();

    }



}
