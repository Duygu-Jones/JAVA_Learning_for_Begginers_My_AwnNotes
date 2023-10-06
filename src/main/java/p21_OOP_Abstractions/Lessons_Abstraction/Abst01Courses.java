package p21_OOP_Abstractions.Lessons_Abstraction;

public abstract class Abst01Courses {

    //Abstraction
    //abstract methodlar child classlarda mutlaka uygulanmalidir
    //abstract method altinda body ile somut(concrete) method olusturulabilir ve chil classlarda uygulanmak zorunda degildir
    //abstract classlarda methodlarda body yoktur bu nedenle eksik bir methodtur ve eksik calisir, bu nedenle bu classlarda object olusturmaya java izin vermez
    //

    //
   /* IPTAL>>>>

   public void math(){
        System.out.println("7.sinif mufradati");
    }
    */

//Abstract structure;
public abstract void math();
    public void art(){
        System.out.println("Learn art");
    }


//public final abstract void science();







}//
