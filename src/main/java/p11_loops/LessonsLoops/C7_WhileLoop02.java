package p11_loops.LessonsLoops;

import java.util.Scanner;

public class C7_WhileLoop02 {
    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/


        Scanner input = new Scanner(System.in); //Scanner class ile scan objesi olusturulur
        System.out.println("Carpim tablosunu gormek icin Lutfen bir sayi girniz");
        int num = input.nextInt();

        int i = 1;      //[1,10] dahil verilen sayilari bunlarla carpacak
        while (i<11){   //  num * 1= sonuc yapacagiz
            System.out.println(num + "x" + i + "=" + (num*i));
            i++;

        }

        System.out.println();



        //Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int k = 313;  //sayiyi ters cevirebilmek icin Stringe cevirelim (indexlerle kelime gibi algilamasi icin)
        String m = String.valueOf(k); //"313" stringe cevirdik

        String reversed = "";  //String de etkisiz eleman "" tirnak isareti yani bos sepet yeni veri icin; reversed olan eleman buraya gelecek

        int n =m.length()-1; //baslangic=son indexten==> m(top karakter sayisi)`nin  bir eksigini ver ve n sepeti(index no) icine  ata

        while (n>=0){   // index no >=0 olana kadar asagidaki charAt ile yazdir ve >>>>> n degerini azalt n--;
            reversed= reversed + m.charAt(n);
            n--;   // degeri yukarda reserved sepetine ve koy degeri azalt ve donguye devam et n>=0 olana kadar
        }
        // n<0 ise loopu kir bitir dur
        System.out.println(reversed);


        //String olan sayinin Palindrome sayi olup olmadigin esitligine bak

        if (m.equals(reversed)) {   //ilk sayi ve son sayiyi karsilasitrdik
            System.out.println("Palindrome");

        }else {
            System.out.println("Not Palindrome");
        }








    }//main

}
