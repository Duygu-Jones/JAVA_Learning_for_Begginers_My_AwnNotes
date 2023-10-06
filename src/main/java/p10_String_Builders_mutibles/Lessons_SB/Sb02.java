package p10_String_Builders_mutibles.Lessons_SB;

public class Sb02 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();             //reverse() methodu tersten yazar
        System.out.println(sb1);// ysae si avaJ

        //verilen index deki character silme;
        sb1.deleteCharAt(0);    //deleteCharAt() istenilen indexdeki karakteri siler
        System.out.println(sb1);      //y   -sae si avaJ

        //baslangic indexinden bitis indexine kadar(haric) olan characterleri siler
        sb1.delete(0, 3); //--> baslangic index(0) dahil- bitis indexi haric(3) bu elemanlari sil  demek
        System.out.println(sb1); // (sae) ilk (0,1,2. indexler silindi --> print edilenler ise (_si avaJ) 3.indexten sonuna kadar karakterler kaldi


        //replace(0,3,"X"); [0 dahil 3 haric) olmak üzere indexleri alir ve yerine X koyar
        sb1.replace(0, 3, "X"); // (X avaJ)--> 0.1.2.indexlerei sildi yerine X yerlestirildi -->sb1=(_si avaJ) son hali idi
        System.out.println(sb1); //

        sb1.insert(2, "999"); //insert: ekleme-takma demek --> offset ise: bastan say ve verdigim adet kadar karakter atla ve sonra str'de verileni yazdir
        System.out.println(sb1); // (X 999avaJ) --> bastan 2 karakter(0. ve 1.idexler)i atladi ve sonra 999 yazdirdi

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1); // 0
        /*
        compareTo(); iki StringBuilder i bastan baslayarak harf harf karsilastirir
        ilk harfler ayni ise ikinci harflere gecer
        ikincilerde ayni ise ucunculere gecer ....
        ve ilk farkli olan harfe gider, farkli olan iki harfin ascii kodlari arasindaki farki verir

        sonuc 0 ise alafabetik olarak ayni siradalar demektir
        sonuc -1 ise sb2 sb3 den alfabetik olarak onde demektir
        sonuc 1 ise sb2 sb3den alfabetik olarak sonra demektir
         */

        //String class da var olan ama StringBuilder class da var olamyan( split() method gibi ) methodlara
        //ihtiyac duydugumuzda toString() methodunu kullanarak String classa gecer ve o methodlari kullanabiliriz
        String str = sb1.toString().toUpperCase();
        System.out.println(str);//X 999AVAJ

        //String nasil StringBuilder a cevirilir?
        StringBuilder newSb1 = new StringBuilder(str); //--> "str"i aldik yukardan "newSb1" olarak adlandiridik ve olusturduk
        System.out.println(newSb1); //X 999AVAJ


        /*
        1) StringBuffer java da string ureten bir diger classtir.
        StringBuffer java nin string uretmek icin olusturdugu ilk classtir

        2) StringBuffer, StringBuilder'a cok benzer, yani ikiside "mutable" string uretir
        3) StringBuffer "multi-thread" dir, ama StringBuilder "multi-thread" degildir. --> (multi-task)- coklu is yapabilme
        4) StringBuilder  "multi-thread"  olmadigi icin StringBuffer dan daha hizli calisir
        5) multi-thread yapilirken yapilan islerin siralamasi onem arzeder, yapilan isleri mantikli bir
        siraya koymak "synchronization" olarak adlandirilir
        StringBuffer multi-thread oldugu icin ayni zamanda synchronized dir

                3 tane String olusturan class ogrendik;
                1) immutable string lazimsa ==> String class
                2) mutable string lazimsa , StringBuilder veya StringBuffer
                                a) StringBuilder i multi-thread (es zamanli siralama yapmaz) gerekmezse kullaniriz --. hizlidir
                                b) StringBuffer i multi-thread (ayni zamanda siralama yapar-multi-task) gerekirse kullaniriz -->yavasitir

         */

        //StringBuffer nasil olusturulur? --> multi-tread + Mutable + slower dur
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java






    }
}
