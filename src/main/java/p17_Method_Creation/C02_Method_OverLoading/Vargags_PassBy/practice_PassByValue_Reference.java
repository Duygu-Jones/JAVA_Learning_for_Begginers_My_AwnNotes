package p17_Method_Creation.C02_Method_OverLoading.Vargags_PassBy;

public class practice_PassByValue_Reference {
    public static void main(String[] args) {
        int fiyat =100;     //orjinal data

        System.out.println("Methodda hesaplanan fiyat; " + indirim(fiyat)); //90 ==> method cagrildi-orjinal data degisti==> passByReference
        System.out.println("Method call sonrasi fiyat; " + fiyat); //100 //orjinal data degismedi ==> passByValue
    }

    private static int indirim(int fiyat) {
        fiyat = (int) (fiyat*0.90);
        return fiyat; // methodda yeni deger atanan data
    }



}
