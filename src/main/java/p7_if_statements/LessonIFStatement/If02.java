package p7_if_statements.LessonIFStatement;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {

        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kacinci gün olduğunu giriniz...");
        byte num = input.nextByte();

        if (num == 1 ) {
            System.out.println("Sunday");

        } else if (num == 2 ) {
            System.out.println("Monday");

        }else if (num == 3 ) {
            System.out.println("Tuesday");

        }else if (num == 4 ) {
            System.out.println("Wednesday");

        }else if (num == 5 ) {
            System.out.println("Thursday");

        }else if (num == 6 ) {
            System.out.println("Friday");

        }else if (num == 7 ) {
            System.out.println("Saturday");

        } else {
            System.out.println("Hatalı bir giriş yaptınız, Lütfen 1 ile 7 arasında sayı giriniz..");

        }// şartlı verilmiş aralıktaki sayıların hepsi kritik değerlerdir ve mutlaka tek tek test edilmelidir
        // her bir sayı için değeri girip çalışıp çalışmadığına bakılır
        //örn: değere 1 girip "Sunday" verip vermediğini görmemiz lazım
        //eğer sonsuz sayıda değerler var ise sadece negatifte "o", ve eksi bir değer sayı;
        // pzitif tarafta ise rastgele bir sayı alıp test edince bütün sayılar test edilmiş olur. (konsola aralik disi sayilari girerek dene)



    }//main


}
