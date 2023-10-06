package p8_ternary.LessonsTeranry;

public class Ternary_02 {
    public static void main(String[] args) {

        //Example 1: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int a = 313;

        a = Math.abs(a); // a`nin mutlak degeri alinmasi icin

        String result =a>99 && a<1000? "uc basamaklidir" : "uc basamakli degildir" ; // a`nin basamak degeri degerlendirilir

        System.out.println(result); // ve sonuc yazdirilir

        //NOTE;
        //uc basamakli sayilar NEGATIF sayilar icin gecerli olsada burada kod calilmaz. ne yapmak lazim
        //a = Math.abs(a); sayinin mutlak degeri (.abs) alindi
        // Java mat kurallarini kullanmak icin Math Class olusturmustur (her amaca uygu bir methodlar gelistirmis)
        // sayinin basamak sayisini degerlendirmek icin negatif ise mutlak degeri (.abs) alinir

        //interview question
     /*    Example 2: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */

        //hatirlatma Nested Ternary (C: buyuk genel sart >>> c1: ikinci kucuk sart ; c2: ucuncu kucuk sart
        // C ?           c1 ? : t / f    :     c1 ? : t/f ;

        int year = 2004;

        String result2 = year % 100 == 0 ? year % 400 == 0 ? "Leap" : "Not Leap" : year % 4 == 0 ? "Leap" : "Not Leap";
        System.out.println(result2); //2004 icin // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> yes>>>>>>>>>>>>leap


        // String result2 = year % 100 == 0 ? year % 400 == 0 ? "Leap" : "Not Leap"     :   year % 4 == 0 ? "Leap" : "Not Leap";
        // sozel  sonuc2  = 100e BOL mu     ?  400e bol mu    ?  true  :  false         :   4e bol mu     ?  true  :  false
        //                      C?              C-1?             C-1-1    C-1-2             C-2?            C-2-1     C-2-2
        //                      YES ise >>>>>>  C-1? >>yes ise>> C-1-1
        //                      YES ise >>>>>>  C-1? >>no ise >>>>>>>>>>> C-1-2
        //                      NO ise >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  C-2? yes ise >> C-2-1
        //                      NO ise >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  C-2? no ise >>>>>>>>>>>>  C-2-2


    }//main
}
