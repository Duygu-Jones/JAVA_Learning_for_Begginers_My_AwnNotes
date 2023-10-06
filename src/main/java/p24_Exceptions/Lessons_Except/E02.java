package p24_Exceptions.Lessons_Except;

public class E02 {

    public static void main(String[] args) {
        String s="1234";    //1) String data type inda bir value'dir

        convertStringToInt(s); //3) run motoru
    }
    //Icinde rakamlar disinda character olan bir string'i sayiya cevirmek isterseniz java NumbeFormatException atar
    public static void convertStringToInt(String s){ //2) Stringi Integer a cevirmek icin method olusturulur ve try-catch kodlari yazilir
        try {
            int intS=Integer.valueOf(s); //hatirlatma; valueOf() methodu Stringi Int e cevirirdi
            System.out.println(intS +1 );// kodun calisip calismadigini gormek icin +1 yazildi
                                        //"1234" String i Int e cevirildi ise +1 ile=>1235 seklide sayisal toplama yapar
                                        // eger cevirmez string olarak kalir sie=>12341 seklinde concationation yapar

        }catch (NumberFormatException e){ //Eger sayi Format Haatasi gelirse yakala

            System.out.println("Bir Stringin sayiya cevrilebilmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage()); //e object ismi ile NumberFormatException classindan .getMessage(); methodu cagirildi
                                                //Teknik hata mesajini getirir==> Catch ksimi calisirsa eger=> For input string "1234a" gibi mesaji da gosterir

        }


    }


}
