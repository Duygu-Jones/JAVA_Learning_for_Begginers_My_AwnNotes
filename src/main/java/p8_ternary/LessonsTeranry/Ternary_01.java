package p8_ternary.LessonsTeranry;

public class Ternary_01 {
    public static void main(String[] args) {

        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0


        //Kalip:
        // condition (c) ? >>> 1.case: true / 2.case: false ;   //hatirlatma

        int c = 4;
        int result = c< 0       ?     -1 * c      :      c ;
        System.out.println(result);

        /*
        int c = 4;
        int         result          =    c< 0       ?          -1 * c      :         c;
         Sayisal    (name)          =  condition    ?          True ise    :     False ise
         */

        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.


        int a = 3;
        int b = 13;

        //String Olmaz burada >>
        // String     result2   =  (a>0 && b>0) || (a<0 && b<0)     ?       a*b     :   "Farkli isaretli sayilari carpamiyorum";
        // DataType   (name)    = conditions (ayni isaretli olsun)  ?   True ise    :     False ise
        //True: a*b sayisal degerdir   //False: "Farkli isaretli sayilari carpamiyorum" String (kelime-cumle) dir
        //nu int ve String data turleri birlikte ayni kaba giremez bu durumda kurtaricimiz >>> OBJECT dir


        Object result2 = (a>0 && b>0) || (a<0 && b<0) ? a*b : "Farkli isaretli sayilari carpamiyorum";

        //"Object" javada butun Non-Primtive Data Type larinin (Class) ortak parent laridir.
        // Object class in parent i yoktur. en tepededir yani
        //butun anlasamayan data turlerini kabul eder
        //fakat gereksiz kullanilmamalidir, sadece iki data typenin bir kodda kullanilmasi gerektigi
        // ve bu iki data typenin uyusmadigi durumlarda kullanilir





    }//main
}
