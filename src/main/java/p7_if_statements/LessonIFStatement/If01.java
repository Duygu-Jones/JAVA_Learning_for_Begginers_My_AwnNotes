package p7_if_statements.LessonIFStatement;

import java.util.Scanner;

public class If01 {

    public static void main(String[] args) {

        //Example: görev 1-)Verilen(Scanner) bir sayinin-
        // 2-)pozitif, 3-)negatif veya 4-)notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir sayi giriniz...");//çıktıda kullanıcının göreceği mesaj
        int num = input.nextInt(); //kullanıcıdan alınacak verinin geleceği yer

        if (num>0){ //eger sayı 5 girilseydi 0 dan büyük (true) ve Java bir tane True buldu ise girişte, diğer
            //kodları kontrol etmez, tasarruf eder;
            System.out.println("Pozitif.."); //yani 5 buradan geçer ve diğer "else if" ve "else" kodlarına dönüp bakmaz.

        }else if(num<0){
            System.out.println("Negatif..");

        }else{ // "else" sonda bir tane olur, "if statement" sonu demektir son kod olmalıdır (yani hiçbiri-tanımsız-crash-üçüncü senaryo)
            System.out.println("Notr..");
        }


    }//main

}
