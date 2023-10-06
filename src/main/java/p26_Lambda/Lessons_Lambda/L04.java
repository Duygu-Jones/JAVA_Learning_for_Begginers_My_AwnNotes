package p26_Lambda.Lessons_Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class L04 {
    public static void main(String[] args) {


        //normal bir List olusturduk==> sonrasinda lambda formatina ceviriyoruz
        List<String> myList = new ArrayList<>();        // (List<String> myList) : list olusturuldu ve array olarak atandi; asagida methodlarda kullanacagiz
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");


        //RUNNER lar
        printElementsExceptStartsWithE (myList);
        System.out.println();
        printDistinctElementLengthLessThanFive(myList);
        System.out.println();
        List<String> newList = getElementLengthMoreThanFiveWithUpperCase(myList);
        System.out.println(newList);
        printElementsLengthLessThanFiveUniqueLowerCase(myList);
        System.out.println();
        printDistinctElementsToUpperCaseSorted(myList);
        System.out.println();
        printDistinctElementsToLowerCaseSortWithLength(myList);



    }

    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.==> myList olusturmustuk kullan
    public static void printElementsExceptStartsWithE (List<String> myList){
        myList.
                stream().
                filter(t-> !t.startsWith("E")).
                forEach(Utils_for_L06::printInTheSameLineWithSpace);
    }


    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.
    public static void printDistinctElementLengthLessThanFive(List<String>myList){
        myList.
                stream().
                distinct().
                filter(t-> t.length()<5).
                forEach(Utils_for_L06::printInTheSameLineWithSpace); //yan yana yazdirmak icin no ln

    }


    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari buyuk
    // harflerle bir listin icinde veren method'u olusturunuz. =====> bir List in icinde ver diyor!!!!
    public static List<String> getElementLengthMoreThanFiveWithUpperCase(List<String>myList){
        return myList.    // List return ettigi icin return type yaptik (void de yok zaten) onun gorevini yerine getirdik
                stream().
                filter(t-> t.length()>5).
                map(t-> t.toUpperCase()). //bir donusum var ise map(0 kullanilir----> upperCase donusturduk
                                            //buraya kadar bir akis, stream
                collect(Collectors.toList());// burada  ise collection==> List oldu
    }


    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.===> direk yazdir normal
    public static void printElementsLengthLessThanFiveUniqueLowerCase(List < String> myList){
        myList.
                stream().
                distinct().
                filter(t-> t.length()<5).
                map(t-> t.toLowerCase()). //t-> ... lambda expression dir t; bunun daha okunur sekli asagida gosterilmistir===> method reference
                sorted().
                forEach(Utils_for_L06::printInTheSameLineWithSpace);
    }

    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.

    public static void printDistinctElementsToUpperCaseSorted (List < String> myList){
        myList.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(Utils_for_L06::printInTheSameLineWithSpace);
    }


    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge
    // siralayarak console'a yazdiran method'u olusturunuz.
    public static void printDistinctElementsToLowerCaseSortWithLength (List < String> myList){
        myList.
                stream().
                distinct().
                map(String::toLowerCase). //method reference
                sorted(Comparator.comparing(t-> t.length())). // length e gore karsilastir ve length buyuklugune gore natural siralama yapar
                forEach(Utils_for_L06::printInTheSameLineWithSpace);
    }


    //NOTES===>  METHOD REFERENCE ing;
//Util classtan method reference ettik forEach() methodlari icin; digerlerine de yapilabilr
    //fakat eger method tekrar tekrar kullanilacak ise method refere ediniz
    // map() icerisinde ki code lari refere edebiliriz fakat 1 kez kullanilacak, best practice olmasi gerekn kodun yazilmasidir, tekrar kullanilmayacak
    //specific bir kez kullanilacak methodlar icin refere etmeye gerek yoktur


}
