package p20_OOP_Encapsulation.p01_Encapsulation_KonuAnlatim;


public class StudentRunner {

    public static void main(String[] args) {
       Student ali = new Student();  // Student class hepsi Non-String=> obje olustur
        System.out.println("ali.getStdId() = " + ali.getStdId()); //obje.getMethod
        System.out.println("ali.getNotOrt() = " + ali.getNotOrt());
        System.out.println("ali.isSuccesful() = " + ali.isSuccesful());

        System.out.println("=================");

        ali.setNotOrt(3.13); //obje ile setMethod uzerinden bu objeye yeni deger atandi
        System.out.println("ali.getNotOrt() = " + ali.getNotOrt());
        //set ile veriyi degistirdik (sadece child class icinde son hali), son veri ile guncel yazdirir
        //orjinal datayi degistirmez; obje uzerinden degisiklik yapilir

        System.out.println("=================");

        ali.setStdId("AB2023139456");
        ali.setNotOrt(4.4);
        ali.setSuccesful(true);

        System.out.println(ali.getStdId());
        System.out.println(ali.getNotOrt());
        System.out.println(ali.isSuccesful());

        System.out.println("=================");

        ali.setStdId("DJ20223651102");
        ali.setNotOrt(2.83);
        ali.setSuccesful(false);

        System.out.println(ali.getStdId());
        System.out.println(ali.getNotOrt());
        System.out.println(ali.isSuccesful());



        /*bu sekilde tek bir obje (ali.setMethod()) uzerinden birden fazla kimlik olusturulabilir
        sistematik sekilde ihtiyac duyulan bir durumda obje adini daha genel bir isim ile student1 vs gibi
        adlandirilip birden fazla kimlik gibi datalar olusturulabilir
                !!!!!!!class daki methodu bozmadan sadece obje uzerunde!!!!!
                */






    }





}//
