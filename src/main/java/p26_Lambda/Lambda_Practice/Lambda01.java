package p26_Lambda.Lambda_Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {


        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftVePozitifLambdaExpression(sayi);
        System.out.println(" \n  *******");
        ciftVePozitifMethodReferences(sayi);
        System.out.println(" \n  *******");
        kare(sayi);
        System.out.println(" \n  *******");
        kareTekrarsiz(sayi);
        System.out.println(" \n  *******");
        buyukdenKucuge(sayi);
        System.out.println(" \n  *******");
        pozitifKupBirlerBasamagi5(sayi);
        System.out.println(" \n  *******");
        toplamiMethodReferences(sayi);
        System.out.println(" \n  *******");
        toplamiLambdaExpression(sayi);
        System.out.println(" \n  *******");
        System.out.println(pozitifCarpimLambdaExpression(sayi));
        System.out.println(" \n  *******");
        System.out.println(ciftKareKucuktenBuyuge(sayi));

    }

        //SORU1: List elemanlarının çift ve pozitif olanlarını,
        // Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifLambdaExpression(List<Integer> sayi){

        // 1.Yol
        sayi.stream().filter(t->t%2==0&&t>0).forEach(t-> System.out.print(t+" "));

        // 2.Yol
        sayi.stream().filter(t->t%2==0).filter(t->t>0).forEach(t-> System.out.print(t+" "));

    }


        //SORU2: List elemanlarının çift ve pozitif olanlarını,
        // Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifMethodReferences(List<Integer> sayi){

        sayi.stream().filter(Utils::ciftPozitifBul).forEach(Utils::yazdir);

    }


        //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void kare(List<Integer> sayi){
        sayi.stream().map(t->t*t).forEach(Utils::yazdir);
    }


        //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın

    public static void kareTekrarsiz(List<Integer> sayi){
        sayi.stream().map(t->t*t).distinct().forEach(Utils::yazdir);
    }

        //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

    public static void buyukdenKucuge(List<Integer> sayi){

        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);

    }


        // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız

    public static void pozitifKupBirlerBasamagi5(List<Integer> sayi){

        sayi.
                stream().
                filter(t->t>0).
                map(t->t*t*t).
                filter(t->t%10==5). // bir sayının 10'a bolumunden kalan 5 ise bu sayının birler basamagı 5 tir
                forEach(Utils::yazdir);

    }


        // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın

    public static void toplamiMethodReferences(List<Integer> sayi){

        // 1.YOL
        Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);
        System.out.println(sonuc);

        // 2.YOL

        int sonucc = sayi.stream().reduce(Integer::sum).get();
        System.out.println(sonucc);

    }


        // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplamiLambdaExpression(List<Integer> sayi){

        int sonuc = sayi.stream().reduce(0,(a,b)->a+b);
        System.out.println(sonuc);

    }


        //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın

    public static int pozitifCarpimLambdaExpression(List<Integer> sayi){

        int sonuc = sayi.stream().filter(t->t>0).reduce(1,(a,b)->a*b);

        return sonuc;

    }


        //SORU10 : Listin cift elemanlarının, karelerini,
        // kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    public static List<Integer> ciftKareKucuktenBuyuge(List<Integer> sayi){

        List<Integer> list = sayi.
                stream().
                filter(t->t%2==0).
                map(t->t*t).
                sorted().
                collect(Collectors.toList());

        return list;
    }



















}/////
