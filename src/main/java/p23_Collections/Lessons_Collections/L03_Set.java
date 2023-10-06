package p23_Collections.Lessons_Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class L03_Set {

    public static void main(String[] args) {

        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz. --->treeSet kullanmak tercih edilir

        long t1= System.nanoTime();  //Ts calisma suresu


        //1. yol
        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails); //[a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com, t@gmail.com, u@gmail.com, x@gmail.com, z@gmail.com]


        long t2= System.nanoTime();  //Hs calisma suresi


        //2.yol ; daha hizli islem yapabilmek icin;

        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("x@gmail.com");
        System.out.println(emailsHs); //rastgele depolar

        TreeSet<String>emailHsTs=new TreeSet<>(emailsHs);
        System.out.println(emailHsTs);
        //ve yukaridaki Ts ve Hs birlikte kullanark islemi hizlandirmak icin;
        //HashSet ile hizlica iceri aldi //TreeSet ile de sadece siraladi;


        long t3= System.nanoTime();  // Ts ve Hs bilikte calisma suresi

        System.out.println(t2-t1);//treeset         //  treesetin hizi;                 567900
        System.out.println(t3-t2);//hashsetTreeset  //  Ts ve Hs bilikte calisma hzi;   182700

    }
}
