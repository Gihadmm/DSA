package ListadeNodos.exceptions;

@SuppressWarnings("serial")

public class BoundaryViolationException extends RuntimeException {

    public BoundaryViolationException(String err) { super(err); }

}
