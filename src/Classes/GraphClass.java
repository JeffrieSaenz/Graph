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
public class GraphClass {

    private Nodo root;

    public GraphClass() {
        root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public void insert(Nodo _root, Nodo node) {
        
        if (_root.getValue() > node.getValue()) {
           if(_root.getLeft() == null){
               _root.setLeft(node);
           }else{
            insert(_root.getLeft(), node);
           }
        } else {
            if(_root.getRight() == null){
               _root.setRight(node);
           }else{
            insert(_root.getRight(), node);
           }
        }
    }

    public void addNode(Nodo node) {

        if (this.root == null) {
            root = node;
        } else {
            this.insert(this.root, node);
        }
    }

    public void printGraph(Nodo node) {
        if (node != null) {
            if (node.getLeft() != null) {
                printGraph(node.getLeft());
            }
            if (node.getRight() != null) {
                printGraph(node.getRight());
            }
            System.out.println(node.getValue());
        }
    }

}
