package ListasEncadeadas.LDE.ListaDuplamenteEncadeada;

public class DLinkedList {

    protected Node head;
    protected Node tail;
    protected int size;

    public DLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }


    public void addHead(String element) {
        Node newNode = new Node(element, null,null);
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void addTail(String element) {
        Node newNode = new Node(element, null,null);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }

        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Lista vazia");
        } else if (size != 1) {
            head = head.getNext();
            head.setPrev(null);
        } else{
            head = head.getNext();
        }

        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Lista vazia");
        } else if (size != 1) {
            tail = tail.getPrev();
            tail.setNext(null);
        } else {
            tail = tail.getPrev();
        }

        size--;

    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node current = head;
        while (current != null) {
            sb.append(current.getElement());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }

        sb.append("]");
        return sb.toString();
    }
}
