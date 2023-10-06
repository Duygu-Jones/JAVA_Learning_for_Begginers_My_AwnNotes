package p20_OOP_Inheritance.SSG_Practice;

public class Runner {
    public static void main(String[] args) {
        C03_Isci isci=new C03_Isci("Ali","Can","5554443322","Istanbul",12,100,16);
        System.out.println(isci);
        isci.fazlaMesai=5;
        isci.ucret= isci.fazlaMesaiParasiHesapla();
        System.out.println(isci.maas + isci.ucret);

        C03_Isci isci1=new C03_Isci();
        isci1.id=isci1.idAtama();
        System.out.println(isci1);

    }
    //memur classini da siz yapin
}
