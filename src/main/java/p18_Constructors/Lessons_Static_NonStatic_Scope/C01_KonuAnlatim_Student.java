package p18_Constructors.Lessons_Static_NonStatic_Scope;

public class C01_KonuAnlatim_Student {

/*
    1) static variable veya static methodlar (class member) tum object ler icin ortak elemandir
    2) static class memberlar uzerinde yapilan degisiklikler tum objectleri etkiler.
    3) static class memberlar class-a, non-static class memberlar objectler e monte edilir
    4) static class memberlar a ulasmak icin object olusturmaya gerek duyulmaz,
        ama non-static class memberlar a ulasmak icin object olusturmak sarttir
    5) static variable larin diger adi class variable dir,
        non-static variable' larin diger adi instance variable veya object variable dir
     */

    public static String stdName ="Ali Can";

    public int age=18;

    public static void staticMethod(){
        System.out.println("Ben static methodum");
    }
    public void nonStaticMethod(){
        System.out.println("Ben static olmayan methodum");

    }

}
