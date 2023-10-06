package p7_if_statements.LessonIFStatement;

public class If {
    public static void main(String[] args) {

        //If Statements
        //Bazı kodların bazı sartlara göre aktive edebilmek için kulllanılır.

        //if you study hard, you will learn java. ==Z English statement

        /*
        if(you stud hard) {
            you will learn Java   ==> Java dilinde statement

         }

         */

        //Ornek 1:  Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin

        int number = 3;

        if (number > -1 && number < 10) { //condition statement>>> koşulu if içerisinde veririz
            System.out.println("Rakam"); //çıktıda ne olacağını yazarız.//rakam yazar, çünkü 3>-1 True && 3<10 True >> True

            //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin. (n>99 && n<1000) 3 basamaklı olma aralığı budur

            int n = 23; //değerimiz 23
            if (n>99 && n<1000) { //23>99 False && 23<1000 True >>>

                System.out.println("Sayi üç basamaklıdır!"); //yazılacak ifade //Sonuç False; java çalışmaz




                /*ÖZET
                1. task'de verilen görevi iyi analiz et // Task: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.
                2. girilen değerin kodunu oluştur // (değerimiz 23) için syntax>>>  int n = 23;
                3. if() { } syntax içerisinde koşulu tanımla >>>>>>> if (n>99 && n<1000) {
                4. çıktıda ne görüneceğini tanımla >>>>>>>>>>  System.out.println("Sayi üç basamaklıdır!");

                NOTES
                If statement koşullu iki durumu içerir,
                matematikdeki "ve" bağlacı önermeleridir, Durumlardan birisi FALSE ise sonuç False dur yani print çalışmaz.
                çalışması için her iki durumunda TRUE olması gerekir (T && T ==> T)

                (number > -1 && number < 10) java dilinde -1<x<10 anlamında böyle yazılır. arada and(&&) işareti kullanılır
                eğer girilen değer aralıkta değil ise veya durumlardan biri False ise İf Statement konsol çalışmaz yani çıktıdda bişey olmaz.
                Örnek; (number > -1 && number < 10) bu şarta göre;
                girilen sayı 13 ise -1< 13 True &&(and) 13<10 False >>> T && F>> False dur, Java çalışmaz

                 */








            }

        }


    }

}
