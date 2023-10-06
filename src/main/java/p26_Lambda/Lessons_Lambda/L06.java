package p26_Lambda.Lessons_Lambda;

import java.util.stream.IntStream;

public class L06 {

    public static void main(String[] args) {


        int sum = getSumFromSevenToSeventy();
        System.out.println(sum);

        int multiply = getMultiplicationFromThreeToNine();
        System.out.println(multiply);

        System.out.println(getFactorial(30)); //deger girmeyi burada yapariz, kullanicidan almiyoruz-scanner girmedik
        //burada faktoriyeli alinan sayi 13 ve ustu girilir ise gelecn sonuc Integer araligini gecer==> long araligina girer ve belirttigimiz data type hata verir==> exceptionnnnn!!!!

        System.out.println(getSumOfEvensBetweenTwoInteger(3,5));

    }

//4)Soru;    7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz

    public static int getSumFromSevenToSeventy(){
        return IntStream.
                rangeClosed(7,70).
                reduce(Math::addExact).
                getAsInt();
    }

//5)  3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.

    //1.yol
    public static int getMultiplicationFromThreeToNine(){
        return IntStream.
                rangeClosed(3,9).
                reduce(Math::multiplyExact).
                getAsInt();
    }
    //2.yol
    public static int getMultiplicationFromThreeToNine2(){
        return IntStream.
                range(3,10). // range(StartInclusive, endExclusive)
                reduce(Math::multiplyExact).
                getAsInt();
    }


//6)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.

    public static int getFactorial(int x){
        if(x==0){
            return 1;

        }else if (x<0){
            System.out.println("Gecersiz data girdiniz");
            return -1;

        }else{
            return IntStream.
                    rangeClosed(1,x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
    }

//7)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenTwoInteger(int a, int b){

        if(a>b){                //a;10, b;2 verir ise araligi java alamaz kafasi karisir
            int temp = a;
            a = b;
            b= temp;
                                //a>b oldugu durumlar icin parametreleri yerdegistirdik ki bu durumu ortadan kaldirdik
                                //a>b ise swap yap dedik
        }
        return IntStream.
                range(a+1,b).
                filter(Utils_for_L06::isNumberEven). //util class da olusturmustuk
                sum();
                            //yukariya if conditon ekle istisna durumlar icin (a>b
    }


























}///



