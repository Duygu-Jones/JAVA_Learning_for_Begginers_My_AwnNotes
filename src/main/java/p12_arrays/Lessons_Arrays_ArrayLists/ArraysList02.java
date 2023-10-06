package p12_arrays.Lessons_Arrays_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArraysList02 {
    public static void main(String[] args) {

        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]

        List<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a);//[J, a, v, a, v] >> listenin gorunumu

        List<Character> b = new ArrayList<>(); // bos bir liste olusturuldu yeni elemanlarin gelecegi

                         //a listesi [J, a, v, a, v]
        for (Character w : a) { // a listesindek elemanlair tek tek charcter olarak w variable na atadik -->(soldan saga characteri inclemeye baslar)

            if (!b.contains(w)) { // b sepeti; w'nin incelemis oldugu characteri ! icermiyor mu--> True ise -->
                b.add(w); // ---> b'ye ekle (w deki elemani)
            }
        }
        System.out.println(b);//[J, a, v] //--> a ve v tekrarlamaya baslayinca; b nin icerisinde a ve v characterleri var ikinci kez eklemedi

        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r);//[Manisa, Nigde, Tokat, Van]  --> r Listi

        //for each kullandiginizda listlerde eleman sayisini azaltamazsiniz/degistiremezsin
        //bastan index belirlendigi icin ve index degisince hata verir, elema atlar
        //orn; a dan dolayi Manisa (0.index) silindi,  bir sonraki loopda Nigde 0.index oldu ve 1.index olacak olan Tokati inceler, Nigdeyi atlamis olur

//        for (String w : r) {
//
//            if(w.contains("a")){
//                r.remove(w);
//            }
//        }
//        System.out.println(r);

        //  r list--> [Manisa, Nigde, Tokat, Van]
//       0.index ile baslar    // index no< r kumesinin elemanlarinin sayisi=4 adet  //    indexi artirarak ilerler
        for (int i = 0;           i <r.size() ;                                            i++) {

            if(r.get(i).contains("a")){     // tek tek elemanlari ele al, "a" iceriyor mu --> True ise
                r.remove(i);                // ---> bu indexteki elemani kaldir

              /*yeni index      0.     1.    2.
                              [Nigde, Tokat, Van]
                loop yukarida i++ yapti 1.indexe gecti, 1.indxte Tokat var--->
                loop icinde indexi de 1 azalt
                */

                i--;               //silme islemi oldugunda indexler azalacağı icin i degerini de azaltmaliyiz
            }
        }
        System.out.println(r); //[Nigde]

        /*remove() methodunu index ile de kullanabiliyoruz

        //  r list--> [Manisa, Nigde, Tokat, Van]

         1.adim; if(r.get(i).contains("a")){  // (r'ye git ve i(indexi) getir.bak bakalim "a" iceriyor mu? --> True ise muslugu ac devam

         2.adim;      r.remove(i);          //---> r listesindeki ele alinan i(indexindeki "a" iceren eleman)'i  sil/kaldir

         3.adim; i++; // git, indexi 1 artir; 0.indexten 1.indexe gecer fakat--> yeni listede 0.index \Nigde olur; 1.indxte Tokat; otomatik olarak Nigdeyi atlamis olutrz
         yeni index          0.     1.    2.
         yeni r listesi   [Nigde, Tokat, Van]

         4.adim; i--;   //  loop icinde indexi de 1 azalt ki;
                          tekrar basa don, 0.index ile basla; Nigde yi incele

          5.adim;System.out.println(r); //


         */





    }//main
}
