package ListasEncadeadas.LEC.ListaEncadeadaCircular;

public class CircularSLinkedList {

    protected Node head;
    protected Node tail;
    protected int size;

    public CircularSLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }



    public void addHead(String element) {
        Node newNode = new Node(element, null);
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }

        size++;

    }

    public void addTail(String element) {
        Node newNode = new Node(element, null);
        if (size == 0) {
            head = tail = newNode;
            newNode.setNext(head);
        } else {
            tail.setNext(newNode);
            tail = newNode;
            newNode.setNext(head);
        }
        size++;
    }
    public void removeFirst() {
        if (size == 0) {
            System.out.println("Operação inválida");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.getNext();
            tail.setNext(head);
        }
        size--;
    }

    public double size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(String element) {
        return false;
    }


    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node current = head;
        int count = 0;  // Adiciona um contador para evitar loops infinitos
        while (count < size) {
            sb.append(current.getElement());
            current = current.getNext();
            if (count < size - 1) {
                sb.append(", ");
            }
            count++;
        }

        sb.append("]");
        return sb.toString();
    }
}


