package p18_Constructors.ssg_Constructors_Practice;

public class C01_constructor {

    static int sayac=100;
    int x;
    int y;

    int id;
    public C01_constructor(int x, int y) {
        id=idAtama();
        this.x = x;
        this.y = y;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println("tum degerler atandi");
    }
    public C01_constructor(){
        id=idAtama();
        //System.out.println("bu constructor bos oldugu icin sadece id atama islemi yapıldi");
    }
    public int idAtama(){
        id=sayac;
        sayac++;
        return id;
    }

    public static void main(String[] args) {
        C01_constructor obje1=new C01_constructor();
        C01_constructor obje2=new C01_constructor(2,5);
        System.out.println(obje1.id);
        System.out.println(obje2.id);

    }

}
