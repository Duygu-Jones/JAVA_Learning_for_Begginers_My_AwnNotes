package p11_loops.LessonsLoops;

public class C1_ForLoop01 {
    public static void main(String[] args) {

        //Loop; dongu demektir, for Loop sayesiden tekrarli (sonsuza kadar gidebilecek kodlar olabilir)
        // bir kerede yazmamizi saglar

    // Example 1: Ekrana 5 kez "Hi" yazdiriniz

        //1.yol: amelelik:)
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");


        //2.yol: For Loop kullanarak:)
         /* forLoop yapisi; iskeleti:
     Java kod okuma siralamasi==>>                  >1<                      >2<                           >4<
                                    for      ( Baslangic degeri ;       Loopun calisma sarti;     Artirma/Azaltma  ){
                                            >3<  SOUT(.....tekrarli bir sekilde yazmak istedigimiz kodlar......)
          >5<. olarak basa doner
        }
         */

        //Ekrana 5 kez "Hi" yazdiriniz (1 den baslayip 5 dahil sayida yazdiracagiz)
        //  (Baslangic degeri; Loopun calisma sarti     ;  artma/azaltma)
        // 1'den basla       ; 6'dan kucuk ise calis    ; 1'den basla ve 1 arttirarak devam et)// 1 den baslar 6dan bir kucuk yani 5e kadar yazdirir

        for (  int i = 1     ;      i<6                 ;       i++     ) {
            System.out.println("Hi..");
            //Hi.. 1
            //Hi.. 2
            //Hi.. 3
            //Hi.. 4
            //Hi.. 5
        }
        //ACIKLAMA;
        /*
        (int data typeinda i degeri = 1 den baslayip; i<6 (haric)ya kadar yazdiracak; i++ baslangictan bitise 1`er arttirarak gidecek)
        sout("Hi.."); yazilmasini istedigimiz bilgiyi print ederiz.
        Java soldan >>>> saga seklinde kodu okur ve en sonra print eder, sarti saglayana kadar tekrar eder
        Yani:
        int i =1; 1<6 ise 1 adet Hi yazdirir, ==> i++ yapar ve
        1+1=2 degeri ile basa doner; 2<6 ise; ikinci Hi yazdirir; i=2 oldu son durumda; i++ yapar
        2+1= 3 degeri ile basa doner devam eder............
        ne zamanki i>= 6 yani 6 ya esit ve ya buyuk ise calismayi durdurur
        toplamda 5 adet Hi yazdirmis olur

         */


        //Example 2: 11'den 14'e kadar tum tam sayilari ekrana yazdiran kodu yaziniz
        for (int i=11;  i<15;   i++ ){
            System.out.println(i);
            //11
            //12
            //13
            //14
        }
        //ACIKLAMA;
        /*
        bizden 11, 12, 13 ve 14 u yazdirmamizi istiyor. soru analizi onemli
        baslangici 11 bitisi haric 15 olarak alacagiz veya kucuk esittir 14 olabilir.
        i=11; 11<15 ise yazdir, sonraki sayi icin i++= yani 11+1= 12 ile basa don
        i=12; 12<15 ise yazdir; sonraki sayi icin i++= yani 12+1= 13 ile basa don
        i=13; 13<15 ise yazdir; sonraki sayi icin i++= yani 13+1= 14 ile basa don
        i=14; 14<15 ise yazdir; sonraki sayi icin i++= yani 14+1= 15 ile basa don
        i=15; 15 < 15 ise yazdir; degildir burada java calismayi durdurur/ 15 kcuktur 15 YANLISTIR
         */

        //Example3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=40; i>22;  i--) { //decrement yani azaltma uygulayacagiz// eger sayi 2 ye tam bol ise print>>> if kullan

            if (i%2==0) {
                System.out.println(i);
                //40
                //38
                //36
                //34
                //32
                //30
                //28
                //26
                //24


            }

        }




        //(Scot/ kapsam; kod yazilan body de denir)
    }//main
}
