package p7_if_statements.P3_If_ElseIf_Else;

import java.util.Scanner;

public class C02_If_ElseIf_Else {

/*
kullanicidan bir ucgenin uc kenar uzunlugunu alin
Birbirlerine esit ise Eskenar Ucgen
Sadece iki kenari esit ise ikizKenar Ucgen
Hepsi farkli ise Cesitkenar Ucgen yazzdirin

 */
public static void main(String[] args) {

    Scanner input =new Scanner(System.in);
    System.out.println("UCgenin uc kenar uzunlugunu giriniz");
    double k1 = input.nextDouble();
    double k2 = input.nextDouble();
    double k3 = input.nextDouble();

    if (k1 == k2 && k2==k3) {
        System.out.println("Eskenar Ucgen");
    }else if(k1==k2 || k1==k3 || k2==k3){
        System.out.println("ikizKenar Ucgen");
    }else {
        System.out.println("Cesitkenar Ucgen");
    }





}



}
