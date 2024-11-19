

import ArvoreBinaria.LinkedBinaryTree;

public class Main {
    public static void main(String[] args) {

        LinkedBinaryTree arvere = new LinkedBinaryTree<>();

        arvere.addRoot("Carlos");

        arvere.insertRight(arvere.root(), "Pedro");
        arvere.insertLeft(arvere.root(), "Gabriel");






    }
}