package p17_Method_Creation.C02_Method_OverLoading.Overloading;

public class CarRunner {

    public static void main(String[] args) {
        Car c1 = new Car("BMW", "M4", 2023, true); //Car Classindaki paramli constructor kullanilarak obje olusturuldu
        System.out.println(c1.brand); //obje kullanilarak da non-static variablelar caligirildi
        System.out.println(c1.hybrid);
        System.out.println(c1.model);
        System.out.println(c1.year);

        //method call yapalim
        c1.hareket(); //obje kullanilarak yine (non-static olan) methodlari cagirdik, (islem yaptirmadik prnt gibi)
        c1.dur();

        //farkli araclar uretelim; constructorlar ile
        Car c2 = new Car("Auidi", "A5", 2023, true);
        Car c3 = new Car("Volswagen", "polo", 2018, false);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //paremetreleri secerek farkli sayida ozellikleri getirelim
        Car c4 = new Car("Mercedes", 2023);


    }//main


   /*
   Notlar;
   Car classinin main class indasiniz -RUNNER;
   Car class da olusturulan non-static variable lar ve burada methodlar call edildi kullanildi.
   bunun icin ilk olarak objeler olusturuldu
   objeleri olusturmak icin ise Car classinda olusturulan constructorlar burada cagrildi-kullanildi

    */












}
