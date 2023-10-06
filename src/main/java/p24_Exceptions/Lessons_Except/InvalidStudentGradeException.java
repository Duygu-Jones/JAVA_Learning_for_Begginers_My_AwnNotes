package p24_Exceptions.Lessons_Except;

public class InvalidStudentGradeException extends Exception {

    public InvalidStudentGradeException(String message) {
        super(message);
    }
    /*
    1)Custom Exception class olusturmak icin Exception class a extend etmeliyiz
         Exception class a extend ederek olusturdugumuz Custom Exception "Compile Time Exception" olur
         Eger Runtime Custom Exception olusturmak isterseniz RuntimeException Class'a extend etmelisiiz

    2)Custom Exception Class olustururken eger mesaj verebilen obje uretmek isterseniz constructori buna göre secebilirsiniz
    ve bu constructor parent taki constructor i cagirmalidir, Bu constructor mesaj verecek veya vermeyecek sekilde olusturulabilir

    3) Custom Exception Class olustururken ismin sonunda Exception kelimesini kullanmaliyiz,
    InvalidStudentGradeException örneginde oldugu gibi
     */



}
