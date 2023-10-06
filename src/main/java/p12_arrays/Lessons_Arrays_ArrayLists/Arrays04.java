package p12_arrays.Lessons_Arrays_ArrayLists;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz >>  [2, 3, 12, 0, 0, 0]

        int a[] = {0, 2, 3, 0, 12, 0};//[0,  2, 3,  0,  12,  0]
        int b[] = new int[a.length];   //[0,  0,  0,  0,  0,  0] // defaul olarak 0 atandi, yazdirilmayacak elemanlar 0 oalrak kalacak ama koltuk kisi sayisi degsmeyecek
        int idx = 0; // b'nin baslangic index

        //[0,  2,  3,  0,  12,  0]
        for (int w : a) {
            if (w != 0) {
                b[idx] = w; //her bir w'yi b'nin indexlerine yerlestir dedik
                idx++; //b elemanlarini (idx) arttirarak ilerle
            }
        }
        System.out.println(Arrays.toString(b));//[2, 3, 12, 0, 0, 0]


        //Arraylerin esit olup olmadigi nasil anlasilir?

        int arr[] = new int[3];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 3;

        int brr[] = new int[3];
        brr[0] = 2;
        brr[1] = 3;
        brr[2] = 1;

        //iki arrayin ayni olabilmesi icin ayni index te ayni elemanlarin bulunmasi gerekir
        boolean result= Arrays.equals(arr,brr);
        System.out.println("result = " + result); //result = false //esit degildir


        System.out.println();

        int myArray[]={7,5,9,10,11};
        int reversedArray[] = new int[myArray.length];

        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray)); //[5, 7, 9, 10, 11]
// Reverse the array;
        for (int i = 0; i < myArray.length; i++) {
            reversedArray[i] = myArray[myArray.length - 1 - i];
        }

// Print the reversed array
        System.out.println(Arrays.toString(reversedArray));

    }//main
}
