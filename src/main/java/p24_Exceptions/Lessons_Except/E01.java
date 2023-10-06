package p24_Exceptions.Lessons_Except;

public class E01 {

    public static void main(String[] args) {        //1-) main class olusturulur
        /*
        Exception beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda exception class i devreye girer
        Exception class i bize karsilasilan sorunun cinsini ve bu sorunun nereden kaynaklandigini ve sebebiin bildirir
        Java exception firlattiginda kodun calismasini durdurur (Stops Execution(uygulama)), ve Exeption firlatir( Throws Exeption) ve bizden bir karar vermemizi ister.
        Kodumuzun calismaya devam etmesini istiyorsak "try catch block" ile exception olusturmasi muhtemel kodlarimizi try catch blogu icinde yazmaliyiz

        Exception i handle (cozmek) edebilmek icin iki temel yol vardir
            a) Exception icin gereksinimlere göre (FRD) uygun cozumler uretebilirisiniz. Buna Exceptin Handling denir
                bunu try catch kullanarak yapabiliriz,
                try block da yapilmasi gereken islemi javadan isteriz, java islemi problemsiz bir sekilde yaparsa catch block aktive olmaz
                try block da java yapilmasi istenen seyi yaparken exception ile karsilasirsa catch block devreye girer ve catch block icindeki kodlar calisir
                try block da islem yapilirken Exception olusursa try block icindeki exception dan sonraki kodlar calistirilamaz
            b) Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Bunada Throw Exception denir
            Bu ilani konsolda gosterir, Exeption(Hatanin) oldugu yerin aderesini ve aciklamasini burada gosteriri, buna da "LOG" denir
            //Exeption/hata kodlarini bu LOG larda goruruz, okuruz, ve hatanin oldugu adres satirina bizi verdigi link ile de direk isinlayabilir

            catch satirinda ki parantez icine karsilasilmasi muhtemel olan exception class isimini ve bir object (e) yazariz
            // (ArithmeticException e); yani --> ArithmeticException bir class ismidir "e" da oblect ismidir; Exeption icin e kullanilir, farkli bir isimde verilebilir fakat gelenek e dir


        =>Yazdiginiz kod calismadiginda problemi bulmak icin log'lara bakariz
         */
        divide(12, 3);
        divide(12, 0);      //!!!!!!sayi 0'a bolunmez, tanimsiz olur hata verir

        divide2(5,1);   //3-) asagida girilen methodun calistima run burada yapilir

    }
    //ArithmeticException yazdiginiz code da matematiksel bir islem kullaniyorsaniz alinabilecek bir Exception turudur
    public static void divide2(int a, int b) {      // 2-) divide methodu olusturuldu, variable lar atandi
        //3-) try-catch block ile kodlar yazilir ve catch kisminda exaption olursa yakala anlaminda kod olusturulur

        try{                                        // bir sorun yok ise bu kismi dene calistir demek
            System.out.println(a / b);
            System.out.println("try ici görev tamamlandi");

        }catch (ArithmeticException e){          // Matematiksel tum islemlerde divide islemi icin oldugu gibi ongorulen hatalari yakalamak icin
                                                // ArithmeticException(); methodu ile tetikte ol, hata gelirse yakala ve konsolda goster demek
            System.out.println("Do not divide by zero");
        }

        System.out.println("try-catch sonrasi görev tamamlandi"); //
    }


    //Kesinlikle tavsiye edilmez--> yukardaki gibi birinci yol TRY-CATCH Blocku kullanilir
    //If-Else, hata cozum noktasinda bir cozum yolu degildir ve kesinlikle tavsiye edilmez
    public static void divide(int a, int b) {

        if (b == 0) {
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a / b);
        }
    }


}
