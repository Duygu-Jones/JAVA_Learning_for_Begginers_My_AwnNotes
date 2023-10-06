package p17_Acces_Modifiers.LessonsAM;

public class KonuAnlatim_Student {

    /*
    Access Modifier lar 4 adettir; genelden ozele siralamasi;

        1)public
        2)protected
        3)default
        4)private

        public > protected > default > private

        public      ==>  public olanlar her class dan kullanilabilir
        protected   ==> protected olanlar baska package lardan kullanilamaz, ancak baska package larda
                       **onemli** child classlar icinden kullanilabilir
        default     ==> default olanlar baska package lardan kullanilamazlar
        private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

        ***"protected ile default" arasindaki farki söyleyiniz?
        Note ==> ** Protected olanlar baska package lardan kullanilamaz ancak baska package larda
                    child classlar icinden kullanilabilir
                 ** Default olanlar baska package lardan kullanilamazlar
     */

    //1-) Public: her class tan kullanilabilir/ ne olursan ol gel, gor beni der:)
    public String stdName ="Ali Can";


    //2-) Protected: baska package dan sadece child classlardan gorulebilir
    //kendisinden class olusturulamaz, class icerisinde obje olusutulur
    protected String address = "Istanbul";


    //3-) Default accses modifier: larda default keyword yazilmaz
    //default olanlar baska package lardan kullanilamazlar
    String email = "alican@gmail.com"; //Default access modifierdir, keyword yazmadik



    //4- Private: olanlar sadece ve saadece olusturulduklari class icinde kullanilabilirler
    //kendisinden class olusturilmaz, olan class icersinde private obje olusturulabilir
    private  String ssnId="1234567891";





}
