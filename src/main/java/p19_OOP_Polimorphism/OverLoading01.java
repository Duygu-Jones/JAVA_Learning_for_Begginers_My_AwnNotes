package p19_OOP_Polimorphism;

public class OverLoading01 {
    public static void main(String[] args) {

       // Merhod Over Loading; ayni isimde farkli methodlar olusturmak icin var
        //bir isme birden fazla method over load etmek:)

        //methodlar icerisinde (.method() ) seklinde noktadan sonra gelen methodlari gorunteleyip
        //bir method ismi icersinde birden fazla gorev yuklenmis, ugun olan secilerek, methoda biz karar veririz


        add(3, 5);
        add(3, 5);



    }//main ends

public static void add(int a, int b){
    System.out.println(a+b);                     // (int && int) overloading

}
    public static void add(double a, double b){
        System.out.println(a+b);                 // (double && double) overloading

    }
    public static void add(double a, int b){
        System.out.println(a+b);                 // (double && int) overloading

    }
    public static void add(int a, double b){
        System.out.println(a+b);                  // (int && int) overloading

    }
    public static void add(int a, int b, int c) {  //int && int && int)
        System.out.println(a + b + c);
    }

    // int== 3          (tam sayilar)
    // double == 3.5    (ondalikli virgullu buyuk datalar idi)

    // main method icersinde sadece int degerler girilip double methodlar secilir ise/ veya capraz
    //buyuk datayi kucuk dataya sıkıştırma islemine "Auto Narrowing" --> AN

    // main method icersinde sadece double degerler girilip int methodlar secilir ise/ veya capraz
    //kucuk datayi buyuk dataya sigdirma islemine "Auto Widening"    ---> AW


     /*
    1)Method Overloading yaparken method ismi degistirilmez add(a, b)
    2)Method Overloading yaparken parametreler degistirilir (a, b)
        a) Parametre degistirilirken parametrelerin data typelari degistirilebilir (int, double, float)
        b) Parametre degistirilirken parametrelerin data typelari farkli ise yer deegistirilebilir (double a, int b)
        c)  Parametre degistirilirken parametrelerin sayisi degistirilebilir (a, b, c)
    3) java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir add(int a, double b) ==add(double a, int b)
       Bu yüzden ismi ve parametre Method "Signature" olarak adlandirilir

    4) Method overloading olustururken return type (void/int...) i degistirmenin hicbir etkisi yoktur
    5) Method overloading olustururken access modifier (public/private) i degistirmenin hicbir etkisi yoktur
    6) Method overloading olustururken static ( veya non-static yapmanin hicbir etkisi yoktur
    7) Method overloading olustururken body i  degistirmenin hicbir etkisi yoktur


    8) private methodlar overload edilebilir, ayni class icersinde.
    private olarak baska classlara gidildiginde problem olur, biz overloading ayni classta yapariz

    9) static methodlar overload edilebilir
    overloading yapmak icin method isimini degistirmeden method signature i degistiririz, dolayisiyle method signature degistirildiginde
    yeni bir method olusturmus oluruz bu nedenle static olmasi bir seyi degistirmez


    //Note; Static; herkes tarafindan gorulebilen "ay gibi" -- Non-Static; ise herkes tarafindan gorulemeyen) demektir
    //Note; void; birseey uretmeyen, sadece yapan- print eden islemlerdir, return etmeye gerek yoktur, direk print edilir

     */


}//class ends

