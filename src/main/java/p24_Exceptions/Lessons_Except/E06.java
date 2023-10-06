package p24_Exceptions.Lessons_Except;

public class E06 {


    public static void main(String[] args) {
        String s = "Java";
        getNumberOfChars(s);

        String t = "";
        getNumberOfChars(t);

        String u = null;
        getNumberOfChars(u);



    }

    //String in degeri null oldugu zaman String methodlarini kullanamazsiniz java NullPointerException atar
    public static void getNumberOfChars(String s) {

        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        } catch (NullPointerException e) {
            System.err.println("null degeri icin string methodlari kullanilamaz");
        }

    }


}
