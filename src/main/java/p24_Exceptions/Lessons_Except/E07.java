package p24_Exceptions.Lessons_Except;

public class E07 {
     /*
    1) throw keywordu bir methodun bodysi icinde istedigimiz yerde istedigimiz kosullar icin istedigimiz kadar Exception
      atmamizi saglar
    2) throw keywordu yazildiktan sonra bir exception class objecti olusturulur
    3) Exception class constructor'inin parantezi icinde  istediginiz Exception mesajini verebilirsiniz
     */

    public static void main(String[] args) {
        printAge(63); //63
        printAge(313);//313

        try {
            printAge(-5);
        } catch (Exception e) {

            System.err.println(e.getMessage()); //Age can not be negative
        }
        System.out.println("main method try sonrasi code calismaya devam etti"); //main method try sonrasi code calismaya devam etti

        //Try-Catch ile exeption olusma ihitimaline gore uygun bir cozum uretilir
    }


    public static void printAge(int age) {

        if(age<0){ //kurali burada biz belirledik ve exeption icinde mesajida bizim belirlememize java izin verir
            throw new IllegalArgumentException("Age can not be negative"); //new constracter ile Exeption objesi olusturulur
        }else {
            System.out.println(age);
        }

    //throw new constractin ile bildiri sistemi olusturulur bilgi ver deriz



    }
}
