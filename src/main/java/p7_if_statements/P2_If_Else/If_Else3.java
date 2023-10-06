package p7_if_statements.P2_If_Else;

import java.util.Scanner;

public class If_Else3 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir gun alin.
        Eger gun; Cuma ise "Muslumanlar icin kutsal gun"
                   Cumartesi se "Yahudiler icin kutsal gun"
                   Pazar ise "Hiristiyanlar icin kutsal gun" yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Dini bir gun giriniz");
        String dayName = input.next();

        //equals methodu iki stringi karsilastirir,
        // ayni-esit ise true, farkli ise false return eder
        if (dayName.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gun ");
        }
        if (dayName.equalsIgnoreCase("Cumartesi")){
            System.out.println("Yahudiler icin kutsal gun ");
        }
        if (dayName.equalsIgnoreCase("Pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun ");
        }
        if (!dayName.equalsIgnoreCase ("Cuma") && !dayName.equalsIgnoreCase("Cumartesi")
                && !dayName.equalsIgnoreCase ("Pazar")){
            System.out.println("Boyle bir gun yok");
        }








    }





}
