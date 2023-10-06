package p7_if_statements.LessonIFStatement;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {

        /*
        Kullanicinin vermis oldugu gün isimlerine bakarak HaftaSonu veya Hafta ici olduguna karar veren kodu yaziniz
                   Monday ==> Week Day       Saturday ==> Weekend Day
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name");
        String dayName = input.next();

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        boolean isWeekday = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday");

        //.equels; denk - esitlemek
        //.equelsIgnoreCase: büyük-küçük harf dikkate almadan veriyi eşitle, demek
        //kullanıcı istenilen veriyi büyük küçük farketmez kelimeyi yazabilir ve eşitler.
        //boolean secilme nedeni, girilecek gun ismi isWeekday; True || False >>isWeekendDay; True || False

        if (isWeekendDay) {
            System.out.println("Weekend Day");

        } else if (isWeekday) {
            System.out.println("Week day");

        }else{
            System.out.println("Invalid day name..");
        }



        //kod dizilimi kucukten buyuge yapildi


    }//main
}
