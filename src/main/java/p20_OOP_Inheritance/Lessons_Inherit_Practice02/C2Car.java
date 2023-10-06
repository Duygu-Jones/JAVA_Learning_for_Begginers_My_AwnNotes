package p20_OOP_Inheritance.Lessons_Inherit_Practice02;

public class C2Car extends C1Vehicle {

    public C2Car() { //pamsiz const
        super(1500);
        System.out.println("Car 1");
    }
    public C2Car(String make){ //parametreli const
        super(1000);
        System.out.println("Car2");
    }

    public String model="Accord"; //variable-ozellik
    public int km = 20000; //variable-ozellik



}//
