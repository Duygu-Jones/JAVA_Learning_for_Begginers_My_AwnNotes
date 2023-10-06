package p23_Collections.Lessons_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {
        /*
        QUEUE;
        ilk gelenin ilk cikmasi gerektigi durumlarda kullanilir
        mesela; stk si ilk once gelen sut, ekmek vs urunlerinin ilk cikmasi gerekir ki stk tarihinden once satilsin
        veya bankaya gelen ilk musteri sirasinda olan kisi ilk cagrilsin gibi durumlar
        Onemli olan; first input--> first output olur
        araya eleman eklenemez, bu tur methodlar yoktur
        methodlarin cogunlugu ilk eleman uzerinden islem yapiyor.  
         */

        Queue<String> depo = new LinkedList<>();   //linkedlist classindan obje olusturuldu. insertion order yaapr
        depo.add("süt");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo);//[süt, et, yumurta, peynir]
        depo.remove(); //ilk elemani siler
        System.out.println(depo); //[et, yumurta, peynir]

        System.out.println(depo.peek()); //et ---> ilk elemani getirdi, silmeden --->copy+paste yapti
        System.out.println(depo); //[et, yumurta, peynir] son hali ayni

        depo.clear(); //[] --> lsiteyi tamamen temzledi, bosaltti
        System.out.println(depo); //null --> lsite bos ise null verir
        System.out.println(depo.poll());//null

        //System.out.println(depo.element());//Exception ---> element methodu bos liste icin error verir null degil.

        System.out.println(depo.peek());//null

        Queue<String> wareHouse = new PriorityQueue<>();
        //Priority Queue class ile obje olusturuldu; verilen siraya gore dizer, yani onceliklendirmeyi biz yapabiliriz
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Orange");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);//[Egg, Milk, Meat, Orange, Tomatoes]

        //Double ended queue ==> iki uclu queue
        Deque<String> d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);//[Milk, Meat, Egg, Orange, Tomatoes]


    }




}//
