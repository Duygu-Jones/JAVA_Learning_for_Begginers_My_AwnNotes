package p2_tyope_casting;

public class Lesson {
    public static void main(String[] args) {

         /*
        Numeric primitive data type larinin birbirine donusturulmesine Type Casting denir
        Numeric (sayisal) Data Type ==> byte -  short  -  int   -long       -float  - double

        Note 1: Kucuk data type larini buyuk data type larina cevirmeyi java otomatik olarak yapabilir
        bu isleme "AutoWidening" (Otomatik genisletme) denir

        Note 2: Buyuk data type larini kucuk data type larina cevirmek riskli bir istir
        java bu riski otomatik olarak yapmaz.Bu islemi kod yazanlar yapar
        Bu isleme "Explicit Narrowing"(Aciktan/bariz Daraltma)denir.
         */

        //Ornek : byte data type' ini int data type' ina ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidenning

        //Ornek : int data type' ini short data type' ina ceviriniz
        //büyük datayı küçüğe çeivirirken Java buna uyarı veriri bunlar uyşmaz der.
        //Bariz daraltma yaptığımızı assigment ten sonra parantez içinde çevirilecek olan kutunun ismi yazılır
        int weight = 313;
        short weightShort=(short) weight;//Explicit Narrowing


    }


}
