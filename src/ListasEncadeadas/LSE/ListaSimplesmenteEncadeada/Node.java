package ListasEncadeadas.LSE.ListaSimplesmenteEncadeada;

public class Node {

    private String element;
    private Node next;

    public Node(String element, Node next) {
        this.element = element;
        this.next = next;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }
}
