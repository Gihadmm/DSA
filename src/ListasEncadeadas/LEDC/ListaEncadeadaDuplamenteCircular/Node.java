package ListasEncadeadas.LEDC.ListaEncadeadaDuplamenteCircular;

public class Node {
    private String element;
    private Node next;
    private Node prev;

    public Node(String element, Node next, Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public String getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }
}
