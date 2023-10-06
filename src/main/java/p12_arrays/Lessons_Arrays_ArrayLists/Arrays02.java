package p12_arrays.Lessons_Arrays_ArrayLists;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 2: int array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        //[] koseli parantez bunun bir ARRAY oldugunu JAVA ya soyler
        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        //1. yol
//        Arrays.sort(ages); //artan siralama yapar
//        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]
//        System.out.println(ages[0] + ages[ages.length - 1]);


        //Note : sort() methodu sayisal data type larini kucukten buyuge siralar, (ascending order/artan sirada)
        //     :  sort() methodu String data tyep larini alfabetik siralar (alphabetical order)
        //   (ascending order) +   (alphabetical order)  ==> natural order
        // sort () methodu Array elemanlarini natural order a gore siralar



        //2.yol     //min-max degerler olusturarak
     // int ages[] = new int[6];
     // System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        int minimum = ages[0]; //min bos sepet olusturalim //ages atamasi ARRAY oldugunu belirtmek icin; sadece 0 verilirse gelecek ikinci sayi ile karsilastirildiginda 0 daha kucuktur 0 gelir sonuc
        int maximum = ages[0]; ////max bos sepet olusturalim

        for (int w : ages) { //int data type w adinda Array den ages elemenalarinin atandigi veri
            minimum = Math.min(minimum, w); //min() methodu; biz ona 2 sayi veriyoruz kucuk olani seciyor
            maximum = Math.max(maximum, w); //max() methodu; biz ona 2 sayi veriyoruz buyuk olani seciyor
        }
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(maximum+minimum);

        //Math.min(); methodu; ilk index elemandan incelemeye baslar ve
        // siraylar 2 sayi arasinda karsilastirma yapar ve kucuk olani secer, tum elemanlari karsilatirarak tamamlar ve listedeki en kucugu bulur
        //        int maximum = ages[0];


    }//main
}
