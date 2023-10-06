package p17_Method_Creation.C02_Method_OverLoading.Vargags_PassBy;

public class Varargs {
    public static void main(String[] args) {
int sum = toplamaYap(1, 2,10,21,32); //istedigimiz kadar eleman girebilirz
        System.out.println(sum); //66 --> istedigimiz kadar eleman girebilirz, Varags yapisi (3 nokta) islemi her turlu yapmasini saglar



    }//main

    public static int toplamaYap (int... a){ // 3 nokta ile  methoda limitsiz eleman ekleyerek olusturma yetkisi verdik
        int sum = 0;   //etkisiz eleman sepeti, gelenlere yer acar
        //      int a ilk sepet (1, 2,10,21,32)
        for (int w :a ) {
            sum = sum+ w; //sepetin son hali; sum(0) ve w'ye atanan eemanlari tolayip tek tek tekrar sum SEPETIne atar
        }
        return sum; //yukarida print ederken buradan cagrilir (call), yukari return eder
    }

//toplama islemi yapan bir method olusturun
   /* public static int toplama(int a, int b){
        return a+b;
    }
    public static int toplama(int a, int b, int c){
        return a+b+c;
    }
    public static int toplama(int a, int b, int c, int d){
        return a+b+c+d;
    }
    */


//NOTLAR
    //!!!! Java kullanilamayan kod oldugunda hata verir
    //public static int toplamaYap (int... a, int...b) // a ya sonsuz veri girilebilir, FAKAT b ye sira gelmez, b kullanilmaz
    //public static int toplamaYap (int a, int...b) //olur, a girilir, sonsuz b istenilirse girilir, tum kodlar kullanilir


    //1) Bir method parantezinde birden fazla varargs kullanilmaz
    //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir !!!


    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya Varargs diyoruz
    //Varargs arka planda Array yapisini kullanir





}//class
