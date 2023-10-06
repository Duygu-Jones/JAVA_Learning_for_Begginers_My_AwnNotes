package p20_OOP_Inheritance.Lessons_Giris_Practice01;

public class C06Animal {

    /*
    OOP conseptinin 4 tane prensibi vardir;
    1) Inheritance
    2) Polymorphism
    3) Encapsulation
    4) Abstraction
       */

    //1) Inheritance
    /*
    Ozellikleri bir classtan diger classlara alan bir kavramdir, Mesela ; siz bir class olusturacaksiniz
    ama daha once olusturulmus bir class sizin istediginiz ozelliklerin bir cogunu kapsiyor. o zaman yeni
    olusturdugunuz classi ozelliklerini kullanmak istediginiz class a child yapariz


    1) Inhentiance sayesinde
        a) Code tekrarlarindan kurutuluruz
        b) Code tamiri(maintenance) kolay olur
        c) Child Class'lari daha atomic yapmis oluruz

   2) Bir class'i baska bir classin child class i yapmak icin
   extends keywordunu kullaniriz.
   3) Child class objectleri Parent classtan method ve variable lari kullanabilirler
   4) Parent class objectleri child classdan method ve variable lari kullanamazlar

     */

    public void eat(){  //ortak ozellik1

        System.out.println("Animals eat..");
    }
    public void drink(){ //ortak ozellik2

        System.out.println("Animals drink..");
    }
    //parent classda olusturulan ozellikler Runner'da sadece class ismi kullanilarak variable olusturulur, object olusturmaya gerek yok




}//class
