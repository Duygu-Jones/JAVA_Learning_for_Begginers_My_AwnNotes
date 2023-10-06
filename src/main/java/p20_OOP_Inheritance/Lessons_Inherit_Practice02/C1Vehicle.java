package p20_OOP_Inheritance.Lessons_Inherit_Practice02;

public class C1Vehicle {

    public C1Vehicle() {
        super();
        System.out.println("Vehicle 1");
    }
    public C1Vehicle(int price){
        super();
        System.out.println("Vehicle2");
    }

}

/*
NOTE1; bir constractor secmek icin bulundugun constractor icin default olan "super();" keywordunun parantezi icine
gidilmek istenen diger classdaki consractorin data typinde bir value girilir(int, string, names vs),
gidilecek parent verisi hakkinda bilgi verilmis olur.
bir vlue girilmez ise bos super(); parantezine gider
asagidaki parents ve child classlarda default super(); keywordleri gorunmez ama vardir zaten biz yazdik gorunur yaptik bu ders icin

 */

/*
NOTE2;
Parent-child classlar arasinda veya ayni classlar icinde constractor secme
Keywords;
super();--parent-child classlar arasinda
this(); --> ayni class icinde (genelde chil classlardad gerek duyulur)

1)diger classda ”super(…);”
2) ikinci classdan “this(….);”-- 2) ikinci ayni classa “super();”==
===> ayni class icinde parantez icine gidilecek constractor data typenda value yazilir

 */


 /* NOTE-HOCA;
    Child classdan bir object olusturdugunuzda constructorlar
    en ustteki parent classtan baslatilarak alta doğru calistirilir

    Child class daki constructordan Parent class daki constructor a gidebilmek icin super() kullanilir
    Parent class da birden fazla constructor varsa istenilen constructor super() ifadesinin parantezi icine
    yazilan parameterler yardimi ile secilebilir

    Ayni class icindeki constructorlari secmek icin this() kullanilir, Ayni class da birden fazla constructor varsa
    istenilen constructor this() ifadesinin parantezi icine yazilan parametreler yardimi ile secilebilir

    super() ifadesini yazmak istege baglidir, yazmasanizda java sanki default gorunmez ama var olan bir super() varmis gibi davranir.
    Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir

    super() ve this() ifadeleri constructor icinde herzaman ilk satirda olmalidir
    Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir

    Inheritance da variable ve methodlari cagirmak icin this veya super kullanilir
    *this; ayni class icindeki variable lari ve methodlar cagirmak icin kullanilir
    *super; parent class icindeki variable lari ve methodlari cağirmak icin kullanilir

     */