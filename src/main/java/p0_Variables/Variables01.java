package p0_Variables;

public class Variables01 {
//
    public static void main(String[] args) {

        //Variable nasil oluşturulur?
        //Data Type + Variable name + Assignment Operator(Atama operatoru) + Variable Degeri + noktali virgul
        int         age                         =                               135                  ;

        System.out.println(age) ;

            /*
            Java da temelde iki tip data vardir
            1)primitive data types: Javanın oluşturduğu belli kavonazlardır
                char, boolean, byte, short, int, long, float, double

            2)non-primitive data type: class sayısı belli olmayan
                String

            */
        //1) Primitive data types
        //char data type :  2 byte
        //Tek karakterler icin kullanilir. Sayi, sembol yada harf farketmez
        //örneğin ==> A, x, ?, 5
        //Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atanir.
        //Data Type + Variable name + Assignment Operator(Atama operatoru) + 'Variable Degeri' + noktali virgul
        //Note : char data type da degerler her zaman tek tirnak icine kunulur
        char      isminIlkHarfi       =                                        'A'                ;


        //2) boolean data type:  1 bit (0 veya 1)
        //boolean'lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
        //Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.
        boolean isRetired = false;

        //byte data type :
        //tam sayilar icindir hafizada 1 byte yer kaplar (8 bit)
        //byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir
        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte ogrenciYasi = 15;

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1000;

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2147483648 ile 2147483647 arasindaki sayilar icindir
        //Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz
        int ulkeNufusu = 23000000;
        System.out.println(ulkeNufusu);
        // sout yaz enter a bas ==> System.out.println(); kodunun kisa yolu
        System.out.println(ulkeNufusu);

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        //Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        long cellNumberOfHumanBody = 8790000303030330L;
        //Note: Eger long a atadiginiz deger int lerin araliginda ise sonuna L koymaya gerek yok
        //ama int lerin araligi disinda ise bunun long oldugunu sonuna L koyarak javaya söyelemeliyiz
        long weightOfSun = 89898;

        //float data type:
        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
        //float memory'de 4 byte yer kaplar.
        //Note: float oluşturdugunuzda sonuna f veya F koyulmali. Cunku Java ondalıklı sayıları otomatik olarak Double kabul eder,
        // float yerine double da yazılabilir.
        double gomlekFiyati = 299.99;
        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun
        float shirtPrice = 299.99F;

        // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla alir
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun
        double weightCell = 0.0000000000015;
        System.out.println(weightCell);
        //1.5E-14 ==> 1.5 carpi 10 uzeri -14 demektir



    }
}
