package ListadeNodos.exceptions;

@SuppressWarnings("serial")

public class InvalidPositionException extends RuntimeException {

    public InvalidPositionException(String err) { super(err); }

}