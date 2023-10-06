package p23_Collections;

import java.util.Arrays;
import java.util.HashMap;

public class Odev {

    //ODEV

    //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
    //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

    public static void main(String[] args) {

        String x = "Hello Henry!";
        x= x.replaceAll("\\p{Punct}", "");
        x=x.replaceAll(" ", "");
        System.out.println(x); //HelloHenry

        String letters[] = x.split("");
        System.out.println(Arrays.toString(letters)); //[H, e, l, l, o, H, e, n, r, y]

        HashMap<String, Integer> count= new HashMap<>();

        for(String w : letters){
           Integer numOfLetters = count.get(w);

           if (numOfLetters == null){
              count.put(w,1);
           }else {
               count.replace(w, numOfLetters+1);

           }
            System.out.println(count);

        }

    }//



}//
