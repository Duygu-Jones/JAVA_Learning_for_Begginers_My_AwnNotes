package p23_Collections.Lessons_Collections;

import java.util.LinkedList;

public class L01_LinkedList {
    /* NOTLARIM
    Linked listler array listler de yapilamayan isleri yapmasi icin uretilmistir
    arraylistlerde index yapisi oldugu icin listeye eleman ekleme veya silme isleminde arrayListler cok
    is yapar, zorlanir
    Listed Listlerde ise index yapisi yoktur, 2 odali vagon gibi; ilki eleman, ikincisi ise
    kendisinden sonraki karakteri gosteren pointer ok isareti yer alir. bir sonraki vagona baglar,
    bu ikili yapiya yani en kucuk birimine NODE denir. eleman gelip gittiginde, index yapisi olmadigi icin
    kolayca siler ve ekler.
    elemanlar birbirine pointer lar ile iliskilendirilmistir, bu yuzden ekleme silme yapildiginda yine bir sonraki elemanla iliskilenirler
    ilk elemana HEAD;  son elemana da TAIL nedir
    LinkedList ler de space bir karkterdir ===> NULL hiclik olark gosterilir

    Fakat dezavantaji ise; index yapisi olmadigi icin eleman search etmesi ve bulmasi Linked-listler pek tercih edilmez,
     tek tek bastan baslar ve vagonlarin her odasina bakarak istenen elemani bulmaya calisir ki cok basarili bir surec degildir

     indexler adres gibidir ve java da her zaman kullanilir

     !!!!!  SINIFLANDIRMA  !!!!!!!

     ITERABLE =>
     =>COLLECTION =>
       => 1) LIST ===> 1) ArrayList  2)LinkedList -----> a) Queue ---- b)Deque   iliskili
       => 2) QUEUE ==> (Priority Queue) ==> 2) DEQUE
       => 3) SET ===>  1) HashSet     2) LinkedHashSet ===> SORTED SET ==> TreeSet >>>>>>SETler TEKRARSIZ yapilardir

        (Note; buyuk harfler "INTERFACE"/parent; kucuk harfler "Class"/child) ===> asagidan yukari (IS A) iliskisi vardir
        inteface lerin constracture lari yoktur, bu yuzden class olusturulamaz
        bu yuzden assingment opretator = sag tarafina interface gelemez, classlar gelebilir, sol tarafi ise ister interface
        ister class yazilabilir
        // List<String> l2 = new List<>();     ==> OLMAZ    //object const i interface olamaz, object olusturalamz cunku
        //List<String> l2 = new ArrayList<>(); ==> OLUR     //List = ve Listin alt child classindan object olusturuabilir
     */

    public static void main(String[] args) {
        // 1) LIST ler===> 1) ArrayList  2)LinkedList
        // 1) ArrayList<String> list1 = new ArrayList<>();

        //2) LinkedList ; varolus amaci listelerde hizli ekleme cikarma yapmak
        LinkedList<String> list = new LinkedList<>();
        list.add("Mehmet");
        list.add("Ahmet");
        list.add("Onur");
        list.add("Kubra");
        list.add("Tuba");
        list.add("Duygu");
        System.out.println(list); //[Mehmet, Ahmet, Onur, Kubra, Tuba, Duygu] => hem Listlerin hem DeQueue hem Queue larin berilerini alir

        list.add(1, "Duygu");      // java index gorunumlu NODE kullanir arka planda.
        System.out.println(list); //[Mehmet, Duygu, Ahmet, Onur, Kubra, Tuba, Duygu]

        list.addFirst("Rich"); //addFirst methodu ilk basa ekler
        System.out.println(list); //[Rich, Mehmet, Duygu, Ahmet, Onur, Kubra, Tuba, Duygu]

        list.addLast("Appa"); //addLast methodu last en sona ekler istenen elemani
        System.out.println(list); //[Rich, Mehmet, Duygu, Ahmet, Onur, Kubra, Tuba, Duygu, Appa]

        list.remove("Mehmet");
        System.out.println(list); //[Rich, Duygu, Ahmet, Onur, Kubra, Tuba, Duygu, Appa]

       //////CTRl + method uzerine gel bekle ve tikla; methodun aciklamasini getirir///////

         /* peek();
     Retrieves, but does not remove, the head (first element) of this list.
    Returns:the head of this list, or null if this list is empty ====NULL
     */
        System.out.println(list.peek()); //ilk elemani alir getirir silmeden, sadece (copy+paste) ile gosterir
        System.out.println(list);

        /* poll();
     Retrieves and removes the head (first element) of this list.
    Returns: the head of this list, or null if this list is empty  ====NULL
     */
        System.out.println(list.poll()); //poll methodu ise ilk node u siler ==> (cut+paste)
        System.out.println(list);//ilk elemani sildi



        /* element();
         Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
        Throws:NoSuchElementException – if this list is empty ===ERROR
         */
        System.out.println(list.element()); // element() methodu da peek() gibi ilk elemani getirir (copy+paste)
        System.out.println(list);   // fark ise peek() list bos oldugunda NULL verir; element() ise hata verir

        System.out.println(list.pop());//poll() ile pop() methodlari ilk elemenai siler ve size getirir (cut+paste)
        System.out.println(list); // fark ise poll() list bos oldugunda NULL verir, pop() ise hata verir ===ERROR



        list.removeFirstOccurrence("Mehmet");// ilk gorunumunu siler
        list.removeLastOccurrence("Mehmet");  //birden fazla ayni eleman varsa ise son gorunumunu sil der

         /*
        1)Arraylistler eleman silme ve eleman eklemede basarisizdirlar
          O yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2)Linkedlistler index kullanmadiklarindan eleman ekleme ve silmede re-index yapilmasina gerek yoktur
        Buda linkdelistleri eleman ekleme ve silmede cok basarili hale getirir
        3) Arraylistlerde search islemi kolay yapilir, cunku indexler adres gibidir
        4) Linkedlistlerde search islemi zor yapilir cunku linkedlistler index kullanmazlar
        index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir
         */






    }//





}//
