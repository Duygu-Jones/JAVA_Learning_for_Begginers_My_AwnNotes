package p23_Maps.Lessons_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps03 {


    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1


        String s = "I like you, like like!";

        //istenen ciktiyla ayni olmasi icin noktalama isaretlerinden kurtulmak gerek
        s= s.replaceAll("\\p{Punct}", "");
        System.out.println(s); //I like you like like

        //kelimlerle calisacagimiz icin split (" ") kullanmalaiyiz
        String words [] = s.split(" ");  //birden fazla kelime oldugu icin array yaptik
        System.out.println(Arrays.toString(words)); //arrayler toString() ile yazdirilir idi //I like you like like

        //workds arrayindeki kelimeler birer birer Map'te var mi diye kotrol edilecek
        //workds arrayindeki kelimeler MAp'de yok ise Map'e value olarak 1 atanir,
        //workds arrayindeki kelimeler MAp'de var ise Map'de value  1 arttirilarak atanir,
        HashMap<String, Integer> occ = new HashMap<>();
        for (String w: words ) {
            Integer numOfOccurance = occ.get(w);

            if(numOfOccurance == null){
                occ.put(w,1);
            }else {
                occ.replace(w, numOfOccurance+1);
            }
            System.out.println(occ); //{like=3, I=1, you=1}
        }


        //ODEV

        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1


        /*
        Hashmap ile HashTable arasindaki farklar nelerdir?
        1) HashMap tread-safe ve synchronized degildir; HashTable tread-safe ve synchronized dir
        2) HashMap bir tane null key'e (Unique oldugu icin) ve istediginiz kadar nul value'ya (tekrarli olabilir) musaafe eder
        HAshTable, keylerde ve value larda null kullanilmasina musaade etmez
        3) HashMap hizlidir; HasshTable HashMap e gore yavastir, multi task ozelligi oldugu icin

        Note; HAshMapler ve HashTable lar entry (elemanlar) leri rastgee siralar

         */

        Hashtable<String, Integer> ogrenciNotlari = new Hashtable<>();
        ogrenciNotlari.put("Selma", 70);
        ogrenciNotlari.put("Tuba", 75);
        ogrenciNotlari.put("Ibrahim", 85);
        ogrenciNotlari.put("Safa", 87);
        //ogrenciNotlari.put(null, 50); Hashtable null i key kismina koymaya musaade etmez
        //ogrenciNotlari.put("Ahmet", null); Hashtable value kismina null koymaya musaade etmez

        /*
        HashTable ne zaman kullanmaliyiz?
        1) multi-thred ve synchronization kullanmak gerektiginde,
        2) key lerde ve value larda null kullanmak yasak ise kullanabiliriz
         */

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali",18);
        stdAges.put("Can",19);
        stdAges.put("Tom",33);
        stdAges.put("Veli",63);
        stdAges.put("Ahmet",41);
        stdAges.put(null,41);
        stdAges.put(null,39);
        stdAges.put("a",null);
        stdAges.put("b",null);
        stdAges.put("c",null);
        System.out.println(stdAges);

        /*
        1) Treemap ler entry leri natural order a gore siraya koyar, Bu yuzden coook yavastir
        2) Treemap ler  thread-safe ve synchronized degildir,
        3) Treemaplerin key lerinde null kullanilamaz, ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) Treemapler key e bakarak siralama yapar
         */

        TreeMap<String,Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        //  countryPopulation.put(null, 18000000);
        countryPopulation.put("Italy", null);
        countryPopulation.put("France", null);


        System.out.println(countryPopulation);





    }



}//
