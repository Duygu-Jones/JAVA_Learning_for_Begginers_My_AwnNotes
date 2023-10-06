package p4_operators;

public class Lesson {
    public static void main(String[] args) {

        /*
    1) +,-,*,/ islemleri javada matematikte kullanıldığı gibi kullanılır
        Note1: javada bir tamsayiyi başka bir tamsayıya bölerseniz sonuç her zaman tamsayı olur
        Note2: Eger sonuç tamsayı değilse java sayının ondalık kısmını iptal ederek onu int'e dönüştürür
        Note3. Bir matematiksel islemde farklı data tiplerini kullanırsanız sonuç her zaman büyük data tipinde olur.

         */

        int kisiSayisi = 10;
        int paraMiktari = 25;
        System.out.println(paraMiktari / kisiSayisi); //2

        int ogrenciSayisi = 10;
        double ucretMiktari = 25;
        System.out.println(ucretMiktari / ogrenciSayisi);//2.5

          /*
           2) Java da "logical operator" lar. AND ve OR  islemler "logical operator" lardir.

           CAY       AND     KAHVE       SONUC
           true      &&      false       false
           false     &&      true        false
           false     &&      false       false
           true      &&      true        true

           Note : AND (&&) isleminden true alabilmek icin her sey true olmalidir
           AND islemi "perfectionist" tir, bir tane bile false sonucu false yapar

           CAY       OR      KAHVE       SONUC
           true      ||      false       true
           false     ||      true        true
           false     ||      false       false
           true      ||      true        true

           Note : OR(||) isleminde bir tane true sonucu true yapmaya yeterlidir
           OR isleminde sonucun false olabilmesi icin hersey false olmalidir

           3) NOT Operatoru (!) (değildir işareti) true olani false , false olani true yapar
           !true  ==> false
           !false ==> true
           !!true ==> true

           4) Comparison (Karsilastirma) Operators
           < (kucuktur),> (büyüktür),<= (küçük eşit),>= (büyük eşit9, == (eşittir), != (eşit değildir)

           Note==> Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false)alirsiniz
         */

        boolean first = 3 < 5;          //true
        boolean second = 2 + 3 != 5;    //false
        boolean third = 2 + 3 * 5 >= 19;//false

        System.out.println(first && second );//false
        System.out.println(first || second || third );//true

    }
}
