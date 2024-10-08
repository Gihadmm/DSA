package Filas.FilaArray;

import Filas.FilaArray.CircularArray;
import ListasEncadeadas.LEDC.ListaEncadeadaDuplamenteCircular.Node;


public class ArrayQueue {

    CircularArray fila = new CircularArray(0,1);
    protected String[] Q = fila.queue;
    protected int size = 0;
    protected int N = fila.getMaxArraySize();
    protected int f = fila.getIndex();
    protected int r = fila.getNext();


    public void Enqueue(String data) {
        if (size() > N - 1){

            size =0;

        } else{
            Q[r] = data;
            r = (r+1)% N;
        }

    }

    public String Dequeue() {
        String temp = null;

        if (isEmpty()){

            size=0;

        }else {

            temp = Q[f];

            Q[f] = null;

            f = (f+1)%N;
        }

        return temp;

    }

    public boolean isEmpty() {

       return (r == f);
    }

    public int size() {

        return (N - f +r);
    }


}
