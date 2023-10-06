package p26_Lambda.Lessons_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L08_withText {

    public static void main(String[] args) throws IOException {

        //NOTE: Files.lines ile link ettigimiz TExt dosyanin her bir satiri burada bizim elemanlarimiz olur. t'ye atanan elemanlar satirlar olur ve Stringdir

        //Example 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.
       Files.
               lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).forEach(System.out::println);


       //Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.

        Files.
                lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println); // :: yerine t-> expression da kullanialbilr fakat refering daha okunur olur ==> exm; map(t-> t.toUpperCase) de olabilir



        //Example 3: Verilen text file icindeki text'lerde "map" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        boolean result1 = Files.
                lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).
                anyMatch(t-> t.contains("map"));

        System.out.println("result1 = " + result1);


        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List <String> words=  Files.
                lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).   //t.replaceAll("\\p{Punct}==. tup noktalama isaretlerini hiclik ile yerdegistir dedik
                map(t-> t.replaceAll("\\p{Punct}", "").split(" ")).   //// split() methodu bize ARRAY return eder, artik bu code bir array oldu
                flatMap(Arrays::stream).                        //flatMap ==> her bir satirda kelimelerden olusan array listlerin basinda ve sonunda bulunan [] koseli parantezi yikar=> dum duz olur
                distinct().collect(Collectors.toList());        //farkli kelimeler icin unique olanlari getir dedik

        System.out.println(words); //  [..... ..... ] array oolarak list seklinde tum kelimeleri yazdirdi

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        long numOfLetters = Files.
                lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).
                map(t-> t.replaceAll("[^a-zA-Z]", "")). //harf haric^ ne varsa sil dedik==> haric isareti --> ^ sapkadir
                map(t-> t.split("")).       //map'i ayri bir sekilde tekrar kullanabiliriz==> harflerden olusan bir array return eder, arrayin duvaarlarindan kurtulmaliyiz butunlestirmek icin
                flatMap(Arrays::stream).          //Arrays lerden strem olustur dedik
                count();                          //herseyi sayar
        System.out.println(numOfLetters);




        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri
        // natural order da bir listin icinde return eden kodu yaziniz.
        List<String> sortedList = Files.
                lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).
                map(t-> t.replaceAll("[^a-zA-Z]", "")).
                map(t-> t.split("")).
                flatMap(Arrays::stream).
                sorted ().
                collect(Collectors.toList());
        System.out.println(sortedList);








    }



}
