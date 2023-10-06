package p09_switch.LessonsSwitch;

public class Lesson01 {
    public static void main(String[] args) {

        //Example  Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7
        //verilen task i iyi analiz et, istenildigi gibi yap, biz 1.gune Monday desek de task da Sunday


        String dayName = "Tuesday"; //burada yazılan gün adını değerlendiriyor kod yazılımı.

        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);

        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);

        }else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);

        }else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);

        }else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);

        }else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);

        }else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);


            //not: equalsIgnoreCase("Sunday") girilen kelimenin buyuk kucuk harf
            // olduguna dikkat etmmez gormenzden gelir
            // String methodudur yani NON-PRIMITIVE

        }
        System.out.println();

        //2.yol : Switch yöntemi; if else lerle yapılan herşeyi Switch ile de yapabilirsin.
        //eğer 3 ten fazla conditions senaryo varsa Switch tercih edilir, daha okunur olduğu için

        switch (dayName.toLowerCase()) {
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;


        }

        /*OZET
        Switch kalibi:

        switch (dayName.toLowerCase()) {
            case "Sunday":
                System.out.println(1);
                break;
         */

        //NOTE; noktadan sonra kucuk-buyuk harfi tek tip duzenlemek icin>>
        //.toLoweCase: hepsini kucuk harf yap
        //.toUpperCase: hepsini buyuk harf yap

        //"break" anlami; tek satir inceler; True ise o satiri yazdirir, false ise bir sonraki satira git der Java ya
        //eger birkac satirdan sonra  tek bir break yazilirsa girilen degerden break`e kadar tum satirlari yazdirir



    }//main

}
