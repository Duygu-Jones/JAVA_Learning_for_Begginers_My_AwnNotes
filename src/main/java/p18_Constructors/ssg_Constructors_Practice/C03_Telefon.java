package p18_Constructors.ssg_Constructors_Practice;

public class C03_Telefon {
    public C03_Telefon(String marka,String model,int fiyat){
        System.out.println("Telefonun markasi : "+marka);
        System.out.println("Telefonun model : "+model);
        System.out.println("Telefonun fiyat : "+fiyat+"₺");
    }

    public C03_Telefon(String marka,String model){
        System.out.println("Telefonun markasi : "+marka);
        System.out.println("Telefonun model : "+model);
        System.out.println("fiyat belirtilmedi");
    }
    public C03_Telefon(String marka,int fiyat){
        System.out.println("Telefonun markasi : "+marka);
        System.out.println("Telefonun fiyat : "+fiyat);
    }
}
