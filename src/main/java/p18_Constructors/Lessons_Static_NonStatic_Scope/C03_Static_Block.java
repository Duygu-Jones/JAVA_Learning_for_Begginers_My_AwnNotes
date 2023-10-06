package p18_Constructors.Lessons_Static_NonStatic_Scope;

import java.time.LocalDate;

public class C03_Static_Block {

    //Bir variable olsuturdugunuzda deger atamazsaniz o variable'i initialize etmediniz demektir.

    //  double pi; //;suan bu initiazlize edilmedi
    static double pi;// static keyword u ile otomatik initialize edildi fakat deger atanmadi, yine yazdirmaz

    //chef olarak gorelim main methodu asagidaki; main method calistirilmadan once varible'lar static blok ile burada hazir hale getirilmesi gerekebilir
    //static bloklar icindee initialize edilirrse o classin icinde herseyden once hazir hale getirilmis oolur
    // "static{} " bu bir static bloktur, boyle yapilir, ve bu atanan variable'i main method olmadan dahi baslatir




    public static void main(String[] args) {
        //pi=3.14;  //pi'yi burada bu sekilde initialize edilir, yukardakine de  "static" eklenerek otomatik yapildi

        System.out.println(pi);              //3-asagidaki static pi yi yazdirir.
        System.out.println("main method");
    }


    static {    //static block ilk once calisir, konumu  onemli degildir; pi degeri icin tanimlandi; yukardaki main methodundan da once calisir
        pi=3.14; //yukarda yazdirildi
        System.out.println("static block 1"); //1-Konumu onemli degil-static ilk once calisir
    }



    public static int price; //method

    static {

        System.out.println("static block 2"); //2-yazdirir

        //Subat ayinda indirim kampanyasi;
        LocalDate currentDate = LocalDate.now();
        if(currentDate.getMonthValue()==2){ //eger suan ki zaman 2.aya esit ise; pricei 1000 yap
            price=1000;
        }else {
            price=2000; // suan 2.ayda degilsek pricei 2000 yap
        }
    }







}//class
