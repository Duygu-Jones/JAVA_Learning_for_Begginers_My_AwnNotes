package p18_Constructors.ssg_Constructors_Practice;

public class C02_Araba {
    static C01_constructor obje=new C01_constructor();
    int id;
    String marka;
    String model;
    int yili;
    String renk;
    String yakitTipi;
    String fiyat;


    public C02_Araba(String marka, String model, int yili, String renk, String yakitTipi, String fiyat) {
        id=obje.idAtama();

        this.marka = marka;
        this.model = model;
        this.yili = yili;
        this.renk = renk;
        this.yakitTipi = yakitTipi;
        this.fiyat = fiyat;
    }
    public C02_Araba(){

    }
    public C02_Araba(String marka, String model, int yili) {
        this.marka = marka;
        this.model = model;
        this.yili = yili;
    }

    @Override
    public String toString() {
        return "C02_Araba{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yili=" + yili +
                ", renk='" + renk + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", fiyat='" + fiyat + '\'' +
                '}';
    }
    public static void yaz(){
        System.out.println(obje);
    }
}
