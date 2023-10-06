package p20_OOP_Inheritance.SSG_Practice;

public class C02_Muhasebe extends C01_Ik{
    public int saatUcreti;
    public int calismaSaati;
    public int kacGunCalisti;
    public int maas;
    public int maasHesapla(){
        maas=saatUcreti*calismaSaati*kacGunCalisti;
        return maas;
    }


    public int getSaatUcreti() {
        return saatUcreti;
    }

    public void setSaatUcreti(int saatUcreti) {
        this.saatUcreti = saatUcreti;
    }

    public int getCalismaSaati() {
        return calismaSaati;
    }

    public void setCalismaSaati(int calismaSaati) {
        this.calismaSaati = calismaSaati;
    }

    public int getKacGunCalisti() {
        return kacGunCalisti;
    }

    public void setKacGunCalisti(int kacGunCalisti) {
        this.kacGunCalisti = kacGunCalisti;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }


}
