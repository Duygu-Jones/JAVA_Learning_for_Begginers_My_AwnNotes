package p18_Constructors.Lessons_Static_NonStatic_Scope;

public class C02_StdRunner {

    public static void main(String[] args) {

        //stdName static oldugundan ona ulasmak icin object olusturmadim
        //static class memberlara(.stdName) ulasmak icin sadece class ismi (C01Student.) yeterlidir
        System.out.println(C01_KonuAnlatim_Student.stdName);

        //(age) non-static oldugunda ise ona ulasmak icin
        // object(C01Student ali = new C01Student();) olusturmak zorundayiz
        C01_KonuAnlatim_Student ali = new C01_KonuAnlatim_Student();
        System.out.println(ali.age);

        C01_KonuAnlatim_Student.staticMethod();
        ali.nonStaticMethod();









    }

}
