package p25_Enum_Iterator.Lessons_Enum_Iterator;

import java.util.Scanner;

public class Enum_Runner {
    public static void main(String[] args) {

    // Class_Ismi  name  = Class_Ismi  . ENUMSABITI()

       Enum_Cities hatay = Enum_Cities . HATAY; //HATAY in tum bilgielrini getirir
        System.out.println(hatay); //Data type Cities dir kendisi HATAY da bir Enum dir



        //Adana sabitinin ismine ulasalim (specific bilgiye ulasmak icin)====> getter methodu kullanalim
      //Data_type  name          = Class_Ismi  . ENUMSABITI . getName();
        String     adanaCityName = Enum_Cities . ADANA      . getCityName();

        //Ankaranin postacodunu ulasalim
        String ankaraPostalCode = Enum_Cities.ANKARA.getPostalCode();

        //istanbul plaka ulasalim // direk yazdirabiliriz de  ==> (Class_Ismi.ENUMSABITI.getName().sout; )
        System.out.println(Enum_Cities.İSTANBUL.getPlateCode());





        //Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console da yazdiralim

        //Scanner + mesaj+ next(); + yontem: method(value veya array ile) + if condition + (Foreach + ifCondition) + print
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodunu giriniz..");
        int plaka = input.nextInt();;

        //values() methodu; enum icindeki tum datalari bir array icinde bize verir
        Enum_Cities cities [] = Enum_Cities.values();
        //System.out.println(Arrays.toString(cities)); // buna gerek kalmadan value() meth ile tumunu bir arada yazdirabilirz

        if(plaka>81 || plaka<1){ // sinirlarimizi cizelim
            System.out.println("Girmis oldugunuz plaka gecersizidr");
        }

        for (Enum_Cities w: cities) { //Data type artik burada class ismidir -->yani Cities dir
            if(plaka== w.getPlateCode()){ //plaka istemistik class tan get ile plateCode larini getirecek ve girilen sayi ile karsilasitirilacak
                System.out.println("Girmis oldugunuz plaka "+ w.getCityName()+ " iline aittir");            //True ise burasi yazdiracak
                      // 3-run-> // Girmis oldugunuz plaka    Afyonkarahisar     iline aittir
            }

        }















    }
}
