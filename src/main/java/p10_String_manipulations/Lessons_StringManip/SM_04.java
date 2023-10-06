package p10_String_manipulations.Lessons_StringManip;

public class SM_04 {
    public static void main(String[] args) {

        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        //datayi numerik bir degere donusturulmeli, harflerden kurtarilmali, sadece rakamlar kalmali

        String newTv = tv.replace("$", " ");
        String newLaptop = laptop.replace("$", " ");

        //toplam fiyati bulabiriz artik


        //     hala stringler            "456.99"                    "875.99"
        Double totalPrice = Double.valueOf(newTv) + Double.valueOf(newLaptop);
        System.out.println(totalPrice);
        // Double.valueOf methodu>>>      456.99    +            875.99 = 1332.98

        //ACIKLAMA
        //newTv hala String "456.99" ve newLaptop "875.99"
        //.valueOf methodu sayesinde Stringi Double ceviriyor, buradan ikisi de Double olarak cikiyor
        // ve ardindan toplama islemi yapilabilir
        //valueOf() methodu Stringin icindeki datayi kullanarak (rakam var ise numerik, yok ise Length()ine bakar ve
        // mutkala bir sayisal deger ortaya koyar ve istedigimiz dataya cevirir; Double, int gibi
        //kullanimi==> int/Double.valueOf(StringName); ==> stringin icindeki veriyi al ve double/int'e cevir  ; dedik

        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "Ali Can" ==> AC

       //Harf istedigi icin Char Data type kullanilir; en doguru kullanim
        String name = " ali cAN   ";   // first string "Ali" // last String "Can"
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);
        char last = name.trim().toUpperCase().split(" ")[1].charAt(0); //ardarda method kullanimina Method Chaen denir
        System.out.println(last);

        //my Way; try1: String uzerinden de islem yapilabilir ama dikkatle, split()'u arrayList[] e donusturur
        String word1 = String.valueOf(name.toUpperCase().trim().charAt(0));
        System.out.println("word1 = " + word1); //A
        String word2 = String.valueOf(name.toUpperCase().trim().split(" ")[1].charAt(0));
        System.out.println("word2 = " + word2); //C
        System.out.println("word1+word2 :" +word1+word2); //AC

        //ACIKLAMA
        //Stringi duzeltelim once; " ali cAN   "
        //trim() methodu bir Stringin sadece __bastaki ve sondaki space__ lerini siler, ortadakilere dokunmaz "ali cAN" oldu
        //.toUpperCase() methodu tum harfleri buyuk harfe cevirir.>>> "ALI CAN" oldu
        //.charAt() methodu istedigimiz characteri getirir, yani bize Ali nin A si (yani ilk index 0) lazim ilk olarak, charAt(0);A
        // soyismin ilk harfini C  alacagiz bunun icin;
        //.split()methodu istedigimiz yerden Stringi boler; "ALI CAN" aradaki space boslugundan bolsun istedik, "" cift tirmakla belirttik; .split(regex" ")
        // yani>>>>>>>>>>>>>>>>>>>>  ALI  |   CAN  seklinde 2 string olur ve ortadan boler >>
        // kelimelerin indexi  >>>>  [0]. ve  [1]. index seklinde olur ve bize >>> [1]. index CAN lazim >>>split(" ")[1]. yazdik
        //  bize CAN stringinden 0.index lazim>> "0.C - 1.A - 2.N" kelime icerisinde index siralamasina gore  ; >>.charAt(0);
        //>>>>>>>>>>>>>>>>   char last = name.trim().toUpperCase().split(" ")[1].charAt(0); >> buna da "Method Chain" denir, sirali methodlar

        //yazdirmak icin de;
        System.out.print(first); //A
        System.out.print(last);  //C
        //      >>> birlestirdi //AC
        //'ln' siz print(); yanyana yazdirir, biz AC yazdirsin istedik.

        System.out.println("" + first + last); // AC => " " +   seklinde baslarsa concatination yapar

        //ACIKLAMA
        //println(); ayri alt satirlarda yazidir
        //println("" + first + last); ile de ayni sonucu elde etmek icin ("" +  ....);
        // cift tirnak isareti koyarsak basina, yan yana String olarak sirali yazdirmasi saglanir
        /*
        char icin gecerli bir durum bu; char da -println(first + last); seklinde matematiksel (toplama+) bir islem yapilirsa
        Java bu char characterlerin sadece ASCII degerlerini gorur ve ona gore islem yapar
        bunu asmak icin ise -println("" + first + last) parantez icine bos cift tirnak (" " +...+...) seklinde  String oldugunu java`ya soyleriz
        */


        //Example 3 : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        //karakterleri dynamic olarak aliniz
        //task: abc@gmail.com ===> gmail
        // >>>yani sadece gmail kismini alacagiz yazdiracagiz ve bu kodu dynamik olarak yapmaliyiz, yani yahoo, hotmail vs gelirse de boyle yazdirsin


        //1. yol hard coding tavsiye edilmez //a b c @ g m a i l . c  o  m
        //                                     0 1 2 3 4 5 6 7 8 9 10 11 12
        String a = "abc@gmail.com";
        System.out.println(a.substring(4, 9));//gmail // yazdirdi ==> sadece bu ornek icin doru calisir

        //.substring() methodu baslangic ve bitis indexne gore almayi saglar - fakat dynamik bir kod olmaz burada ki senaryo icin
        //kullanici adi farki olsaydi orn "abcdefgh@gmail.com" gibi bu durumda index sirasi degisir ve dynamik olaz

        //2.yol  // dynamic kod icin;
        //indexOf() methodu parantezin icerisine yazilan karakterin index ini verir
        // .indexOf() methodu kullanarak dynamic olarak sadece " gmail" yazdiralim

        int startingIndex = a.indexOf("@") + 1;
        int endingIndex = a.indexOf(".");

        String companyName = a.substring(startingIndex, endingIndex); //iki index arasindaki degeri getirir
        System.out.println(companyName); //gmail

        //ACIKLAMA
        //startingIndex = baslangic Indexi; @`den sonra baslayacak
        //a.indexOf("@") + 1; >> turkcesi>>  a stringinde @ characterinin indexinin hemen sagindaki characterin indexi icin +1
        //endingIndex = bitis indexi
        //a.indexOf(".");     >> turkcesi>>  a stringinde "." nokta characterinin indexinden bir onceki index te biter
        //NOTE; index yazdirirken [@, .) yani ilk indeki yazdirir ve son indexi dahil etmezdi bu standart, indexin calisma prensibi
        //gmail, hotmail, yahoo vs @ den sonra baslayacak ilk karakter degisebir o yuzden @ den sonra seklinde baslasin dedik
        // her mail ismi . noktadan once biter yani noktanin indexi isimizi gorur bu sefer, zaten yazilan son index dahil degil idi
        //  [@+1] [dahil>> g `den baslayan index;    haric) (.)  noktadan once biten index >>> ORNEK> [0, 4); 0 dahil, 4 haric
        //  "    abc           @    gmail     .      com"
        //  kullanici adi      @    mail      .      com

        //yazdirmak icin ise    >>>>>   String companyName = a.substring(startingIndex, endingIndex); <<<<<<<<<<
        //(mail) company Name = a Stringinde (String a = "abc@gmail.com";)
        //a.substring(startingIndex, endingIndex); methodu baslangic ve bitis indexine gore almayi saglar
        // yani; string icerisinde alt string olusturur, (mail) company Name`i string olarak getirir ve yazdirir
        // System.out.println(companyName); //gmail









    }//main
}
