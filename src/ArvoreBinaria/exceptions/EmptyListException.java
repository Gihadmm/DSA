package ArvoreBinaria.exceptions;

@SuppressWarnings("serial")

public class EmptyListException

        extends RuntimeException {

    /* Exceção lançada se a lista estiver vazia e tentar, por

     * exemplo, obter o primeiro elemento da lista usando o método

     * first. */

    public EmptyListException(String err) { super(err); }

}
