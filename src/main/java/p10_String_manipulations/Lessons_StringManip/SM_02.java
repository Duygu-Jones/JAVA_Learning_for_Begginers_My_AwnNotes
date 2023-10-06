package p10_String_manipulations.Lessons_StringManip;

public class SM_02 {
    public static void main(String[] args) {


        String s = "Learn Java earn 4400$ money";

        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);//Learn Java earn dollar

        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz
        String s2 = s.replace("e", ""); //e target olarak belirtildi ve silmek icin "" tirnak icinde bosluk yani hiclikle degistir anlaminda replace et dedik
        System.out.println(s2);


            /*
                            Meshur Regex'ler (Reguler Expressions)(Duzenli ifadeler demek)

        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]
           x, q, w harfleri ==> [xqw]

        8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
        9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

    Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
        Sadece space karakteri : \\s
        Space karakteri haric  : \\S
        Sadece rakamlar        : \\d  (digit ten geliyor)
        Rakamlar haric         : \\D
    */

        //Ornek 3: s Stringindeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz

        String s3 =   s.replaceAll("[0-9]", "*");
        System.out.println(s3); //Learn Java earn ****$ money


        //Note: ismi alip (.) nokta dedikten sonra gelen methodlardan yapmak istediginiz isleme uygun method secilir
        //Java da her isleme uygun method vardir
        // bir kelimeyi baska birseyle degistir isin >>> .replace
        // ...su kelime var mi icin >>> .conteins
        // ...su harfi sil demek icin >>> .replace >>> (target e; replacement "") bosluk ile degistir

        //Regex: "Reguler Endex" demek >> tumu-tamami-all....


        //Ornek 4: s Stringindki rakam sayisini bulunuz
        int s4 = s.replaceAll("[^0-9]", " ").length();  //tum rakamlar haric herseyi "" hiclikle degistir ve kalanlari say demek
        System.out.println(s4); //4

        //java sayim yaparken target disindaki elemanlarin tamamini siler kalanlari sayar


        /*Ornek 4:String deki  rakam sayisini bulunuz demis
        Java, sepetin icindeki ELMA lari saymak icin elma haric digger meyvelerin tamamini siler ve
                kalan Elmalari sayar. Javanin sayma mantigi.
        Burada da once Stringde bulunan tum harf ve space dahil butum karakterleri sildi,
                en son kalan rakamlari saydi ve sonuc 4 geldi.
        Int numberOfDigits= s.replaceAll [^0-9] , replacement “ ”).length();
        Sayisal deger istendigi icin =int data type dir
        numberOfDigits >> sepete verdigimiz isim
        s.replaceAll [^0-9] >> rakamlar (^ haric isareti) haric hepsini demek
        replacement “_” >>> “_” space yani hiclikle degistir demek
        .length(); >> sayma islemi yapan methodtur length; yani kalanlarin sayisini getir
        Yazdirmak icin >>> Sout (numberOfDigits); // 4 tane rakam demektir (sepette kalanlar 4400)

         */




    }//main
}
