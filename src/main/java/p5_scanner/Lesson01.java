package p5_scanner;

import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {

        //1.adim : Scanner class dan object oluştur.
        Scanner input = new Scanner(System.in);

        //2.adim : kullanıcıya ne istediğinize dait mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz");

        //3.adim : uygun methodu kullanarak kullanicinin verdigi data yi memorye yerlestiriniz
        byte age = input.nextByte();

        System.out.println(age);

    }

}
