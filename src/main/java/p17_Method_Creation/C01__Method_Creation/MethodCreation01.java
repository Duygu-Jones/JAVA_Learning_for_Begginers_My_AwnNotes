package p17_Method_Creation.C01__Method_Creation;

public class MethodCreation01 {
    public static void main(String[] args) {


        /*
        Java da method nasil olusturulur?

        1) //main methodun disinda classin icinde olusuturulur
        2)Access Modifier + return type + Method ismi + () + {  }

        3)Olusturulan method nasil kullanilir?
            a)Method olusturmak methodu calistirmak icin yeterli degildir
            b) Methodu calistirmak icin burada main method icersiinde "RUN" motorlari olusturulup calistirilmalidir
         */




        //2.adim; methodu buraya cagir ve calistir; onun icin bir "main (motor)" olusturmus olunur teknik olarak
        //Method call : "main method icinde bir method kullanilmasina method call denir"

        int sonuc =toplamaYap(3,5);     // method Call yapildi ve primitive data type return edilerek bize sonuc dondurdu(somut olarak)
        System.out.println(sonuc);



    }//main method sonu

    //ornek 1 :toplama islemi yapan bir method olusturunuz
    //1.adim; method burada main disinda; class icinde olusturulur
    public static int toplamaYap (int a, int b) {   //method olusturma syntaxi //primitive data type kullanildi--> return keyword kullan
        return a+b;                                 //atanan datayi yukari return() et methodu
    }

        /*
    gercekte/is hayatinda, kodlar burada "main method disinda" olusturulur (methodlar)
    yukarda (main method icinde) ise sadece bu olusturlan methodlar calistirilir, cagrilir (RUNner)
         */


}//class sonu
