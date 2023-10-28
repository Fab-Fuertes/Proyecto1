/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Estructuras;

/**
 * Esta clase representa un nodo en una estructura de datos.
 * @param <T> el tipo de datos almacenados en el nodo.
 * @author fabys
 */
public class Node<T> {
    
    private T data;
    private Node<T> pNext; 
    
    /**
     * Constructor para la clase Node.
     * Inicializa el dato y el nodo siguiente.
     * @param data el dato a almacenar en el nodo.
     */
    public Node (T data){
        this.data = data;
        this.pNext = null;
    }

    /**
     * Este método devuelve el dato almacenado en el nodo.
     * @return el dato almacenado en el nodo.
     */
    public T getData() {
        return data;
    }

    /**
     * Este método establece el dato del nodo.
     * @param data el dato a establecer.
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Este método devuelve el siguiente nodo.
     * @return el siguiente nodo.
     */
    public Node<T> getpNext() {
        return pNext;
    }

    /**
     * Este método establece el siguiente nodo.
     * @param pNext el siguiente nodo a establecer.
     */
    public void setpNext(Node<T> pNext) {
        this.pNext = pNext;
    } 
}

