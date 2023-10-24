/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Estructuras;

/**
 *
 * @author cehernandez
 */
public class Stack<T> {
    private List<T> elements;

    public Stack() {
        elements = new List<T>();
    }

    public void push(T data) {
        elements.addEnd(data);
    }
    
    public T pop() {
        if (elements.isEmpty()) {
            return null;
        } else {
            T data = elements.getpLast().getData();

            // Si solo hay un elemento en la lista
            if (elements.getSize() == 1) {
                elements.setpFirst(null);
                elements.setpLast(null);
            } else {
                // Encuentra el penúltimo nodo
                Node<T> penultimate = elements.getpFirst();
                while (penultimate.getpNext() != elements.getpLast()) {
                    penultimate = penultimate.getpNext();
                }

                // Establece el penúltimo nodo como el último
                penultimate.setpNext(null);
                elements.setpLast(penultimate);
            }

            // Disminuye el tamaño de la lista
            elements.setSize(elements.getSize() - 1);

            return data;
        }
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}

