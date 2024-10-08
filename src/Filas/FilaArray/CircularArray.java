package Filas.FilaArray;

import java.util.Arrays;

public class CircularArray {
    private int maxArraySize = 10;
    private int index;
    private int next;
    String[] queue = new String[maxArraySize];


    public CircularArray ( int index, int next) {
        this.index = index;
        this.next = next;
    }





    public int getMaxArraySize() {return maxArraySize;}

    public void setMaxArraySize(int maxArraySize) {this.maxArraySize = maxArraySize;}

    public int getIndex() {return index;}

    public void setIndex(int index) {this.index = index;}

    public int getNext() {return next;}

    public void setNext(int next) {this.next = next;}
}
