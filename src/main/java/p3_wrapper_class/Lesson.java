package p3_wrapper_class;

public class Lesson {

    public static void main(String[] args) {

        //JAva, primitive data typelarına bazı faydalı methodlar ekleyerek yeni bir veri yapısı oluşturmuştur.
        //Bu yeni yapı "Wrapper Class" olarak adlandırılır

        //primitive     :char       -boolean - byte - short - int - long - float - double
        //Wrapper Class :Character  -Boolean - Byte - Short - Int - Long - Float - Double

        //   primitive
        int n = 12;

        //Wrapper
        Integer m = 12;

        //Primitive int'i WrapperClass Integer'a çevirebiliriz (==> Autoboxing)
        //ornek :

        int num = 13;
        Integer wrapperNum = num;

        //Wrapper Byte'i primitive byte'a cevirebiliriz (==> Unboxing)
        //Ornek :

        Byte k = 13;
        byte primitiveK = k;




    }
}
