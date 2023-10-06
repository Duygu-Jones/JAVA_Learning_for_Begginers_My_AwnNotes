package p18_Constructors.Lessons_Static_NonStatic_Scope;

public class C04_NonStatic_Instance {



    //Eger tum constructorlarin icinde calismasi gereken kodlar var ise
    // tekrardan kurtulmak icin bu kodlari
    //instance block icine yazariz
    //Instance Block tekrari onler
    public int year;

    public C04_NonStatic_Instance() { //generat-->constactor-->select none >>>>bos constactor acar

    }

    public C04_NonStatic_Instance(int year) {
        this.year = year;
    } //ikinci constactor


    {
        System.out.println("hi"); //yukardaki iki constactoru calisirken bu free block her ikisi icin de calisir, tekrar etmemek ici burada 1 kez yazilir her iki const da kullanir
    }


}//class
