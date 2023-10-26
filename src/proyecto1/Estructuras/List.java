/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Estructuras;

import static proyecto1.Grafo.Interfaz.InterfazPrincipal.lista_usuarios;

/**
 *
 * @author fabys
 */
public class List<T> { //Esta es una lista simple. 

    private Node<T> pFirst;
    private Node<T> pLast;
    private int size;

    public List() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;

    }

    public boolean isEmpty() {
        return this.pFirst == null;
    }

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

    public void deleteStart() {
        this.pFirst = this.pFirst.getpNext();
    }

    public void print() {
        Node aux = this.pFirst;

        for (int count = 0; count < this.getSize(); count++) {
            System.out.println(aux.getData());
            aux = aux.getpNext();

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
