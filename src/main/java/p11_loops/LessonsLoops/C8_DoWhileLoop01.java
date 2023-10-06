package p11_loops.LessonsLoops;

public class C8_DoWhileLoop01 {
    public static void main(String[] args) {


        // while loop da bosy hic calismayabilir (filtre yani sartli durumu ilk basa koyar, saglamazsa yazdirmaz gecer)
        // while loop da zero execution mumkundur


        //do while loopta body en az 1 kez calisir
        // do while loop da zero execution mumkundur (filtreyi sona koydugu icin)

/*
        //while loop

        baslangic degeri

        while(loop calisma kurali){
            calisacak kodlar
            artirma / azaltma
        }

        // do - while loop

        baslangic degeri
        do{
            calisacak kodlar
            artirma / azaltma
        }while (loop calisma kurali);
        */

        //ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdiriniz

        int i = 5;

        do {

            System.out.println(i);
            i--;
        }while (i>2);

        //------------------------------------------------------------------------------------------

        // 1 ) while loop

        int a = 1;

        while (a<1){
            System.out.println("Sen bir while loopsun...");
            a++;
        }



        // 2 ) do-while-loop
        int b = 1;
        do {
            System.out.println("Sen bir do while loopsun...");
            b++;
        }while (b<1);

//SONUC; 1 ve 2 nolu ornekte ayni sartlarda while ve Do-while Loop olusturuldu.
        //Do while Looop her durumda en az bir kez calisir, consolda da kaniti gorulur.

    }//main
}
