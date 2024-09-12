package ListasEncadeadas.LEDC.ListaEncadeadaDuplamenteCircular;

import ListasEncadeadas.LEDC.ListaEncadeadaDuplamenteCircular.Node;


public class CircularDLinkedList{


    protected Node head;
    protected Node tail;
    protected int size;


    public void addHead(String element) {
        Node newNode = new Node(element, null,null);
        if (size == 0) {
            tail = head = newNode;
        } else if (size == 1) {
            newNode.setNext(head);

            head.setPrev(newNode);
            head.setNext(newNode);

            head = newNode;
            newNode.setPrev(tail);


        }else {
            newNode.setNext(head);
            newNode.setPrev(tail);


            head.setPrev(newNode);
            tail.setNext(newNode);
            head = newNode;

        }
        size++;
    }

    public void addTail(String element) {
        Node newNode = new Node(element, null,null);
        if (size == 0) {
            head = tail = newNode;
        } else if (size == 1) {

            newNode.setNext(head);
            newNode.setPrev(tail);

            tail.setNext(newNode);
            tail.setPrev(newNode);

            tail = newNode;
        } else {
            newNode.setNext(head);
            newNode.setPrev(tail);

            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Lista vazia");
        } else if (size==1) {

            tail = head = null;

        } else if (size == 2) {

            head = head.getNext();
            head.setPrev(null);
            tail.setNext(null);

        } else {
            head = head.getNext();
            head.setPrev(tail);
            tail.setNext(head);
        }
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Lista vazia");

        } else if (size == 1) {

            tail = head = null;

        } else if (size == 2) {

            tail = tail.getPrev();
            head.setPrev(null);
            tail.setNext(null);

        }else {

            tail = tail.getPrev();
            head.setPrev(tail);
            tail.setNext(head);

        }
        size--;

    }

    public double size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean contains(String a) {
        return false;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]"; // Lista vazia
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node current = head;
        int count = 0; // Contador para percorrer os elementos da lista

        // Percorre a lista até retornar à cabeça
        while (count < size) {
            sb.append(current.getElement());
            current = current.getNext(); // Avança para o próximo nó
            if (count < size - 1) {
                sb.append(", ");
            }
            count++;
        }

        sb.append("]");
        return sb.toString();
    }
}
