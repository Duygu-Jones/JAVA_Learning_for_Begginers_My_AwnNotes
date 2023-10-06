package p12_arrays.Lessons_Arrays_ArrayLists;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 13; // bir kod bir kisilik bir koltuk demektir

        //Array ise ayni data tipinded coklu data depolamak icin olusturulmustur javada.
        //Array, cok kisilik bir kanepe gibi yer acar:)))
        //Array, acilan ker koltuk icin memory de default value olarak "Null" degeri atar
        //  yani etkisiz eleman, gelecek veri icin yer acmis olur; 0 veya 1 gibi etkisiz elemanlara ihtiyac duymaz, bunlarin kullanimi dikkatli yapilmalidir
        //  yani String default NULL kullanir
        //Array nasil olusturulur?

        String stdNames[] = new String[5];
        //String[] stdNames = new String[5]; // []; koseli parantez ortayada gelebilir "String[]" gibi, Class in ARRAY oldugunu Javaya bildirir

        //Arrayler console a nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames)); //[null, null, null, null, null]

        //toString() methodunu kullanmadan sadece array ismi ile yazdirirsaniz java o Arrayin adresini yazdirir

        //Array e eleman ekleme nasil yapilir?
        stdNames[2] = "Alperen";
        stdNames[4] = "Cemil";
        stdNames[3] = "Tuba";
        stdNames[1] = "Ahmet";
        stdNames[0] = "Ahmet Saim";
        System.out.println(Arrays.toString(stdNames)); //[Ahmet Saim, Ahmet, Alperen, Tuba, Cemil]
        //Array indexlerle sayma yapar; 0`dan baslar, istenilen eleman sayisi(karakter sayisi gibi dusun) kadar eleman olusturulur

        //Array dan specific bir elemani almak?
        System.out.println(stdNames[2]);//Alperen

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.



        String cities[] = new String[5];
        cities[0] = "Miami";
        cities[1] = "Sivas";
        cities[2] = "Yozgat";
        cities[3] = "Ankara";
        cities[4] = "Bursa";

        //1. yol for loop
        int totalChar=0; // toplanacagi yer

        for (int i = 0;     i <cities.length ;     i++) { //length burada Array yani cities length alir(String cities[] = new String[5];)
            totalChar=totalChar+ cities[i].length(); //length burada string yani method dur// i city`sinin length ini alir //i =0 mesela "Miami" length: 5 adet karakter var
        }
        System.out.println(totalChar); //27
        //length ; Array`de pazantezsizdir yani method degildir; Stringlerde () parantezli method idi

        //Note :Stringlerde kullandigimiz length() methodtur
        // arraylerde kullandigimiz length variable (deger sayisi) dir


        //2. yol for-each loop  (enhanced/zengilnlestirilmis loop) //acabasi-sonsuzluk ihtimali yoktur, temiz acik

        int sum=0; // 0`dan baslar otomatik olarak sonuna kadar gider; i++/-- increment dicrement yapmaya, break ile kirmaya gerek yoktur

        for ( String w : cities ){ //w; String data typinda "cities" olarak tanimlandi; w yi kullanacagiz kod icerisinde
            sum= sum+ w.length(); // sum=0 + ilk w (city length) "Miami" ; 5 adet karakter >> 0+5= 5 >>> sum sepetinde 5 var
        }
        System.out.println(sum); //27


        //for-each loop iskeleti
        /*
        for ( Data Type name : ilk variable Name) {
        //      toplama sepeti = sepet + length degeri ;
        //      sout (toplama sepeti sonuc)
         }

         */


    }//main
}
