package p19_OOP_Polimorphism.p4_Overriding01;

public class C5Animal {


  //Overriding -->(gecersiz kilmak demek)
    //child classda ayni ozelligin(eat, drink...) child classa(Cat) ozel ozellistirmesidir
    //yani buradaki child classlar icin olusturulan ortak ozellikgi, o chil class icerisnde tekrarlayip guncelleyerek orjinalini gecersiz kildik


    public void eat(){                          //method- public, diger classtan cagirlacak ve set edileccek
        System.out.println("Animal eat");
    }
    public void drink(){                        //method-
        System.out.println("Animals Drink");
    }



}//
