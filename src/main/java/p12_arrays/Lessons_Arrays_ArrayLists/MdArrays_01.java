package p12_arrays.Lessons_Arrays_ArrayLists;

import java.util.Arrays;

public class MdArrays_01 {
    public static void main(String[] args) {

        //Bir arrayin elemanlari eger array ise bu arrayler multidimension alarrays olarak adlandirilir

        //MultiDimensional Array nasil olusturulur?
        int a[][] = new int[3][2]; // [[0,0],[0,0],[0,0]]

        //MultiDimensional Array lere nasil eleman eklenir?
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;

        //MultiDimensional Array nasil console a yazdirilir?//


        System.out.println(Arrays.toString(a));//[[I@511baa65, [I@340f438e, [I@30c7da1e]

        //MultiDimensional Arrayleri yazidirirken toString() methodu degil, deepToString() methodunu kullaniriz
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //MultiDimensional Array den specific bir eleman nasil yazidirilir?
        System.out.println(a[1][1]);//45

        //MultiDimensional Array icindeki bir array nasil yazdirilir?
        System.out.println(Arrays.toString(a[1]));//[81, 45]


        //kisa yoldan MultiDimensional Array nasil olusturulur?
        String students [][] = { {"Ali","Ahmet"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"} };

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        //bunun icin for each kullanicaz
        int sum = 0;

        for ( String [] w : students ) { //Array String []
            sum= sum + w.length;
        }
        System.out.println(sum);


        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz

        //{{"Ali", "Ahmet"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        for ( String [] w : students){ //Array String []

            for ( String k : w   ) { // Normal String

                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }






    }//main
}
