package p21_OOP_Abstractions.Lessons_Interface;
//child class2; implemented to Ac, Security, Engine
public class Int4AccordModel implements Int3Ac, Int2Security, Int1Engine {


    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }

    @Override
    public void run() {
        System.out.println("Ac runs super");
    }
}//
