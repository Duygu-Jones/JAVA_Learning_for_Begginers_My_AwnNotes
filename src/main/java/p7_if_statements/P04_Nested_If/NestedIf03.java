package p7_if_statements.P04_Nested_If;

import java.util.Scanner;

public class NestedIf03 {


    /*
    Kullanicidan bir harf girmesini isteyiniz

    Girilen harf kucuk harf ise; harfin "a" olup olmadigini kontrol edin
    Harf "a" ise ekrana "ilk kucuk harf" yazdirin
    degil ise; "ilk kucuk harf degil" yazdirin

    Girilen buyuk harf ise harfin "Z" olup olmadigini kontrol edin
    Harf "Z" ise ekrana "son buyuk harf" yazdirin
    degil ise "Son buyuk harf degil" yazdirin
     */
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char h = input.next().charAt(0);

        if (h>='a' && h<='z') {
            if (h =='a') {
                System.out.println("ilk kucuk harf");
            }else {
                System.out.println("ilk kucuk harf degil");
            }
        }else if(h>='A' && h<='Z') {
            if (h == 'Z') {
                System.out.println("son buyuk harf");
            } else{
                System.out.println("son buyuk harf degil");
            }
        }else {
            System.out.println("gecerli bir karakter giriniz");
        }
        input.close();
    }


}
