package p10_String_manipulations.Lessons_StringManip;

public class SM_05 {
    public static void main(String[] args) {

        //Example 1: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht
        // String ==> m e h m e t
        // index  ==> 0 1 2 3 4 5
        // indexOf("m")     >> parantezi icine yazilan karakterin yani m`nin stringdeki ilk gorunumunun indexini verir (0)
        // lastIndexOf("m") >>  m`nin stringdeki son gorunumunun indexini verir (3)
        //                               >>>  <<<
        // indexOf("m")     ==>  0
        // lastIndexOf("m") ==>  3 >> tekrarli; indexler farkli ise tekrarli character diyebiliriz; yani Stringde 1 den fazla m var

        // indexOf("e")     ==>  1
        // lastIndexOf("e") ==>  4 >> tekrarli (1 den fazla e var)

        // indexOf("h")     ==>  2
        // lastIndexOf("h") ==>  2  >> tekrarsiz; indexler ayni ise tekrarsiz character diyebiliriz; yani Stringde 1 tane h var

        //indexOf("t")      ==>  5
        //lastIndexOf("t")  ==>  5 tekrarsiz (1 tane t var)

        //Logic mantik bu sekilde
        //If ile bunun kodunu yazalim >>> yani; ilk indexOf esitmidir (==) lastIndexOf `a seklinde, If`e soralim
        //If bize tekrarli ve tekrarsiz characterleri bulsun diye // esit ise TEKRARSIZ TRUE, degilse TEKRARLI FALSE
        //bizden tekrarsizlarin yazdirilmasi isteniyor

        String s = "mehmet";

        //            0        !=               3>> FALSE
        if(s.indexOf("m") == s.lastIndexOf("m") ){
            System.out.print("m");
        }
        //            1        !=               4 >> FALSE
        if(s.indexOf("e") == s.lastIndexOf("e") ){
            System.out.print("e");
        }
        //            2        ==               2 >> TRUE
        if(s.indexOf("h") == s.lastIndexOf("h") ){   //h
            System.out.print("h");
        }
        //            5        ==               5 >> TRUE
        if(s.indexOf("t") == s.lastIndexOf("t") ){  //t
            System.out.print("t");
        }

        //hatirlatma NOTE; yazdirirken "print" dedik ki yan yana sirali yazdirsin // "println" ise alt alta yazdiriyordu


        System.out.println();   //yukardaki ve asagidaki kodlari ayirmak icin >>"bos sout()" ekle

        //Example 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //Card Numarasi (cardNum)  ==>  1234 6789 1234 6789 ==> **** **** **** 6789

        //String              >>  1 2 3 4  -  6 7 8 9  -  1  2  3  4   -   6  7  8  9
        //Istenilen           >>  * * * *  -  * * * *  -  *  *  *  *   -   6  7  8  9
        // index              >>  0 1 2 3  4  5 6 7 8  9  10 11 12 13  14  15 16 17 18
        //.substring(0, 15)   >> [0                                        15)              ;0 dahil; 15 haric
        // [0, 14) de diyebiliriz, 14. index space zaten rakam degil;
        // ayrica last kod icin yani son dort hanenin kalmasi icin yaziacak kod icin kolaylik saglayacak, 15.indexten basliyor cunku


        String cardNum = "1234 6789 1234 6789";
        String first = cardNum.substring(0, 15).replaceAll("[0-9]", "*");
        System.out.println(first);//**** **** ****

        String last = cardNum.substring(15);  // sadece beigIndexi yazdirirsar Stringi sonuna kadar yazdirir zaten endIndex e gerek yok
        System.out.println(last);//6789

        //birlestirip sirali yazdirmak icin 1.yol
        String result1 = first + last;
        System.out.println(result1);//**** **** **** 6789

        //birlestirip sirali yazdirmak icin 2.yol  //daha pratik ve okunur olan budur tavsiye edilen
        String result2=first.concat(last); // .concat() methodu CONCATINATION demek yani birlestirm/sirali yazdirma methodu idi,
        System.out.println(result2);//**** **** **** 6789

        //run shortcut>> shift + f10


    }//main
}
