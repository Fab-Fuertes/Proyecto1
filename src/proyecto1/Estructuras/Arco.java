/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Estructuras;

/**
 * Esta clase representa un arco en un grafo.
 */
public class Arco {
    Object destino;
    public Arco siguiente;
    
    /**
     * Constructor que recibe un parámetro y lo fija como destino.
     *
     * @param d el destino del arco
     */
    public Arco(Object d){  
        destino = d;
        siguiente = null;
    }
    
}
