package p12_arrays.Lessons_Arrays_ArrayLists;

import java.util.ArrayList;

public class ArraysList01 {
    public static void main(String[] args) {

        //arraylist yapisi (scanner gibi) arraylist oldugunu giriste belirtiyoruz

        ArrayList< Integer > ages = new ArrayList<>();

        //ArrayListlere eleman nasil eklenir? //ages. noktadan sonra gelen add() methodu ile listeye eleman eklenir
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);

        //ArrayListlere coklu eleman nasil eklenir?
        ArrayList < Integer > newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        System.out.println(newAges);


        ages.addAll(newAges); // addAll() methodu; ages listesine sonradan olusturlan newAges listesini ekler hepsini
        ages.addAll(0,newAges);

        System.out.println(ages);//[1, 2, 3, 9, 656, 12, 777, 10, 888, 1, 2, 3]

        int numOfelement = ages.size(); // int data da listenin buyuklugu, veya eleman sayisini size() methodu ile bulunur --> Stringlerdeki Length() methodu gibi
        System.out.println(numOfelement);//12

        int el=ages.get(1); //get() istenen indexteki elemani getirir
        System.out.println(el);//2

        ages.set(1,313); //1.index deki eleman ile 313 ile degistirir
        System.out.println(ages);


        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list); //[23, 24, 12, 9, 3] --> list elemanlari

                         //[23, 24, 12, 9, 3]
        for (Integer w : list) {  //list elemanlrini integer olan w'ya atadik tek tek incelenmesi icin
            if (w %2 !=0) { // ornek; 0.index ile baslar; 23%2 != 0 --> True yani tek sayidir; musluk acildi, kod asagi iner devam eder

                list.set(list.indexOf(w), 11); //listeyi set et(degisecek index; listenin 0.indexi nin atandigi indexOf(w) yani 0.index; yani 23 sayisi, degistirilecek sayi 11 ile);
            }
        }

        System.out.println(list); //[11, 24, 12, 11, 11]








    }//main
}
