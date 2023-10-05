/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Estructuras;
/**
 *
 * @author fabys
 */
public class Node<T> {
    
    private T data;
    private Node<T> pNext; 
    
    public Node (T data){
        this.data = data;
        this.pNext = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getpNext() {
        return pNext;
    }

    public void setpNext(Node<T> pNext) {
        this.pNext = pNext;
    }
    
    
    
}
