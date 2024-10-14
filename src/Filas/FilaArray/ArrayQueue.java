package Filas.FilaArray;

import Filas.FilaArray.CircularArray;
import Filas.FilaArray.FullQueueException;
import Filas.FilaArray.EmptyQueueException;

public class ArrayQueue implements Queue {


    CircularArray fila = new CircularArray(0,1,5);


    public void Enqueue(Object element) {

        if (size() == fila.getMaxArraySize()){
            throw new FullQueueException("Queue is full");
        } else{
            fila.fila[fila.getNext()] = (String) element;

            fila.setNext((fila.getNext() + 1) % fila.getMaxArraySize());
        }

    }

    public Object Dequeue() {

        if (isEmpty()) throw new EmptyQueueException("A fila está vazia");

        Object temp = fila.fila[fila.getIndex()];
        fila.fila[fila.getIndex()] = null;
        fila.setIndex((fila.getIndex() +1)% fila.getMaxArraySize());
        return temp;
    }

    public int size() {
        return (fila.getMaxArraySize() - fila.getIndex()+ fila.getNext());
    }


    public boolean isEmpty() {
      return (fila.getIndex() == fila.getNext());
    }


    public Object front() throws EmptyQueueException {

        if (isEmpty()) throw new EmptyQueueException("A fila está vazia");

        return fila.fila[fila.getIndex()];
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        int currentIndex = fila.getIndex();
        int size = size();

        for (int i = 0; i < size; i++) {
            result.append(fila.fila[currentIndex]);
            if (i < size - 1) {
                result.append(", ");
            }
            currentIndex = (currentIndex + 1) % fila.getMaxArraySize();
        }

        result.append("]");
        return result.toString();
    }
    }






