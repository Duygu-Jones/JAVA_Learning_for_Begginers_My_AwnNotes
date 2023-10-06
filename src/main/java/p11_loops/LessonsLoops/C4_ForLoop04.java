package p11_loops.LessonsLoops;

import java.util.Scanner;

public class C4_ForLoop04 {
    public static void main(String[] args) {

        /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */

        //  for (int i = 1; i < 5; i++) {
        //            System.out.println("Week : " + i);
        //
        //            System.out.println("Day : 1");
        //            System.out.println("Day : 2");
        //            System.out.println("Day : 3");
        //            System.out.println("Day : 4");
        //            System.out.println("Day : 5");
        //            System.out.println("Day : 6");
        //            System.out.println("Day : 7");

        //hard coding oldu, pratik yazimi asagidadir

        //NESTED FOR LOOP

        for (int i = 1; i < 5; i++) {
            System.out.println("Week : " + i);

            for (int k =1; k < 8; k++) {
                System.out.println("Day : " + k);
            }
        }

        //Nested yapilar hicbir zaman tavsiye edilmiyor mecbu5r kalinmadigi surece


        /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */

        Scanner input = new Scanner(System.in); //(satir ve sutun sayisini kullanicidan alalim)
        System.out.println("Satir (row) sayisini giriniz..");
        int row = input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz");
        int column = input.nextInt();


        for (int i = 1; i <=row; i++) { //distaki loop satirlari icin satir sayisi kadar calisir

            for (int k = 1; k <= column; k++) { //icteki loop yanyana yazdirdigi icin sutun sayisi kaldar calisir
                System.out.print("X ");
            }

            System.out.println(); //yukardaki print yan yana yazdirdigi icin burada satir bitimini belirtmek gerekir,
                                    // bir sonraki satira gecmesi icin
        }





    }//main
}
