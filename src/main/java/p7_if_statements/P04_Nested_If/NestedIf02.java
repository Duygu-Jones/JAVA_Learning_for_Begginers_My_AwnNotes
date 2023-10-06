package p7_if_statements.P04_Nested_If;

import java.util.Scanner;

public class NestedIf02 {
    /*
    Kullanicidan cinsiyetini girmesini isteyiniz

    Erkek ise yasini kontrol ediniz
    YAsi 18 den kucuk ise erkek cocuk
    yasi 18 den buyuk ise Yetiskin Erkek yazdirin

    kadin ise yasini kontrol ediniz
    Yasi 18den kucuk ise ekrana Kiz cocuk
    Yasi 18 den buyuk ise kadin yazdiriniz

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String gender = input.next();
        System.out.println("Lutfen yasinizi giriniz");
        int age = input.nextInt();

        if (gender.equalsIgnoreCase("Erkek")) {
            if (age<18) {
                System.out.println("Erkek cocuk");
            }else {
                System.out.println("Yetiskin Erkek");
            }

        } else if (gender.equalsIgnoreCase("Kadin")) {
            if (age<18) {
                System.out.println("Kiz cocuk");
            }else {
                System.out.println("Kadin");
            }

        }else {
            System.out.println("Cinsiyet tanimli degil");
        }
        input.close();

    }







}
