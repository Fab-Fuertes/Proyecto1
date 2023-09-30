/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author fabys
 */
public class List<T> { //Esta es una lista simple. 
    private Node<T> pFirst;
    private Node<T> pLast;
    private int size;
    
    public List(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    
    }
    
    public boolean isEmpty() {
        return this.pFirst == null;
    }
    
    public void addEnd(T data){
        Node<T> node = new Node(data);
        
        if (this.isEmpty()) {
            this.pFirst = node;
            this.pLast = node;
        }else{
            this.pLast.setpNext(node);
            this.pLast = node;
        }
        size++;
    }
    
 
    
    
    public T GetbyIndex(int index) {
        Node<T> pAux = this.pFirst.getpNext();
       
        
        if (this.size <= index) {
            
            return null;
            
        } else {
            
            for (int count = 1; count < index;count++) {
            
            pAux = pAux.getpNext();
            }
            return pAux.getData();
        }
            
        
    }

    public Node<T> getpFirst() {
        return pFirst;
    }

    public void setpFirst(Node<T> pFirst) {
        this.pFirst = pFirst;
    }

    public Node<T> getpLast() {
        return pLast;
    }

    public void setpLast(Node<T> pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
