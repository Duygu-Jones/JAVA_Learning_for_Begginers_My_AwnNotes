package p26_Lambda.Lessons_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L02 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(12,9, 131, 14, 9, 10, 4, 12, 15)); // nums Listemiz => array list olusturuldu

        //Runner lar
        //1)
        printEvenElements1(nums);
        System.out.println();
        //1a)
        printEvenElements2(nums);
        System.out.println();
        //2)
        printSquareOfOddElements(nums);
        System.out.println();
        //3)
        printCubeOfDistinctOddElements(nums);
        System.out.println();

    }

 //1) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1 ( List<Integer> nums ){  //List imizin method constructori olusturuldu

        //1.yol; //bir list yani collection ile calisacak isek ==> forEach kullanilir- yapisal code;
        for(Integer w: nums){
            if(w%2==0){
                System.out.print(w+" ");  //12 14 10 4 12

            }
        }
    }



    //1a) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method olusturunuz (functional) ----> Lambda yazim formati
    // 2.yol;
    public static void printEvenElements2 (List <Integer> nums){

        nums.stream().                                  //nums listesini Lambda yaptik===> stream() ile ==> fonctional code oldu demektir
                filter(t-> t%2==0).                     //%2==0 cift olanlari filltreledik aldik
                forEach(t-> System.out.print(t+" "));   // for(w:) yapisasl oldugunda w kullanilir, fonctional oldugunda t kullanilir (t-> lambda expression da denir)
                            //12
                            //14
                            //10
                            //4
                            //12        //stream(); akis seklinde;  fonsksiyonal oldugunu dusun
    }
    //Yeni methodlar: stream(), filter(t->... ), forEach(t-> ......)

    // stream(); ile dikey bir block seklinde lsiteyi ele alir >>>> stream; akis demektir, dikey akan bir liste gibi dusun==> code u fonctional yapar
    // fiter(condition);  ile herbir elemani t'ye atar ve herbir elemani alir 2 ye bol sayilari filtreler==> belirtilen conditiona gore filtreler
    // ve forEach(t->...) meth ile bunlari ele alir ve t+" " seklinde print eder(t+ bosluk) ==> bildigimiz forEach( : ) ile ayni fonsksiyondadir
    //daha okunur code sekli icin noktadan sonra bir alt satira code gecilebilir, daha duzenli olur


//2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk " "
    // koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements(List <Integer> nums){

        nums.stream().
                filter(t-> t%2 !=0).
                map(t -> t*t).      //donusturme var ise map() kullanilir
                forEach(t -> System.out.println(t+" "));
    }

    //selale gibi====>  . noktadan sonra bir alt satira gecirerek daha okunur bir coding yapabiliriz


 //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements (List <Integer> nums){

        nums.stream().                      //nums listesini ele alir ve stream() ile fonctional yapar
                distinct().                 //sadece tekrarsiz elemanlari secer ==> tekrarsiz olarak almayi saglar==> eleman azaltir
                filter(t-> t%2 != 0).       // t icin listedeki elem. 2 ye bolmeyenleri alir==> tek leri secer
                map(t-> t*t*t).             // t icin t nin kupunu alir ==> map(); her bir value yi donusturen method dur
                forEach(t-> System.out.println(t+ " ")); //her bir t icin " " ile birlikte yazdirir

    }
    //NOTEs;
    // Lambda da elemanlari azaltan methodlari ilk sirada kullanmak java icin daha avantajlidir, daha hizli calistirir-clean code
    // even; cift sayilar demk
    // Odd; tek sayilar
    // Distinct; tekrarsiz
    // elements; elemanlar


    //4)Bir list'teki "tekrarsiz" "CIFT" " ELEMANLARIN "karelerinin" "toplamını" hesaplayan method oluşturun

    //[12,9, 131, 14, 9, 10, 4, 12, 15] ==> ciftler; [12, 14, 10, 4]
    public static void printSumOfSquaresOfDistinctEvenElements (List <Integer> nums){
       int sum=                             //int type inda sum sepeti acilir
               nums.
                stream().
                distinct().
                filter(t-> t%2==0).
                map(t-> t*t).
                reduce(0,(t,u)-> t+u);  //identity baslangic degeri=0 // i=0: gibi
        System.out.println(sum);

        //t degerini identity;0; dan alir bos sepet gibi // u ise steam listesinden tek tek elemanlardan alir
        // identity:0;       stream listenini kareleri [144, 196, 100, 16]
        //          t                                   u
        // Example; t+u===> 0+144===> ve sonucu etksiz eleman olan identity sepetine atar ve  t  bir sonraki degerini yine buradan alir
    }


    // 5) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun
    public static void printMultiplyOfSquaresOfDistinctEvenElements (List <Integer> nums){
        int product=
                nums.
                        stream().
                        distinct().
                        filter(t-> t%2==0).
                        map(t-> t*t).
                        reduce(1, (t, u) -> t*u); //etkisiz eleman 1 dir!!! unutma
        System.out.println(product);
    }


    //6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

     //1.YOL;
    public static void getMaxValue1(List <Integer> nums){
        int max =
                nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t,u) -> t>u ?   t : u);

        System.out.println(max);

        //Integer.MIN_VALUE; int lerin en kucuk degeri olan -2 milyari.. getirir ve defoult deger olarak t ye atar. (identity yerine kullanmis olduk)
        // Ternary ile eger t > u ====> false ise ikinci value u'yu secer ve toplama sepetine (defoult) atar ve tekrar t ye atanir loop devam
    }

    //2. yol
    public static void getMaxValue2(List<Integer> nums) {
        int max =
                nums.
                        stream().
                        distinct().
                        reduce(nums.get(0), (t, u) -> t > u ? t : u); //0'dan baslar mx degere kadar gider getirir
        System.out.println(max);
    }

    //3. yol
    public static void getMaxValue3(List<Integer> nums) {
        Integer max =
                nums.stream().distinct().sorted().reduce((t, u)->u).get();
        System.out.println(max);
    }
    //4. yol
    public static void getMaxValue4(List<Integer> nums) {
        Integer max = nums.
                        stream().
                        distinct().
                        reduce(Math::max). //kisa yol t ve u gibi birsuru value kullanmadan math gider vew max formulunu kendisi tek tek uygular
                        get(); //int'e cevirmek icin kullanilir sadece
        System.out.println(max);
    }



//Example7) Verilen List'teki "minimum değeri" bulmak için bir method oluşturun
    //1.yol
    public static void getMinValue1(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                sorted().
                reduce((t, u) -> u).
                get();
        System.out.println(min);

    }

    //2.yol
    public static void getMinValue2(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()). //tersten listeyi yazdirip elemanlari ele alir==> buyukten kucuge siralmis olur
                        reduce((t, u) -> u). //t ve u reduce et ve her zaman -> u yu sec demek
                        get();
        System.out.println(min);
    }

    //3.yol
    public static void getMinValue3(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                sorted().
                reduce((t, u) -> t). ////her zaman bana t ver dedik
                get();
        System.out.print(min);
    }

    //4.yol
    public static void getMinValue4(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                reduce((t,u)->Math.min(t,u)).
                get();
        System.out.println(min);
    }


//Example8) Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi


    public static void getMinGreaterThanSevenEven(List<Integer> nums){
        int min= nums.
                stream().
                filter(t-> t>7  && t%2 ==0). //7 den buyuk cift sayilari al dedik
                sorted(). //natural ordera gore siralar
                findFirst(). // otomatik olak ilk elemani bulur getirir yani min degeri
                get();      // int sonuc ver dedik
        System.out.println(min);

    }












}//
