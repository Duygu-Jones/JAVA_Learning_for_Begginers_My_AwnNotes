package p17_Method_Creation.C01__Method_Creation;

public class MethodCreation02 {
    public static void main(String[] args) {

        //ornek 1
        //int   yeniIsim   =  methodName (parametrelerin Argumanlari--> 3 ve 5 tir)
          int   carpmaSonu =  multiply   (3, 5);
        System.out.println(carpmaSonu);

        //Ornek 2:
        int result = carpTopla(2, 4, 6);
        System.out.println(result); //14

        //Ornek 3:
        wordPrint("Appa");  //bu method (void) direk yazdirir, bir sey uretmiyor sadece yapan method VOID


    }//main sonu





    //ornek 1 : iki sayiyi carpma islemi yapan bir method olusturunuz
    protected static int multiply(int a, int b) {   //methodName(parametreler)
        return a * b;                               //methodun yapmasini istedigimiz islem ve return keyword
    }


    //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
    public static int carpTopla(int a, int b, int c) {
        return a*b+c;
    }
    //return un kullanacagi variable llara PARAMETRE denir -->(int a, int b, int c)
    //yukarda main method icerisinde method call icerisinde girilen degerlere de ARGUMENTs denir


    //Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void wordPrint (String str){  //sadece print yapacak--->> "Void" Return Type kullanilir
        System.out.println(str);                //ve void methodlarda main icinde Call edilir, argumani main icinde atanir
    }                                           //methodun return type -VOID- ise yani bir sey uretmiyor sadece yapiyorsa, return etmeye gerek yoktr



    //NOTES;
    // Eger bir method yeni bir data üretmiyor ise return type i void olur
    //methodun return type i void ise method body icinde return keyword yazilmaz, cunku islem yapamayacak verileni print edecek

    // Method olusturmada kullanilan variable lar parametreler "parameters" olarak adlandirilir
    // Method call da kullanilan method(paremetrelerin degerlerine --> Argumanlar "Arguments" denir.




}//class sonu
