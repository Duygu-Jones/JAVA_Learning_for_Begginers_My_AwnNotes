package p20_OOP_Inheritance.Lessons_Inherit_Practice02;

public class C3Honda extends C2Car {
    public C3Honda(){   //method
        System.out.println("super.km = " + super.km); //km variable'ini gider Car parent classtan alir
        System.out.println("this.km = " + this.km);// this. ile kendi class icinde bulunan ayni data icin girilen variable getirir
        System.out.println("super.model = " + super.model);
        System.out.println("this.model = " + this.model);
        System.out.println("Honda 1");
    }
    public C3Honda(String model, int year){ //parametreli const
        super();
        System.out.println("Honda2");
    }



}
