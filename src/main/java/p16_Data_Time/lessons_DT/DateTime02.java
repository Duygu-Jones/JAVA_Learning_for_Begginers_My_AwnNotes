package p16_Data_Time.lessons_DT;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Anlik zamani(SAATI) nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);  //13:22:13.833446800


        /*
DateTime Class ta kullanilan tarih saat formatlari
    HH : mm         ==> 24'lu saat sistemi
    hh : mm         ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a       ==> 12'li saat sistemi AM, PM
    HH : mm : ss    ==> saniyeyi gosterir

    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");
        String formattedTime = dtf1.format(myCurrentTime);

        System.out.println(formattedTime); //13 : 32
        //yukarda olusturudugumuz myCurrentTime'i format ettik


        //Date objesini formatlayalim
        LocalDate date1 = LocalDate.of(2022, 8, 18);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate = dtf2.format(date1);
        System.out.println("formattedDate = " + formattedDate); //formattedDate = Ağu/18/2022
        //  18/Agustos/2022 formatinda yazdiriniz (date1 kullanildi)
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dtf3.format(date1)); //18/Ağustos/2022

        //Baska bir zaman dilimindeki tarih ve zaman nasil alinir?

        //Tokyo da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo); //2023-08-29

        //Tokyo da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo); //17:09:37.853895300

        //Date ve Time ayni anda al
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); //2023-08-29T11:11:37.474077300

        //format degistirme
        //29 * Aug * 2023 - 11 : 15 seklinde gormek icin nasil format yapilir

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm");
        String formattedLdt = dtf4.format(ldt);
        System.out.println(formattedLdt); //29 * Ağu * 2023 - 11 : 19

    }//main


}//class
