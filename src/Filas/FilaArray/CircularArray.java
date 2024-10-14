package Filas.FilaArray;


import java.lang.reflect.Array;

public class CircularArray  {
    Object[] fila;
    private int maxArraySize = 5;
    private int index;
    private int next;


    public CircularArray ( int index, int next, int tamanho) {
        this.index = index;
        this.next = next;
        this.maxArraySize= tamanho;
        this.fila = new Object[tamanho];

    }



    public int getMaxArraySize() {return maxArraySize;}

    public void setMaxArraySize(int maxArraySize) {this.maxArraySize = maxArraySize;}

    public int getIndex() {return index;}

    public void setIndex(int index) {this.index = index;}

    public int getNext() {return next;}

    public void setNext(int next) {this.next = next;}
}
