package p10_String_manipulations.Lessons_StringManip;

public class SM_01 {
    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "String de "Java is easy" kullanilan character sayisini bulunuz

        int sLength = s.length(); // length caracter sayisini sayiyor (length; boy, uzunluk..karakter sayisi)
        System.out.println(sLength); //12

        //Example 2: 'String de ilk indexte bulunan caracteri ve son indexte bulunun karakteri aliniz'

        //Note: index >> space tusu da dahil tum karakterlerdir ve 0`dan baslar sonsura gider, herseydir
        //Java is easy >> J-a-v-a-_-i-s-_-e-a- s - y
        //                0-1-2-3-4-5-6-7-8-9- 10- 11

        char firstChar = s.charAt(0); //firstChar= ilk karakter demek ve indexte herzaman 0 dir
        System.out.println(firstChar);//J

        char lastChar1 = s.charAt(11); //manuel sayim ile 11.index son index oldugunu gorduk
        System.out.println(lastChar1);//y

        //-1 otomatik olarak kelimenin en sonundaki karakteri getirir ===> dinamik kod syntex i boyle olmali
        char lastChar2 = s.charAt(s.length() - 1); //length=toplam karakter sayisi-1 = son index i verir her zaman
        System.out.println(lastChar2);//y

        //Note: index her zaman 0 dan baslar bu nedenle  s.charAt(0) dynamic olarak herzaman ilk indexi verir
        //Note2: index no olarak s.length()-1 girersek bu bize dynamic olarak her zaman son indexi verir.
        // .length() methodu karakter sayisini sayar, index 0 dan baslamasi nedeni ile
        //   son karakterin index numarasi icin lenght alinir -1 cikarilir //char lastChar2 = s.charAt(s.length() - 1); gibi.


        //Example 3: "s" String'indeki ilk 4 characteri aliniz.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. anlami= [0,4) seklindedir
        //substring()==> stringde bulunan karakterlerden bir aralik istenirse onlari getirir, alt string demektir. alk kume gibi
        // DIKKAT: araligi da yazarken ilk index ve istedigimiz son indexten bir fazla girilmeli ki son aralik dahil degildir, orn; [0,4)

        //Java is easy >>  J-a-v-a-_-i-s-_-e-a- s - y
        // indexe gore>>>  0-1-2-3-4-5-6-7-8-9- 10- 11   ; index 0 dan baslar
        //karakter sayisi> 1-2-3-4-5-6-7-8-9-19-11- 12   ; normal karakter sayma 1 den baslar

        String sub1 = s.substring(0, 4);  // 0 dahil 4 degil >> 0-1-2-3. karakterleridir== >> J-a-v-a
        System.out.println(sub1);//Java

        //Example 4: "s" String'indexi "is" kelimesini aliniz. // [5 ve 7), [is )
        String sub2 = s.substring(5,7);
        System.out.println(sub2);//is

        //Example 5: "s" String'indeki "easy" kelimesini aliniz. //[8,12)
        String sub3 = s.substring(8,12);
        System.out.println(sub3);//easy

        //2.yol
        //Bir characterden baslayarak sonuna kadar almak isterseniz o zaman tek parametreli kullanabilirsiniz
        //.sunstring i secerken 2 farkli secenek gelir, eger sadece (beingIndex) secilirse bastan baslar sonuna kadar otomatik yazdirir
        //(beingIndex ve endIndex) ise girisi ve bitisi belirtir ve onu yazar

        //tekrar `easy` yazdirmak icin (sadece beingIndex secerek)

        String sub4 =s.substring(8); //ilk indexi yazmak yeterli, otomatik olarak sonuna kadar yazdirir
        System.out.println(sub4);//easy

        String sub5=s.substring(5,7);
        System.out.println("sub5 = " + sub5); //sub5 = is


        //Example 6:  "s" String'inde "easy" kelimesinin var olup olmadigini kontrol ediniz.==> contains?=True-1/False-0
        boolean isExist =s.contains("easy");
        System.out.println(isExist);//true


        //Example 7: "s" String'inin belli bir harf/kelime ile baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java"); //kontrol etmesini istedigimiz stringi icine yaz, baksin
        System.out.println(isStart);//true

        //Example 8: "s" String'inin "easy" ile bitip bitmedigini kontrol ediniz.

        boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd);//true


        //Note: ındex demek ılk karakter dahıl ıkıncı karakter degıl >> örnek (0 ve 4) karakterleri
        //  0.karakter dahıl >> 4.karakter degıl demek
        // Stringler Case sensitive dir yani buyuk kucuk harf algilar/ belirtilmedigi surece ignore etmez

    }//main
}
