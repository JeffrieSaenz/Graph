/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import Classes.GraphClass;
import Classes.Nodo;

/**
 *
 * @author saenz
 */
public class Graph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GraphClass g = new GraphClass ();
        
        g.addNode(new Nodo(5));
        g.addNode(new Nodo(10));
         g.addNode(new Nodo(15));
        
        g.printGraph(g.getRoot());
        
    }
    
}
