package p24_Exceptions.Lessons_Except;

public class E11 {
    /*
    Exception lar disinda Error diye adlandirdigimiz ve handle edilemeyen bazi problemler vardir
     mesela application larda Memory nin dolmasi bir errordur
        iki tur memory error vardir:
        a) Stack memory dolarsa "StackOverFlow Error" alirsiniz
        b) Heap memory dolarsa "OutOfMemory Error" alirsiniz

        finalize:
        Garbage collector memory i temiz tutmak icin surekli memoryi tarar ve silinmesi gerekenleri siler
        Garbage collector silmeden once sileceği datalari "finalize" yapar sonra siler
        yani Garbage collector sadece finalized yapilmis objeleri toplar ve yok eder

        final - finally - finalize()
        final; bir keyworddur, class ve methodlari kisrlastirmak icin kullanilirdi
        finally: bir code blogudur, database ile connection i keser
        finalize; garbage collector, memory i temiz tutar
     */

    public static void main(String[] args) {

    }

}
