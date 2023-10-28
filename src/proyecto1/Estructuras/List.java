/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Estructuras;

/**
 * Esta clase representa una lista simple.
 *
 * @param <T> el tipo de elementos en esta lista
 */
public class List<T> {

    private Node<T> pFirst;
    private Node<T> pLast;
    private int size;

    /**
     * Construye una lista vacía.
     */
    public List() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    /**
     * Verifica si la lista está vacía.
     *
     * @return verdadero si la lista está vacía, falso de lo contrario
     */
    public boolean isEmpty() {
        return this.pFirst == null;
    }

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param data el elemento a agregar
     */
    public void addEnd(T data) {
        Node<T> node = new Node(data);

        if (this.isEmpty()) {
            this.pFirst = node;
            this.pLast = node;
        } else {
            this.pLast.setpNext(node);
            this.pLast = node;
        }
        size++;
    }

    /**
     * Elimina un valor específico de la lista.
     *
     * @param data el valor a eliminar
     */
    public void deleteValue(T data) {
        Node aux = this.pFirst;
        try {
            for (int count = 0; count < this.size; count++) {
                if (aux.getpNext().getData() == data) {
                    aux.getpNext().setpNext(aux.getpNext().getpNext());
                    size--;
                    break;
                } else {
                    aux = aux.getpNext();
                }
            }
        } catch (NullPointerException e) {
            System.out.println("el dato no existe en la lista");

        }

    }

    /**
     * Elimina un usuario específico de la lista de usuarios.
     *
     * @param user_list la lista de usuarios
     * @param name el nombre del usuario a eliminar
     */
    public void deleteValueUser(List<Usuarios> user_list, String name) {
        Node<Usuarios> aux = user_list.pFirst;
        if (this.isEmpty()) {
            System.out.println("Lista vacia");
            return;
        }

        if (aux.getData().getUsuario().equals(name)) {
            System.out.println("Usuario Eliminado: " + aux.getData().getUsuario());
            user_list.pFirst = user_list.pFirst.getpNext();
            user_list.size--;
            return;
        }

        while (aux.getpNext() != null) {
            if (aux.getpNext().getData().getUsuario().equals(name)) {
                System.out.println("Usuario Eliminado: " + aux.getpNext().getData().getUsuario());
                aux.setpNext(aux.getpNext().getpNext());
                user_list.size--;
                return;

            }
            aux = aux.getpNext();
        }

    }

    /**
     * Obtiene un elemento por su índice en la lista.
     *
     * @param index el índice del elemento a obtener
     * @return el elemento en el índice especificado, o nulo si el índice es mayor que el tamaño de la lista
     */
    public T GetbyIndex(int index) {
        Node<T> pAux = this.pFirst;

        if (this.size <= index) {

            return null;

        } else {

            for (int count = 0; count < index; count++) {

                pAux = pAux.getpNext();
            }
            return pAux.getData();
        }

    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void deleteStart() {
        this.pFirst = this.pFirst.getpNext();
    }

    /**
     * Imprime todos los elementos de la lista.
     */
    public void print() {
        Node aux = this.pFirst;

        for (int count = 0; count < this.getSize(); count++) {
            System.out.println(aux.getData());
            aux = aux.getpNext();

        }

    }

    /**
     * Obtiene el primer nodo de la lista.
     *
     * @return el primer nodo
     */
    public Node<T> getpFirst() {
        return pFirst;
    }

    /**
     * Establece el primer nodo de la lista.
     *
     * @param pFirst el nuevo primer nodo
     */
    public void setpFirst(Node<T> pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * Obtiene el último nodo de la lista.
     *
     * @return el último nodo
     */
    public Node<T> getpLast() {
        return pLast;
    }

    /**
     * Establece el último nodo de la lista.
     *
     * @param pLast el nuevo último nodo
     */
    public void setpLast(Node<T> pLast) {
        this.pLast = pLast;
    }

    /**
     * Obtiene el tamaño de la lista.
     *
     * @return el tamaño de la lista
     */
    public int getSize() {
        return size;
    }

    /**
     * Establece el tamaño de la lista.
     *
     * @param size el nuevo tamaño de la lista
     */
    public void setSize(int size) {
        this.size = size;
    }

}
