package p11_loops.LessonsLoops;

public class C5_ForLoop05 {
    public static void main(String[] args) {

        //Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20

        double num = 28.587;

        //ondalikli kismi alabilmek icin String e cevirelim
        String sNum = String.valueOf(num);  //"28.587"

        //Stringe cevrilmis sayimizi split () methodu ile 2ye ayiralim, ondalikli kismini alalim
        String decimalPart = sNum.split("[.]")[1]; //sNum'i noktadan bol ve 1.indexi ver

        //String data typinda olan decimalPArt verimiz uzerinde matematiksel islem yapabilmek icin int e cevirelim
        int intDecimalPart = Integer.valueOf(decimalPart);//sayisal olarak 587 degeri cikti

        int sum=0;
        for (int i = intDecimalPart; i >0 ; i=i/10) {
            sum =sum+ i%10;
            System.out.println(sum);
            //7
            //15
            //20

        }

        /*
        intDecimalPart = 587 icin ==>
        for (int i = intDecimalPart; i >0 ; i=i/10) {
            sum =sum+ i%10;

        587%10=> kalan 7 alir ==> 58.7 ondalikli kismi siler 58 kalir
        58%10=>  kalan 8 alir ==> 5.8 den "         "    "   5 kalir
        5%10 => kaln 5'i alir==>  0.5'ten "         "    "   0 elde kalir =i; i>0 degildir ve durur.
         */



    }//main
}
