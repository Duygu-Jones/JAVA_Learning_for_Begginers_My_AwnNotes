package p19_OOP_Polimorphism.p3_Overriding;

public class Animal {

//PARENT CLASS

    //methodlar olusturalim
    public void eat(){
        System.out.println("Animal eat");
    }
    public void drink(){
        System.out.println("Animals Drink");
    }

    public Animal create(){
        return new Animal();

    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(Integer a, Integer b){
        return a*b;
    }

    public final double circleArea(double r){   //FINAL keyword kullanilmis bu son method dur
        return 3.14 * r * r;
    }






}//
