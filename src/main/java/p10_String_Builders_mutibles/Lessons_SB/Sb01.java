package p10_String_Builders_mutibles.Lessons_SB;

public class Sb01 {
    public static void main(String[] args) {

 /*
        1) "StringBuilder" class da String ureten bir classtir.
        2) String class kullanarak String üretiriz, java nicin StringBuilder classi da olusturdu?
            String class "immutable" (degistirilemez) string uretir,
            StringBuilder Class "mutable"(degistirilebilir) string üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
         */

        //Immutable --> String Class
        String s = "Java";          //s sepetine "Java" variable atadi
        String t = s + "!";         // "Java" + "!" ekelemek icin --> t sepeti olsuturdu ve s+! olarak veriyi olusturdu
        String w = t + "?";         //"Java"+!+? yapak icin ise w sepeti olusturuldu ve t+? olarak veriyi olusturdu


        /*
        String i degistirdikten sonra ayni stringe assign ederseniz java yine, yeni bir container olusturur
        degismis degeri bu yeni containerin icine koyar ve eski container i gosteren pointer yeni container a yonlendirilir
        dolayisiyla eski container adressiz kalir ve "Garbage Collector" adressiz olan containerlari siler
         */
        String a = "Money";
        a = a + "  More";
        //a = "Money More" olur memory de son hali


        //Mutable
        StringBuilder sb1 = new StringBuilder("Python");
        sb1.append("!");    //append(): String builder ekleme methodu
        System.out.println(sb1);//Python


        //StringBuilder olusturmanin ikinci yolu
        StringBuilder sb2 = new StringBuilder();

        System.out.println(sb2.length());//0  //data depolama yerinin kullanilan kismini Length() tanimlar(anlami degisti burada)
        System.out.println(sb2.capacity());//16 --> capacity() methodu otomatik olarak 16lik alan acar javada/ yeterli degilse bir 16+2lik alan daha acar
                                            //yetmez ise yine var olan kutunun (2x kati + 2 kutu) daha ekler
        sb2.append("Java"); //sb2 length() olarak 0 idi alan acildi, append ile "Java" eklendi
        sb2.append("xxxxxxxxxxxxxxx");// son haline 15 ade "X" eklendi direk orjinal dataya

        System.out.println(sb2.length());//19 --> "Java + 15X" --> 19 adet karakterdir
        System.out.println(sb2.capacity());//34 --> capacity() ile 16*2+2  ==> 34 otomatik ek alan acti

        //capacity ve length arasindaki fark nedir?
        /*
        capacity java nin size verdigi data depolama yer sayisidir, length ise size verilen data depolama yerinin kullanilan kismidir
        ==>Java  baslangic olarak size capacity 16 olarak verir,
        Siz eger verilen bu capacity i asarsaniz java yeni capacityi varolanin 2 katinin 2 fazlasi olacak sekilde ayarlar
        16=> 16*2+2  ==> 34   ===> 34*2+2  .....
         */

        //StringBuilder olusturmanin 3. yolu
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("ali");
        //burada otomatik olarak 16lik alan degil 3luk alan actik --> StringBuilinf icerisinde int deger yazilirsa capacity methodunu secerek alani kendimiz ayarlayabilirz
        // memoryi idareli kullanmak icin StringBuilder methodundan (int capacity) ile alan miktarini kendin ayarlayabilirsin

    }//main



/*
    lenght: karakter sayisini verir
    subString: ilk girilen indexten baslayarak 2.indexe kadar yazdirir eger 2.index girilmezse ilk indexten sona kadar alır
    charAt: girilen indexteki karakteri dondurur
    contains:  durumunu kontrol eder
    replace-replaceAll: icindeki datayi degistirmek icin kullanilir regex kullanarak degistirmek icin replaceAll kullanilir
    trim: bastaki ve sonraki bosluk karakterlerini siler
    split: bolmek icin kullanilir
    equals: esit mi diye kontrol eder =='den farki referans degerine bakmaz
    equalsIgnoreCase: buyuk kucuk farketmeksizin esit mi diye kontrol eder
    toUpperCase: harfleri buyultur
    toLowerCase: harfleri kucultur
    isEmpty: bos mu diye kontrol eder yada hiclik mi diye
    isBlank: bos mu diye kontrol eder eger bos degilse icinde sadece space(bosluk) karakteri var mı dyie kontrol eder
    startsWith: ne ile basladigini kontrol eder
    endsWith: ne ile bittigini kontrol eder
    indexOf: girilen karakterin gordugu ilk indexini bize verir
    lastIndexOf: girilen karakterin son gordugunun indexini verir
    valueOf: variable'lari birbirine donusturmeyi saglar
    concat: birlestirme islemi yapar
*/
}//class
