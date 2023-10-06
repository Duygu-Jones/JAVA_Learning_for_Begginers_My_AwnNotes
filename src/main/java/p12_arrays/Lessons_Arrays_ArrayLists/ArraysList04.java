package p12_arrays.Lessons_Arrays_ArrayLists;

import java.util.Arrays;
import java.util.List;

public class ArraysList04 {
    public static void main(String[] args) {

       //Bir List olusturmak icin kisa yol;

        List < Integer> list = Arrays.asList(4, 5, 13, 313, 353);
        System.out.println(list);  //[4, 5, 13, 313, 353]


        //list.remove(0); // asList(); methodu ile remove yapilmaz
        // list.add(63); //  asList(); methodu ile ekleme de yapamazsiniz
        //list.clear();  //  asList(); methodu ile temizleme de yapamazsiniz
        //  asList(); methodu ile listedeki eleman sayisi degistirilemez, asliste uygun methodlar kullan bunun icin;

        //asList() --> yani tam olarak List<> gibi degil, daha cok array gibi demek ki

        /*
        Note : Arrays.asList() methodunu kullanarak bir list olusturursaniz
        listin eleman sayisini degistiren methodlari kullanamazsiniz
        //ornek; remove(), add(), clear() gibi kullanilmaz
        ama set() kullanabilirsiniz; set(0 herseyi set eder, ayarlar

         */

        // ilk List--> [4, 5, 13, 313, 353]
        list.set(1,63); // 1.indexdeki elemani, 63 elemani ile degistir, set et demek

        System.out.println(list); //[4, 63, 13, 313, 353]

        System.out.println(list.size());//5 // list eleman sayisi degismedi, belirli bir indexdeki elemani degistirdik







    }//main
}
