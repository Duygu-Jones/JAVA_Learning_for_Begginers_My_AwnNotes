package p17_Method_Creation.C02_Method_OverLoading.Overloading;

public class Car {
    //araba ozellikleri icin variable (Features/pasif ozellikler) olusturalim
    String brand= "Honda";
    String model= "Civic";
    int year = 2023;
    boolean hybrid = true;

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

    public Car() {//bos constructor
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



}//class
