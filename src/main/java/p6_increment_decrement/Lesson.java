package p6_increment_decrement;

public class Lesson {

    public static void main(String[] args) {

        //Increment : arttırma
        int a = 5;
        System.out.println(a);

        a=a +2;
        System.out.println(a); //7

        a += 2; // a= a+2 gösteriminin farklı yolu 1
        System.out.println(a); //9

        //Decrement : azaltma
        int c = 8;
        System.out.println(c);

        c = c - 3; //5
        System.out.println(c);

        c-=3; //2
        System.out.println(c);

        //Increment 2 //çarpma ile arttırma
        int d = 6;
        System.out.println(d); //6

        d = d*2;
        System.out.println(d); //12

        d*=2;
        System.out.println(d); //24

        //decrement 2  //bölme ile azaltma
        int e = 24;
        System.out.println(e); //24

        e = e/2;
        System.out.println(e); //12

        e/= 2;
        System.out.println(e); //6

        //1 ile increment >>> özel yöntem; bir tane artı işareti "+" bir"1" demek
        int f = 13;

        f = f + 1; //no
        f+= 1; //no
        f++;  // yes> java basit sever, en basit syntax bu ve böyle kullan (advance level kod writing)

        //Javanın geliştirdiği son pratik yol, 1 ile artışlarda 1 tane + da aynı işlevi görür.
        // a=a+1 == a+=1; ==> a++;

        //1 ile decrement aynı şekilde;
        int h = 9;

        h = h -1; //no
        h-= 1; //no
        h--;  // yes kullanılır.


        //post-increment   / pre-increment

        //Java soldan sağa çalışması nedeni ile, post++ şeklinde 1 toplamlarında sırayla;
        //data type+ Vname = Vdeğeri +işlem + sayı

        //post-increment
        int i = 10;
        int k = i++;
        System.out.println(k);//10
        System.out.println(i);//11
        //post-increment ile ilgili ÖNEMLİ DETAY;
        // Java soldan sağa okur, k değeri burada 10 geliyor, i değeri ise 11>>>
        //nedeni; int k = i++; //son kod üzerinde java soldan sağa giderken ilk k değerini okudu, = operatöründen sonra sonra i gördü ve hemen solundaki variablea yani k'ya atadı (k=i) oldu
        //java yoluna devam ederken + gördü toplama için ve tekrar bir + daha gördü(+1) olarak algıladı)
        //Fakat JAva geriye gitmez iş işten geçti dedi ve +1'i ilk değere yani i'ye ekledi işlemini tamamladı
        // sonuç olarak k yı ıskaladı, +1 değerini = sonrasındaki etikete ekledi, ve sonra kullanılmak üzere sakladı ne olur ne olmaz diye:)


        //pre-increment te ise
        ////data type+ Vname = sayı + işlem + Vdeğeri
        int m = 15;
        int n = ++m;
        System.out.println(m);//16
        System.out.println(n);//16
        //post-incr ÖNEMLİ
        // Java yine soldan sağa gidiyor >> int n = ++m; // sırayla; n, =, (+1), +, m görüyor
        // = den sonra ((+1) + m) normal işlem olarak algılar, sayısal değeri direk kutuya atmaz, işlem varmı ona bakar, işlemi yapar ve ='in solunndaki n'ye atama yapar.



        //ornek
        int p = 17;
        int r = p--;
        System.out.println(p); //16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s); //19
        System.out.println(t); //19











    }
}
