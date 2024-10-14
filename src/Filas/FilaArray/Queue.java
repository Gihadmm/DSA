package Filas.FilaArray;



public interface Queue<E> {
    public int size();

    public boolean isEmpty();


    public E front() throws EmptyQueueException;


    public void Enqueue(E element);


    public E Dequeue();
}
