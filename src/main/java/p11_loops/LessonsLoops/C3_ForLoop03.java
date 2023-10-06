package p11_loops.LessonsLoops;

public class C3_ForLoop03 {
    public static void main(String[] args) {
        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20

        int sum = 0; //bos (0) bir sepet olusturduk, toplamada etkisiz eleman 0dir,  gelecek yeni degerlere yer actik
        // sum toplama demek toplama icin isim olarak kullanilir

        for (int i = 578;   i>0;   i= i/10) { //bolme islemi icin de loop yapilir /
           sum = sum + i%10;


            System.out.println(sum);
            //8
            //15
            //20

        }

        // Bir string teki tekrarsiz karakterleri veren kodu yaziniz
        //          mehmet ==> ht

        String t = "mehmet";
        String unique ="";// string icin bos sepet hicliktir ""; ht yi koyacagimiz sepet==> memory de havada kalmasin

        for (int i =0; i< t.length();  i++) {
            char ch = t.charAt(i);

            if (t.indexOf(ch) == t.lastIndexOf(ch)) {
                unique = unique + ch;
                System.out.println("unique = " + unique);

            }

        }


        //Example1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26

        int sum2 = 0; //toplamada etksiz eleman 0 dir, bos sepet icin

        for (int i = 5;     i < 9;      i++) {
            sum2 = sum2+i;

            System.out.println(sum2);
            //5
            //11
            //18
            //26

        }


        //Example  7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.
        //           7*8*9 ==> 504

        int carpma = 1; //carpmada etkisiz eleman 1 dir, bos ssepet icin

        for (int i = 7;    i <10 ;     i++) {
            carpma = carpma*i;

            System.out.println(carpma);
            //7
            //56
            //504

        }





    }//main
}
