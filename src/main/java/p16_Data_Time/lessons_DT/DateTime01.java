package p16_Data_Time.lessons_DT;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimindeki tarihi verir

        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);                   //2023-08-28

        System.out.println(myCurrentDate.getMonthValue());   //08
        System.out.println(myCurrentDate.getYear());         //2023
        System.out.println(myCurrentDate.getDayOfMonth());   //28
        System.out.println(myCurrentDate.getMonth());        //AUGUST
        System.out.println(myCurrentDate.getDayOfWeek());    //MONDAY

        //Ileriki tarihe nasil gidilir?

        System.out.println(myCurrentDate.plusDays(3).plusMonths(2).plusYears(1));
        // 2024-10-31

        System.out.println(myCurrentDate.minusYears(1).minusDays(3).minusMonths(2));
        //2022-06-25

        //Specific bir tarih olusturma;
        LocalDate date1 = LocalDate.of(1994, 7, 13);
        System.out.println(date1); //1994-07-13

        LocalDate date2 = LocalDate.of(2006, 8, 18);
        System.out.println(date2); //2006-08-18

        boolean compare1 = date1.isBefore(date2);  //date1(1994-07-13) is Before>>> date2(2006-08-18)
        System.out.println(compare1); //true

        boolean compare2 = date1.isAfter(date2); //date1(1994-07-13) is After>>> date2(2006-08-18)
        System.out.println(compare2); //false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
//           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen rezervasyon yapmak istediginiz tarihi; yil, ay, gun seklinde giriniz");
       int year = input.nextInt();
       int month = input.nextInt();
       int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day); //yukarda verilen tarihi bugunden once mi sonra mi baktik
        if(givenDate.isBefore(LocalDate.now())){
            System.out.println("Invalid date"); //bugunden once bir tarih girilirse gecmis tarihe rez yapilmaz
        }else {
            System.out.println("valid date, thank you"); // //ileri tarih ise; gecerlidir.. ve islem yapilir
        }


        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Please enter your birthday date; year, month, day as given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate newDate = LocalDate.of(y,m,d);
        System.out.println(newDate.getDayOfWeek()); //newDate'i getDayOfWeek ile yazdir dedik// WEDNESDAY

    }//main





}//class
