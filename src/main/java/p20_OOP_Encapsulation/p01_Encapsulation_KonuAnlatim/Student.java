package p20_OOP_Encapsulation.p01_Encapsulation_KonuAnlatim;

public class Student {

    /*
    Encapsulation ==>kapsulleme
    Encapsulation Nedir? Data hiding (veri saklama)
    Data nasil saklanir?
    Acces Modifierlarini private yaparak datayi diger classlardan gorunmez hale getirerek saklarim

    Encpasulation yaptigimiz data yi istersek diger classlardan okuyabiliriz
    Nasil okuyabiliriz?
    get method olusturarak encapsulate edilmis datanin degerini okuyabiliriz

    1) get methodlar public olur
    2) get methodun return type i okudugu variable in return type i ile ayni olur
    3) get method bir boolean variable icin olusturulduysa ismi is ile baslar

    Encpasulation yaptigimiz data yi istersek diger classlardan değistirebiliriz
    Nasil degistirebiliriz?

    1) set methodlari hep public olur
    2) set methodunun return type i hep void olur
    3) set method parametre kullanir, paramatre nin data type i variable ile ayni olur

    set method kullanarak varolan object uzerinde degisiklikler yaparak o objecti sanki yeni bir
    object mis gibi kullanabiliriz

    //getter ve setter larin ikisine birden "java beans" denir.

     */
    public String stdName ="Ali Can";
    public int age =15;
    private String stdId ="AC20231212121";
    private  double notOrt=3.13;
    private boolean succesful= false;

    // >>>>>>>>>>>GET METHOD<<<<<<<<<
    //privite methodlari gorunur yapmak icin==> "GET"  ve "SET" methodlari kullanilir
    //bu methodlarin acces modifieri PUBLIC olmalidir ki diger child classlardan ulasilsin
    //data type lar (yani return typelar) aynidir oldugu gibi ==> Sttring, int, double ect.
    //yazim sekli camel casetir ve bunlar get/set ==> method ismin onune gelir ==> getIsim() {
    // () parantez icleri bostur, ayrica parametre girmeye gerek yoktur maksat sadece gorunur yapmaktir farkli bir data uretmek degil==> getStdId()
    //body kismina sadece return edilmek istenen bu methodum ismi yazilir==> return variableIsim;
    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() { //boolean lar isimlendirme gelenegidir sadece True/False alir==>
        return succesful;           //get methodu booleanlarda is olarak isimden once gelir, soru haline getirir cevap icin.
    }

   // >>>>>>>>>>>SET METHOD<<<<<<<<<
//eger ihtiyac duyulursa data yi sadece diger classlardan değistirebiliriz
//    Nasil degistirebiliriz?
    //return type void dir, child class lardan erisilebilir hale getirilen data nin sadece SET edilmesi gerekir, bir islem yapmasina gerek yoktur
    //yine SET ile baslar
    //SET methodunda parametre girilir, datada neyin set edilecegini belirtmek icin
    public void setStdId(String stdId) {
        this.stdId = stdId;                 // girilen parametreyi isaret eder, this.parametre ile diger clastan bu this variable nin bulunmasini saglar
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
    //booleanin True veya False oldugu merak edilmiyor sadece datayi set etmesi gerekir o yuzden bu da SET ile baslar;
    //yazdiriken "is" ile yazdirilir yine




}//
