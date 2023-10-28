/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Estructuras;

/**
 * Esta clase representa una estructura de datos de tipo Stack (Pila).
 * @param <T> el tipo de elementos guardados en el Stack.
 * @author cehernandez
 */
public class Stack<T> {
    private List<T> elements;

    /**
     * Constructor para la clase Stack.
     * Inicializa la lista de elementos.
     */
    public Stack() {
        elements = new List<T>();
    }

    /**
     * Este método agrega un elemento al final del Stack.
     * @param data el elemento a agregar.
     */
    public void push(T data) {
        elements.addEnd(data);
    }
    
    /**
     * Este método elimina y devuelve el último elemento del Stack.
     * @return el último elemento del Stack, o null si el Stack está vacío.
     */
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

    /**
     * Este método verifica si el Stack está vacío.
     * @return true si el Stack está vacío, false en caso contrario.
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }
}


