package p26_Lambda.Lessons_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

    public static void main(String[] args) {
        /*
        1)Lamda "Functional "(Method) programming dir, core java ise "Structured Programming" idi
        2) Functional programming te ne yapilacak uzerine yogunlasilir; nasil yapialcagi degil, legolar var zaten sadece burada birlestirecegiz
           "Structured Programming" te nasil yapilacak uzerine yoğunlasilir idi, legolari biz olusturuyorduk
        3) Functional programming Lambda; Collection lar ve Arrayler ile kullanilir
        4) Lamda (Functional programming) java 8 ile kullanilmaya baslanmistir
         */

        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));

        //Runnerlar
        printElements1(nums);

        System.out.println("-----------------");

        printElements2(nums);


    }

    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // 1.yol: yazdiran method'u olusturunuz.(Structured == Yapisal)
    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w+" ");
        }
    }
    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // 2.yol: yazdiran method'u olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t-> System.out.print(t+" "));

    }

}
