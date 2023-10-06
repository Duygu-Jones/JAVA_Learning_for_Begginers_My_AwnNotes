package p11_loops.LessonsLoops;

public class C6_WhileLoop01 {
    public static void main(String[] args) {

       /*
        //for loop>>> hatirlatma;
        for (baslangic degeri ; loop calisma kurali ; artirma / azaltma) {
            body-----calisacak kodlar----
        }


        //while loop ise;

        baslangic degeri

        while(loop calisma kurali){
            calisacak kodlar
            artirma / azaltma
        }
        */

        //Example 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz
        //1. yol; for loop;
        for (int i = 3; i < 7; i++) {
            System.out.println(i);
        }


        //2. yol; while loop;

        int i = 3; // baslangic degeri data type ile atama; while icine girecek degeri belirlemek
        while (i < 7) {  //calisma sartini belirt

            System.out.println(i); //yapilacaka islem; print

            i++;    // loop un nasil devam edecegini soyle ===>   TUM LOOPLARDA BU VAR!! (fori- while-doWhile)
        }

        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz==> geriye sayim

        //While loop;
        int k = 23; //starting

        while (k>11){ // conditions genel

            if(k%2==0){ // conditions2
                System.out.println(k); //islem code
            }
            k--;  //artis/azalis
        } //loop end




    }//main
}
