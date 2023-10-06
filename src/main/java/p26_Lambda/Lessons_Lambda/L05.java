package p26_Lambda.Lessons_Lambda;

import java.util.ArrayList;
import java.util.List;

public class L05 {
    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        //removeIfLengthGreaterThanFive(myList);

    }
//1) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    public static void removeIfLengthGreaterThanFive(List<String> myList){
        myList.removeIf(t->t.length()>5);
        System.out.println(myList);
    }
    //NOTE; stream() methodu icersinde removeIf() yoktur==> eger removeIf kullanilacak ise stream'e ceirmeden yapinz
    // Listimiz bir collection ve removeIs() da bir colelction dir, ikisi birlikte kullanilabilir
    //ayrica removeIf() methodu kendisinden sonra. baska bir method kullanilmasina da izin vermez



//2 ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.

    public static void removeIfElementsStartsWithZorEndsWithf (List<String> myList){
        myList.removeIf(t-> t.charAt(0)=='Z'  || t.charAt(t.length()-1) == 'f');
        System.out.println(myList);
    }

            //2-2. yol
            public static void removeIfElementsStartsWithZorEndsWithf2(List<String> myList) {
                myList.removeIf(t -> t.startsWith("Z") || t.endsWith("f"));
                System.out.println(myList);
            }

//3 ) "X" karakteri iceren elemanları silen bir method oluşturun.
    public static void removeIfElementsContainsX(List<String> myList) {
        myList.removeIf(t-> t.contains("X"));
        System.out.println(myList);
    }








}////
