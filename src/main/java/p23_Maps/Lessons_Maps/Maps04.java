package p23_Maps.Lessons_Maps;

import java.util.HashMap;

public class Maps04 {
    public static void main(String[] args) {

        //HashMap arkasinda calisan mekanizma
        //Map objesi olusturulunca Java arka planda 16 byte lik -16 adet bos kutu olusturur kapasite-->("bucket" denir)
        //java girilen variable icin Hash-code yani rastgele Unique bir sayi uretir ve bu sayiyi 16 haneli olusturdugu kutu adedine boler, kalani alip indexe gider
        //(mod mantigi, kalan sayi bu variable icin index numarasi olur)
        //orn; "USA" String variablei icin HAshcode olarak 34 olusturdu ise indexini bulmak icin ===> 34/16 dan kalan 2 sayisi index 2ye yerlestirir,
        //2.indexe===> "34 | USA | Washington" ====> EntrySet seklinde yerlestirir ve kodlamis olur==> EntrySet leri LinkedList seklinde (vagon) olusturur ==NODE sistemi
        //Ayni indexe sinirsiz farkli Entryset yerlestirebilir
        //boylece Java 16 dan buyuk bir sayiya index olarak gitme ihtimalini ortadan kaldirir
        //ve Map lerde olan key-value eslesmesini de ayni kutuya yerlestirir. --> get () methodu ile key veya value yi cagirdigimiz zaman o index kutusuna gider esini getirir.
        //capitals.put("USA","Washington"); ---> capitals.get("USA"); USA=key; Washington=Value , yani bize USA nin Valuesini 2 nolu indexten getirir
        //Java 16 bucket tan 12 sinin(%75'i) doldugu anda, bir diger 16lik bucket olusturur, Tup kapasitenin tamamen dolmasini beklemez yeni kapasite acar ki kapasite tamamen dolar ise sistem cok yavaslar


        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA","Washington");
        capitals.get("USA");
        capitals.put("Italy","Roma");
        capitals.put("Turkiye","Ankara");
        capitals.get("Turkiye");
        capitals.put("Turkiye","Istanbul");
        //put () methodu; ile tekrar EntrySet i guncelleyebilir; Turkiye key ini girip, Value yi Istanbul olarak guncelledi


    }


}//

