/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author saenz
 */
public class Nodo {
    
    private int value;
    private Nodo right;
    private Nodo left;

    public int getValue() {
        return value;
    }

    public Nodo getRight() {
        return right;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo(int value, Nodo right, Nodo left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }
    
    public Nodo(int n) {
        this.value = n;
        this.right = null;
        this.left = null;
    }
    
    
}
