package p12_arrays.Lessons_Arrays_ArrayLists;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //Array leri kisa yoldan nasil olusturabiliriz?

        int numbers[] = {12, 3, -3, 5, 23};

        for (int w : numbers) {

            if (w < 5) {
                System.out.print(w + " ");
            }
        }
        System.out.println();   // iki islemi ayirlmak icin bos sout at


        //ARRAY  de EGER ihtiyac var ise >>> FOR- EACH tercih edilir her zaman

        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String names[] = {"K", "C", "R", "A", "S"};

        //binarySearch(); methodunu sort() kullanmadan kullanmayiiniz; cunlu sirali elemanlar icin gecerlidir
        //binarySearch() methodu var olan elemanlar icin size o elemanin indexini verir
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir; index numarasini verirse bu eleman var demektir
        // "-" ==> isaretinin anlami eleman yok demektir; olmayan eleman icin eksi isareti verir
        // - nin yanindaki sayi ==> eger o eleman Arrayda olsaydi kacinci sirada olurdu bunu verir,
        //eleman var ise index olarak; yok ise -sayi verir
        // normal siralama yapar >> negatif index olamaz, o yuzden yok olan negatif sira normal siradir

        Arrays.sort(names); //binarySearch() kullanmadan once mutlaka sort() methodu kullan
        int result = Arrays.binarySearch(names, "U"); //Arrays classinda bulunan binarySearch methodu kullanarak U elemanini bul demek
        System.out.println(result); //-6 >> U elemani olsaydi 6. index de olurdu


        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s =                  "Java is easy. Learn Java earn money.";
        //                             1  2   3     4      5    6   7    String >> length
        System.out.println(s);
        String words[] = s.split(" "); //word isminde data // array ler icin split methodunda yine string atar; fakat mutlaka [] koseli parantez ile Array oldugunu soyle

        System.out.println(Arrays.toString(words)); //[Java, is, easy., Learn, Java, earn, money.] //split edilmis hali

        System.out.println(words.length); //7 >> adet words>>  words Stringinde length >> eleman sayma islemi yapar





    }//main
}
