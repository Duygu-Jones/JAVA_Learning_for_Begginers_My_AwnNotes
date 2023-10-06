package p12_arrays.Lessons_Arrays_ArrayLists;

import java.util.Arrays;

public class MdArrays_02 {
    public static void main(String[] args) {

        //Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        //int number[][] = { {5, 4}, {2, 3, 2} }; ==> {5,4,2,3,2}

        int numbers [][] ={ {5, 4}, {2, 3, 2} };

        //1.Step : iki boyutlu Arrayde kac eleman oldugunu bulan kodu yazmaliyiz

        int toplamElemanSayisi = 0; //sepet
        for ( int [] w : numbers) { // Array int []
            toplamElemanSayisi = toplamElemanSayisi+ w.length;
        }
        System.out.println(toplamElemanSayisi);



        //2.Step : Tek boyutlu Arrayi iki boyutlu Arrayin eleman sayisini kullanarak olusturmaliyiz
        int newArr [] = new int[toplamElemanSayisi];


        //3.Step : Iki boyutlu Arraydeki elemanlari tek boyutlu Arraya transfer etmeliyiz

        int idx = 0;
        for (int [] w: numbers ) {

            for ( int k: w  ) {
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr)); //[5, 4, 2, 3, 2]








    }//main
}
