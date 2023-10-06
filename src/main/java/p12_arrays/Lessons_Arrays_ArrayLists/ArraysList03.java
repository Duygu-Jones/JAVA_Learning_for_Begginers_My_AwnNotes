package p12_arrays.Lessons_Arrays_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysList03 {
    public static void main(String[] args) {

        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10


        List<Integer> nums = new ArrayList<>(); // "ArrayList" yerine sadece -->"List" de yazilabilir/ bazi ufak farkliliklari var
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        Collections.sort(nums);  //siralamak icin sort() methodu// ArrayListlerde sort() icin elemanlari collections util lib.den getirir,
        System.out.println(nums);   //[10, 12, 19, 23] //kucukten buyuge--> natural order

        int minDiff = nums.get(1) - nums.get(0);
        //nums listesinden getir (1.indexi) - nums listesinden getir (0.indexi); cikarma islemi yap

        //minDiff() methodu ile; en kucuk farkin kac oldugunu bulan kodu yazalim

        for (int i = 1; i < nums.size();   i++) {  // 1.indexten basladik ki 0.indexi cikaralim
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1)); //minDiff icerisinde 1.index - 0.index==> (12-10)==2 var
            //basa don// 2.indext - 1. index --> 19-12==7
            //Math.min() methodu ile 2 ve 7 yi kiyasla kucuk olani minDiff sepetine at ---->
            // loop boyle tekrar eder index bitene kdar --> i < nums.size(); index eleman sayisini gecene kadr
        }
        System.out.println(minDiff);  //buraya kadar butun kodun amaci minDiff (minimum Difference) bulmak

        // en kucuk farki hangi iki sayidan elde ettigimizi bulalim
        ////  for- if kullanalim; son olark bu minDiff'i hangi iki elemandan bulduk onu yazdiralim

        for (int i = 1;  i < nums.size();     i++) {
            if(nums.get(i) - nums.get(i - 1) == minDiff){
                System.out.println(nums.get(i) + " ve  "+ nums.get(i - 1)); // 12 ve 10// en kucuk farka (minDiff-> 2 olan) sahip oln bu iki sayiyi yazdirmak icin
            }
        }


    }//main
}
