package p10_String_manipulations.Lessons_StringManip;

import java.util.Scanner;

public class SM_03 {
    public static void main(String[] args) {

         /*
 Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen password giriniz..");
        String pwd = input.nextLine();  //pwd etiketi ile asagida kullan

        //12345Abbc pwd bu olsun => 9 karakter, rakam var, b ve k harfler var

        //1) en az 8 character olsun
        boolean lenghtControl = pwd.length()>7;
        System.out.println("lenghtControl = " + lenghtControl); //lenghtControl = true


        //2) Space characteri password'de olmasin
        boolean spaceControl = !pwd.contains(" "); // psw space " " characteri icermesin !(degildir)  dedik // space characteri yok ise TRUE yazdirir
        System.out.println("spaceControl = " + spaceControl); //spaceControl = true

        //3) En az bir tane buyuk harf olsun
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", " ").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl); //upperCaseControl = true

        //En az bir tane kucuk harf olsun
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", " ").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl); //lowerCaseControl = true

        //En az bir tane rakam olsun
        boolean digitContol = pwd.replaceAll("[^0-9]"," ").length()>0;
        System.out.println("digitContol = " + digitContol); //digitContol = true


        //if ile gecerlilik kontrolu yap
        boolean isValid = lenghtControl && spaceControl && upperCaseControl && lowerCaseControl && digitContol;
        if (isValid) { //eger true ise bunu yazdir
            System.out.println("Password gecerlidir"); //Password gecerlidir

        }else { //degil ise bunu yazdir
            System.out.println("Password gecersizidir");
        }


        //Ternary ile kontrol et
        //boolean isValid? syntax tanimla
        //if ile Tru - false degerlendir



    }//main
}
