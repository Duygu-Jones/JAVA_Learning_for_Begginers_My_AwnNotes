package p24_Exceptions.Lessons_Except;

public class InvalidNumberException extends RuntimeException{

    public InvalidNumberException(String message) {
        super(message);
    }

}
