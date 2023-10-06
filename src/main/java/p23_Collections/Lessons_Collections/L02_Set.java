package p23_Collections.Lessons_Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class L02_Set {

     /* SET ===> UNIQUE tekrarsiz lar icin kullanilir
            a) HashSet ===>verilen datayi gelisiguzel rastgele siralar ama cok hizilidirlar siraya dikkat etmez
            b) LinkedHashSet ===> girilen datalarin sirasini bzomadan oldugu gibi koyar, ne verirsen onu siraya ekler
        SORTED SET ==>
            a)TreeSet >>> verilen datayi NATUREL ORDER a gore siralar bu yuzden de cok yavastirlar
    SETler TEKRARSIZ yapilardir
    */


 public static void main(String[] args) {
    /* HOCANIN NOTLARI
    1)Set' ler tekrarsiz eleman  (unique) depolamak icin kullanilir
    2) 3 tane Set Class i vardir
        a) HashSet Class
            Hash benzersiz id olusturma teknigidir. Bu teknige Hashing technique denir
            HashSet elemanlari rastgele siralar
            HashSet elemanlari siralamadigidan cok hizli calisir
            HashSetler nulli eleman kabul eder
            HashSet ler ogrenci no gibi verileri rastgele unique sayi uretmek gibi islerde cok iyidir

        b) LinkedHashSet Class
            LinkedHashSet ler elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order)
            Hashsetlere gore yavastirlar

        c) TreeSet Class
            TreeSet elemanlari natural order a gore dizerler.
            ve bu nedenle cok yavastirlar, en yavas settir
            nulli eleman olarak kabul etmezler
      3) TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz
     */
            //1)
            HashSet<String> hs = new HashSet<>();
            hs.add("Sinan");
            hs.add("Kerem");
            hs.add("Tuba");
            hs.add("Onur");
            System.out.println(hs);//[Kerem, Sinan, Tuba, Onur]
            hs.add("Tuba");//Tekrarli elemanlari eklerken hata vermez ama sadece bir kere ekler, tekrarlamaz
            hs.add(null); //null eleman olarak kabul edilir ekler
            hs.add(null);// tekrarlamaz varligindan emi olur gibi listede bir kez varligina musade eder
            System.out.println(hs);//[Kerem, Sinan, Tuba, Onur] ----> verilen elemanlari rastgele siralamis

             //2)
            LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
            lhs.add(313);
            lhs.add(19);
            lhs.add(7);
            lhs.add(1);
            lhs.add(null);
            System.out.println(lhs);//[313, 19, 7, 1, null] ===> lhs listesi

            LinkedHashSet<Integer> ls = new LinkedHashSet<>();
            ls.add(313);
            ls.add(19);
            ls.add(17);
            ls.add(11);
            System.out.println(ls); // [313, 19, 17, 11] ====> ls Listesi

            lhs.retainAll(ls); // lhs ile ls listelerinin  ortak elemanlarini lhs set icinde verir
            System.out.println(lhs);//[313, 19] ---> lhs icinde gosterir
            System.out.println(ls);//[313, 19, 17, 11] -->ls setine dokunmadi

            //3)
            TreeSet<Character> ts = new TreeSet<>();
            ts.add('G');
            ts.add('A');
            ts.add('Z');
            ts.add('R');
            ts.add('U');
            //ts.add(null); //null eleman olarak kabul etmezler eklemedi
            System.out.println(ts);//[A, G, R, U, Z] //alfabetik sirayla dizdi
            System.out.println(ts.subSet('G', 'U')); //subSet() G den baslar U ya kadar elemanlari alir, U haric

        }

}//
