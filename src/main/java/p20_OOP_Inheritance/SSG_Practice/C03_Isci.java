package p20_OOP_Inheritance.SSG_Practice;

public class C03_Isci extends C02_Muhasebe{
    @Override
    public String toString() {
        return "C03_Isci{" +
                "saatUcreti=" + saatUcreti +
                ", calismaSaati=" + calismaSaati +
                ", kacGunCalisti=" + kacGunCalisti +
                ", maas=" + maas +
                ", id=" + id +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }

    int fazlaMesai;
    int ucret;

    public int fazlaMesaiParasiHesapla(){
        ucret=fazlaMesai*saatUcreti*2;
        return ucret;
    }

    public C03_Isci(){

    }
    public C03_Isci(String isim, String soyIsim, String telefon, String adres, int calismaSaati, int saatlikucreti, int kacgunCalisti) {
        this.id=idAtama();
        this.isim=isim;
        this.soyIsim=soyIsim;
        this.telefon=telefon;
        this.adres=adres;
        this.calismaSaati=calismaSaati;
        this.saatUcreti=saatlikucreti;
        this.kacGunCalisti=kacgunCalisti;
        this.maas=maasHesapla();
    }
}
