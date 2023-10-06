package p18_Constructors.Constructors_ve_MethodCreation;

public class Car {
    //araba ozellikleri icin variable (Features/pasif ozellikler) olusturalim
    String brand= "Honda";
    String model= "Civic";
    int year = 2023;
    boolean hybrid = true;

    //default const ile olusturdugumuz obje icin default deger disinda deger atamak istiyorsak;
    //once objeyi olusturmali sonra tum ozelliklere tek tek assignment etmeliyiz- deger atamasi yapmak

    //Obje olusturmaya hazirlik icin;
    // Deger atama islemini obje olustururken yapmak istersek atama yapacagimiz variable lari iceren bir const olusturmaliyiz
    //Bu durumda this. ile yolladigimiz degerleri instance variable'lara assign ederiz=> arguman olarak girilen degerlere sahip olurlar.
    // yoksa---->!!! bu variablelarin kullanildigi objelerin argumanlari--> default degerlere sahip olurlar
    public Car(String brand, String model, int year, boolean hybrid){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;

    //Kaliplari olusturdurk; main classta bu kalibi kullanarak birden fazla araba model, marka uretebiliriz
    }


    //Methodlar (functions=aktif/aksiyon ozellikler) olustur
    public void hareket(){  //Car'in hareket ozelligi methodla olusturuldu, birsey return etmesine gerek yok
        System.out.println("Honda hizli hareket eder");
    }

    public void dur(){ //stop ozeligi
        System.out.println("Honda guvenli bir sekilde durur");
    }

    //otomatik toString olusturma;  aksiyon olusturmak icin kullanilan methodtur
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

    //!!! toString methodu; referanslari degil, olusturdugumuz objeyi yazdirir
    //classta objeleri yazdirmak istedigimizde, referanlarisini yazdirir,
    // bunu engellemek icin yani girdigimiz objeyi yazdirmak icin toString methodu kullanilir

    //toString methodu getirme yolu:
    //class icersinde bos alan sag tikla
    //generate tikla
    //gelen menude ToString tikla
    //son gelen menude bir seyi degistlrime OK tikla



    //constracter otomatik olusturma; // object ozelliklerini olusturmak icin

    public Car() { //parametresi constructor
    }

    //parametreli const; istedigimz parametreleri secerek veya tamamini secip olsuturulur
    public Car(String brand, int year) {
        this.brand = brand;         //this.brand ile bu class daki brand="Honda" variable i refere edilir. eger bu classin bir parent i olsaydi ozellikle this belirtmek sarttir
        this.year = year;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }



    //Constractors otomatik getirme yolu:
    //class icersinde bos alan sag tikla
    //generate tikla
    //gelen menude Consractors tikla
    //son gelen menude bir ozellik(leri) sec ve  OK tikla


     /*
    Constructor nedir?
    Classtan object olusturmamizi saglayan code blacklaridir
    Class olusturdugumuzda java bize otomatik olarak bir constructor verir
    Ama bu constructor gozle gorulmez, gözle gorulmeyen otomatik olarak java tarafindan verilen
    bu constructor lara default constructor denir
    default constructor ===> Car () {}

    Car(){

    }

    //class ismi ile bos DEFAULT constructor==>
    //biz yukarda cesitli constructorlarimizi olusturdugumuz icin bu aktif degildir(silik renk olarak java bunu bize soyler)

    *siz kendi constructor inizi olusturdugunuz zaman java default constructor i siler

    Constructor nasil olusturulur; syntex
    Access Modifier + Class ismi + () + {}

    Method ile Constructor arasindaki fark nedir?
    1)Methodlarda return type olur, constructorlarda olmaz
    2)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
    3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir
    4)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar

    Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip objecteler olusturabiliriz

     */

    //------------------------------------------------------------------------------

    /*
    Inheritance oop icerisinde Constructor;
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
     */





}//class
