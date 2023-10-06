package p19_OOP_Polimorphism.p3_Overriding;

public class Cat extends Animal {


// CHILD CLASS

    //bu class a ait burada ilk olusturan method;
    public void meow(){
        System.out.println("Cats meow..");
    }

    //PARENT class tan override edilen ve body si degistiren methodlar;
    @Override  //@override simgesinin anlami; (annatotion), rotasyonda denir, override kurallarini java tarafindan kontrol edilmesini saglar
    public void eat() {                        //Parentten alindi
        System.out.println("My Cats eat..");   //child a gore yeniden duzenlendi
    }

    @Override
    public void drink() {
        System.out.println("My Cats drink..");
    }


    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) { //parentten alindi fakat hic bie degisiklik yapilmamis aynisi
        return a+b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) { //parent ile ayni
        return a*b;
    }

    //  @Override
    //  public double circleArea(double r) {
    //  return 3.14*r*r;
    //  }

    //final methodu ile child classlarda override yapilamaz.
    //final methodlarin body si degistirilemez, bu da override yapilmasina ters duser


}//
