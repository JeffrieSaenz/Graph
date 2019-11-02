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
    private int level;

    public GraphClass() {
        root = null;
        level = 0;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    private void insert(Nodo _root, Nodo node) {
        
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

    public  void addNode(Nodo node) {
        System.out.println("Insertando: "+node.getValue());
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
            System.out.println(node.getValue());
            if (node.getRight() != null) {
                printGraph(node.getRight());
            }
            
        }
    }
    
    public void calculateLevel(){
        treeLevel(1,root);
    }
    
    private void treeLevel(int numero, Nodo node){
       if(node != null){
           
           if(node.getLeft() != null){
              if(numero+1>level) 
                  level=numero+1;
              treeLevel(numero+1, node.getLeft());
           }
           
           if(node.getRight() != null){
              if(numero+1>level) 
                  level=numero+1;
              treeLevel(numero+1, node.getRight());
           }
           
       }
    }
    
    
    public boolean verifyNumberExists(int numero){
        return numberExists(numero, root);
    }
    
    private boolean numberExists(int numero, Nodo node){
          
        if(node== null){
            return false;
        }
            if(node.getValue() == numero){
                return true;
            }
                if(node.getValue() > numero){
             return numberExists(numero, node.getLeft());
           }else{
             return numberExists(numero, node.getRight());
           }   
    }

}
