package p21_OOP_Abstractions.Lessons_Interface;

public class Interface00HondaRunner {
    public static void main(String[] args) {

        //object olustur: iki modele de AirCon ile cool ozelligi ekle
        //Ac interface parent classda cool methodu olusturuldu

        Int5CivicModel civic = new Int5CivicModel();
        civic.cool();

        Int4AccordModel accord = new Int4AccordModel();
        accord.cool();
    }

}//
