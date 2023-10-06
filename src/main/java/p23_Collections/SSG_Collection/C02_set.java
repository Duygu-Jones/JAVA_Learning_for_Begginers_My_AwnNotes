package p23_Collections.SSG_Collection;

import java.util.HashSet;
import java.util.TreeSet;
public class C02_set {

    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>();
        TreeSet<Integer>set2=new TreeSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(2);
        set1.add(2);
        set1.add(5);
        set1.add(1);
        set1.add(6);
        set1.add(4);
        set1.add(3);
        set1.add(3);
        set1.add(2);
        set1.add(11);
        set1.add(13);
        set1.add(12);
        System.out.println(set1);

        TreeSet<String> hs = new TreeSet<>();
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);//[Kerem, Sinan, Tuba, Onur]
        hs.add("Tuba");//Tekrarli elemanlari eklerken hata vermez ama sadece bir kere ekler

        System.out.println(hs);//[Kerem, Sinan, Tuba, Onur]
    }
}
