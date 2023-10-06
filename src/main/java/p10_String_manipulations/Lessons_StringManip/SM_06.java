package p10_String_manipulations.Lessons_StringManip;

public class SM_06 {
    public static void main(String[] args) {

   /* Ornek:
       Bir password (pwd) icin aşağıdaki koşullara sahip olup olmadığını kontrol edin
         i) password Boş olmamalıdır, en az bir karakter icermelidir.
         ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterler de bulunmalidir
         iii) Başında ve sonunda boşluk olmamalıdır.
   */

//Task1; i) password Boş olmamalıdır, en az bir karakter icermelidir.
        //HEPSINI IF SENARYOSUNA gore hazirla, gereken yerde ! degildir kullan
// Senaryo 1 icin;
        String pwd1 = " ";

        // .isEmpty() bir string eger bos ise TRUE verir, aksi halde FALSE verir. (bu method SPACE karakterini de sayar)
        // Bu durumda "String is NOT Empty" demek icin basina degildir(!) isareti eklenir >> !pwd.isEmpty(); //pozitif logic

        //boolean characterControl = !pwd1.isEmpty();// ! dolayi karakter var ise TRUE diyecek (pwd1 is not empty>> True)
        boolean characterControl = pwd1.isEmpty(); //normal yazimini yapalim //false// bosluk karakteri var diyor (pwd1 is empty>> false) empty degil space carcteri var
        System.out.println("characterControl = " + characterControl);

        //ACIKLAMA
        /*  isEmpty(); sayisal anlamda character kontrolu yapar, hicbirsey icin true verir, space de bir karakerdir
            isEmpty? bos ise TRUE (space dahil) karakter var ise FALSE verir
            pozitif logic icin basina ! eklenebilir; yani karakter var ise TRUE der
                */

        /* isBlank(); methodu ise metinsel/ gorunurluk var mi yok mu kontrolu yapar;
           space karakterleri dahil ve hiclik icin true verir; yani SPACE i gormez  bos ise karakter yok der;en az bir harf, rakam, sembol vs kontrol eder
            isBlank() methodu, isEmpty i kapsar
            ayni sekilde pozitif logic icin basina ! eklenebilir; yani GORUNUR en az bir karakter var ise TRUE der
                 */



        //Task2; ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı,
        // space harici karakterlerde bulunmalidir
        //isBlank() methodu sadece space iceren stringler icin true verir, space disinda bir character icerirse false verir, yani bos degil der

        // Senaryo 2 icin;

        String pwd2 = "        5       ";
        //boolean spaceHariciCharacterVarmi = !pwd2.isBlank(); //// var(5) // True

        boolean spaceHariciCharacterVarmi =pwd2.isBlank(); // False ==>hayir blank degil,  space harici de 5 var diyor
        System.out.println("spaceHariciCharacterVarmi = " + spaceHariciCharacterVarmi);

        //Task 3;  iii) Başında ve sonunda boşluk olmamalıdır.
        // Senaryo 3 icin;
        String pwd3 = "   Abcde1234    ";

        boolean basSonSpaceYok = pwd3.trim().equals(pwd3);  //trim(); basinda ve sonuda space var pwd3 de// equals; esitmi diye sorar degilse false

        //trim ile bosluk var ise kirpilir, equals ile de esitlenir

        //ilk hali trim lenmis haline esit degilse bas ve sonunda bosluk vardir
        //ilk hali trimlenmis haline esit ise o zmn basinda ve sonunda space yoktur


        //Simdi hepsini dogrulayalim
        //(isEmpty ve isBlank basindaki ! kaldirilarak hazirlandi)

        if (characterControl) { //isEmpty(); ==> characters (a, 1, ?, _, space ....gibi) yok ise
            System.out.println("Parola bos birakilamaz!!"); //'boyle yazdir' dedik
        }

        if (spaceHariciCharacterVarmi) { // isBlanck(); ==> metinsel-gorunur ise---> yok ise
            System.out.println("Paroloda space harici gorunur en az 1 karakter bulunmalidir!"); //'boyle yazdir' dedik
        }

        if (!basSonSpaceYok) { //trim(); ettik ve pwd3 ile karsilastirdik !equals(); ise
            System.out.println("Parolanin basinda ve sonunda bosluk birakilmamalidir"); //'boyle yazdir' dedik
        }

        //MEMORY KULLANIMI hakkinda
         /*
        Nate:
            String lerin esitliklerini kontrol ederken "==" iasareti yerine equals(); methodu kullaniriz

            cunku == esittir mat'sel sembolu iki stringi karsilastirirken hem adreslerin (koordinat) hem de degerlerine bakar
            eger ikiside ayni ise stringler esittir der

            equals() methodu ise iki stringi karsilastirirken sadece degerlerine bakar, eger gorunurlugu metinsel olarak
            degerleri ayni ise bu iki string esittir der, degerler farkli ise bu iki string farkli der


         */


    }//main
}
