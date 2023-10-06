package p21_OOP_Abstractions.Lessons_Interface;
//child class1; implemented to Ac, Security, Engine
public class Int5CivicModel implements Int3Ac, Int2Security, Int1Engine {

    public void cool(){
        System.out.println("Civic cools perfect");

    }

    @Override
    public void run() {
        System.out.println("Engine runs perfect");
    }


}//
