package p23_Maps.Practice_Maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

     /*
     MAPs denilince akla ilk gelen sey; ==> suslu parantez ve  KEY=VALUE yapisinda olurlar
        Key'ler unique olmalidirlar
        Value ise tekrarli olabilir*/

  /*MAP'LER:

    A)HashMap:
        1)Hizlidir==> (hizli olmanin sarti ise az is yapmak)
            -bunun icin de siralamayi rastgele yapar +
            -synchronize olmazlar + tread-safe degildirler
        2)KEY; 1 tane NULL alabilir (key'ler Unique dir)
        3)VALUE; 1den fazla NULL alir */

        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(101, "Tom Hanks");
        hm1.put(102,"Ryen Ronald");
        hm1.put(103,"Jennifer Aniston");
        //ayni key kullanildiginda ustune yazar
        hm1.put(101,"kemal Sunal");
        System.out.println(hm1);
        System.out.println(123);





        /*
    B)HashTree:
    */
        /*
    C)TreeMap:
      */









    }

}
