package p7_if_statements.P2_If_Else;

import java.util.Scanner;

public class If_Else4 {
    /*
    Kullanicidan alacagi urun miktari ve urunun birim fiyatini alin
    Eger urum miktari 1000'den fazla ise %10 indirim yapin ve odedmesi gereken toplam parayi ekrana yazdirin
    Diger durumlarda odemesi gereken top parayi herhangi bir indirim yapmadan ekrana yazdirin.
     */

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("urun miktarini giriniz");
        int miktar =input.nextInt();
        System.out.println("Lutfen birim fiyatini giriniz");
        double price = input.nextDouble();

        if(miktar>1000) {
            System.out.println("%10 Indirimli fiyat: " + price * 0.9 * miktar); //%10 indirim cikarilirsa %90 kalir, direk kalan fiyatla carpmak kisa yol

        }else {
            System.out.println("Indirimsiz fiyat: "+ miktar*price);

        }




    }//



}
