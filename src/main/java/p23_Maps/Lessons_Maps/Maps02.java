package p23_Maps.Lessons_Maps;

import java.util.HashMap;

public class Maps02 {


    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali",18);
        stdAges.put("Can",19);
        stdAges.put("Tom",33);
        stdAges.put("Veli",63);
        stdAges.put("Ahmet",41);

        //keyi tekrarli kullandiginizda hata vermez, en son verilen entry nin degerini kabul eder
        stdAges.put("Tom",35);
        System.out.println(stdAges);

        //replace() methodu value lari keyleri kullanarak update etmeye yarar
        stdAges.replace("Tom",39);
        System.out.println(stdAges);

        //replace("Tom",39,41); methodu map icinde key olarak Tom ve Valuesu 39 ise 41 e donusturur
        //aksi halde donusturmez
        stdAges.replace("Tom",39,41);
        System.out.println(stdAges);

        //putIfAbsent(eger yoksa ekle); methodu map te Ayse key olarak yoksa Mape ekler var ise eklemez
        stdAges.putIfAbsent("Ayse",77);
        System.out.println(stdAges);

        //get() ve getOrDefault() methodlari eger aranan eleman map te var ise ikiside ayni isi yapar
        // value larini verir.
        System.out.println(stdAges.get("Tom"));
        System.out.println(stdAges.getOrDefault("Tom", 0));

        //eger eleman mapte yok ise get methodu null verir
        //getOrDefault() methodu ise sizin belirttiginiz degeri verir.
        System.out.println(stdAges.get("Jerry"));//null
        System.out.println(stdAges.getOrDefault("Jerry", 0));//0

        //containsValue() methodu value larin icerisinde aranan deger olup olmadigini kontrol eder
        System.out.println(stdAges.containsValue(19));
        System.out.println(stdAges.containsValue(99));

        //containsKey() methodu key lerin icerisinde aranan deger olup olmadigini kontrol eder
        System.out.println(stdAges.containsKey("TOM"));
        System.out.println(stdAges.containsKey("Tom"));

        //remove("Tom"); methodu key kullanarak entry silmeye yarar
        stdAges.remove("Tom");
        System.out.println(stdAges);

        //remove("Can",19); methodu hem key hemde value u kontrol eder eslesirse siler yoksa silmez
        stdAges.remove("Can",19);
        System.out.println(stdAges);
    }

}//
