package p19_OOP_Polimorphism.p4_Overriding01;

public class C6Cat extends C5Animal{

    public void meow(){         // bu clasin kendi method

    }

    @Override
    public void eat() {                             //eat methodu parent classtan cagrildi
        System.out.println("My Cats eat..");        //ve Cat olarak output-body codelari burada guncellendi
    }

    @Override
    public void drink() {
        System.out.println("My Cats drink..");
    }


    //DIKKAT=hicbir method Static degil--> runner main class da obje olustur








}//
