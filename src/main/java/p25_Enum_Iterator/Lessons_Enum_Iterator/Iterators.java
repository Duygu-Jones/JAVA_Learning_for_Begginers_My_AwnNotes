package p25_Enum_Iterator.Lessons_Enum_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    /*
    Tekrarli isler icin kullanilir
    Iteratorler for looplar gibidir; looplar sonsuz dongu ilhtimali vardir; iterator ler da boyle bir durum yoktur
    !!!!!!!!!!  ITERATOR ler eleman silmek ve degistirmek de daha basarilidir
    Iterator COLLECTION larla kullanilir

     */

    public static void main(String[] args) {
        /*
        1) Iterator lar loop larin yaptigi ayni isi yapar
        2) Iterator larda sonsuz loop olusma ihtimali yoktur
        3) Iterator lar ile looplar arasinda performans farki yoktur
        4) Iterator lar bir collectiondan eleman silme ve bir collection daki elemani degistirme konusunda daha basarilidir

        5) iki tip iterator vardir

            a) Iterator :
                Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir

            b) ListIterator:
                Bu eleman silebilir, ekleyebilir ve degistirebilir
                List ler eleman ekleme ve silmede uzmanlardir

        Note==>
          Iterator sadece soldan saga (ilk elemandan --> son elemana ) calisir
          Fakat ListIterator iki yonlu <---> calisabilir
         */

        //1) Normal bir list olusturduk             ===> myList
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");
        System.out.println(myList);//[Tom, Jim, Clara, Fatma, Mustafa]


        //2) Yukardaki listi ITERATOR Liste cevirmemiz gerekir kullanabilmek icin;

        //specific bir elemani iterator ile nasil silebiliriz?
        Iterator<String> myItr = myList.iterator(); //=> myList ==> myItr oldu [ Tom,     Jim,    Clara,   Fatma,  Mustafa]

        while (myItr.hasNext()) {      //hasNext(); pointer a senden sonra eleman varmi diye sorar, eleman varsa true yosa false return eder

            String el = myItr.next();  //Next(); pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder
            if (el.equals("Tom")) {    //esitligi karsilastirir
                myItr.remove();        //remove(); methodu next() methodunun return ettigi(pointer ile ustunden atladigi) elemani siler
            }

            //Ozetle listeyi bosalttik
        }
        System.out.println(myList); // print==> []




        //ListIterator kullanimi ; eleman ekleme, degistirme, duzenleme....
        //1) yeniden bir normal lsite olusturalim ==> yourList
        List<String> yourList = new ArrayList<>();
        yourList.add("Ali");
        yourList.add("Can");
        yourList.add("Aliye");
        System.out.println(yourList);//[Ali, Can, Aliye]

        // 2)  yourList ===> ListIterator'a cevirelim
        ListIterator<String> yourListItr = yourList.listIterator();// => yourListItr==> [  Ali,     Can,    Aliye]

        while (yourListItr.hasNext()){

            String el=  yourListItr.next(); //nex(); pointer ile uzerinde gectigi listedeki elemanlari alir el sepetine atar
            yourListItr.set(el+"*"); //Ali* // => set(); el emanlari set etmek icin--> isim* yildiz ekliyoruz
        }
        System.out.println(yourList); // [Ali*,    Can*,     Aliye*]




        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);//[Ali, Can, Aliye]

        ListIterator<String> listItr2= list3.listIterator();//[ Ali,  Can,  Aliye]

        //bu loop pointer i en saga almak icin yazildi
        while (listItr2.hasNext()){
            listItr2.next();
        }
        //elemanlari sondan basa dogru yazdirin
        while (listItr2.hasPrevious()){
            String el=  listItr2.previous();
            System.out.println(el+" <-- ");
        }

    }






}
