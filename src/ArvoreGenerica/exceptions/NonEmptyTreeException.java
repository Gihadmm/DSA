package ArvoreGenerica.exceptions;

@SuppressWarnings("serial")
public class NonEmptyTreeException extends RuntimeException
{
    public NonEmptyTreeException(String err) {
        super(err);
    }
}