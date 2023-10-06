package p11_loops.LessonsLoops;

public class C2_ForLoop02 {
    public static void main(String[] args) {

        //Farkli senaryo; istenilen veriye gore datayi tanimlayacagiz
        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"

        String s =  "I love Java";  //String data ile stringi tanimladik
        for (int i = 0; i < s.length(); i++)  { //stringin length (character sayisi) ve indexi ile calisacagiz

            if (s.charAt(i) =='a') {
                break;

            }
            System.out.println(s.charAt(i));

        }
        //ACIKLAMA
        /*

         */

        //example 2 :Verilen bir String'de kucuk harfleri console'a yazmayiniz!!!!
        //"Pwd12?Ab" ==> P12?A bunu istiyor

        String s1 = "Pwd12?Ab";

        for (int i = 0;        i < s1.length();         i++) {
            char ch = s1.charAt(i);
            if(ch>='a' && ch <='z') {
                continue;  // calis ama bisey return etmene yazdirmana gerek yok hemen basa don devam et dedik //burasi calismazsa else gider
            }else {        //ch; a ile z arasinda degil ise yazidr
                System.out.print(ch);
            }
        }

        //break; switch lerde dongunun disina cikmak ve loopu kirmak icin kullanilir
        //continue ise loop yaparken bazi elemanlari isleme sokmamak icin continue kullanilir //atla ve gec devam et dedik


        System.out.println();

        //example 3  Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        String s2 = "Java";
        String ters =""; //hiclik olusturduk ki tersten yazilacak "avaj" a alan actik==> bos sepet actik
        //s2 ssepetinden tek tek alip>>> ters sepetine tersten ekleyecez

        for (int i = s2.length()-1;      i>= 0;       i--) {
            ters = ters + s2.charAt(i);

            System.out.println(ters);
            //a
            //av
            //ava
            //avaJ


        }




    }//main
}
