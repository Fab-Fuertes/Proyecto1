/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1.Estructuras;

/**
 * Esta clase representa un nodo en un grafo.
 * @author fabys
 */
public class NodoGrafo {
    public Object dato;
    ListaAdyacencia lista;
    public NodoGrafo siguiente;
    
    /**
     * Constructor para la clase NodoGrafo.
     * Inicializa el dato, la lista de adyacencia y el nodo siguiente.
     * @param x el dato a almacenar en el nodo.
     */
    public NodoGrafo(Object x){
        dato = x;
        lista = new ListaAdyacencia();
        siguiente = null;
    }
}

