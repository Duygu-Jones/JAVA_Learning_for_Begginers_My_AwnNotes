package p24_Exceptions.Lessons_Except;

import java.io.FileInputStream;
import java.io.IOException;

public class E08 {
    public static void main(String[] args) throws IOException { //"throws + class ismi"  eklenmeli=> buraya istenilen sayi kadar exeptions eklenebilir
        /*
        COMPILE TIME EXCEPTION ICIN ORNEK CLASS
        main'den sonra "throws FileNotFoundException" eklenmeden once Java asagidaki objeck code da alti kirmizi cizgili idi.
        1) Rub Button'a bastiktan sonra cosole da alinana Exception alra Runtime Exception denir
        orn; AritmeticException, NullPointerException, NumberFormaetException
           Runtime Exception lara Unchecked Exception  da denir

         2) Code yazarken kirmizi alt cizgi seklinde alinan Exception larda vardir.
         Bunlara Compile Time Exceptions denir
         Ayni zamanda Checked Exception da denir


         interwiew sorusu
         throw ile throws arasindaki farklar nelerdir?
          1) throw method bodysi icinde, throws ise method parantezinden sonra kullanilir
        2) throw method bodysi icinde istenilen yerde istenildigi kadar kullanilabilir
           throws ise method signature dan hemen sonra ve sadece bir kere kullanilabilir
        3) throw dan sonra new keywordu ve constructor kullanarak object olusturulur
           throws dan sonra ise sadece Exception class ismi yazilir
        4) throw belli sartlar icin Exception firlatmada kullanilir
            throws ise bir methodun belli bir Exception u firlatabileceğini belirtmek icin kullanilir

         */


        FileInputStream fis= new FileInputStream("src\\main\\java\\day23exeptions\\file.txt");
        //class isimleri uzun oldugu zaman class isminin bas harleri yazilir==> FileInputStream==> fis

        int k =0;
        while ((k=fis.read())!=1) {

            System.out.println((char) k);
        }


        //char data type ni Integer lar ile kullanilir ise ASCII degerleri getirir





    } //





}//
