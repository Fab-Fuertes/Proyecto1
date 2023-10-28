/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Estructuras;

/**
 * Esta clase representa una lista de adyacencia en un grafo.
 * @author fabys
 */
public class ListaAdyacencia {

    public Arco primero; // El primer arco en la lista
    Arco ultimo; // El último arco en la lista

    /**
     * Constructor para la clase ListaAdyacencia.
     * Inicializa los arcos primero y último a null.
     */
    public ListaAdyacencia() {
        primero = null;
        ultimo = null;
    }

    /**
     * Comprueba si la lista está vacía.
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean listaVacia() {
        return primero == null;
    }

    /**
     * Crea una nueva adyacencia en la lista.
     * @param destino El objeto destino de la adyacencia.
     */
    public void nuevaAdyacencia(Object destino) {
        if (!adyacente(destino)) {
            Arco nodo = new Arco(destino);
            insertar(nodo, destino);
        }
    }

    /**
     * Inserta un nuevo nodo en la lista de adyacencia.
     * @param nodo El nodo a insertar.
     * @param destino El objeto destino del nodo.
     */
    public void insertar(Arco nodo, Object destino) {
        if (listaVacia()) {
            primero = nodo;
            ultimo = nodo;
        } else {
            if (destino.toString().compareTo(primero.destino.toString()) <= 0) {
                nodo.siguiente = primero;
                primero = nodo;
            } else {
                if (destino.toString().compareTo(ultimo.destino.toString()) >= 0) {
                    ultimo.siguiente = nodo;
                    ultimo = nodo;
                } else {
                    Arco posicion = primero;
                    while (destino.toString().compareTo(posicion.destino.toString()) > 0) {
                        posicion = posicion.siguiente;
                    }
                    nodo.siguiente = posicion.siguiente;
                    posicion.siguiente = nodo;
                }
            }
        }
    }

    /**
     * Comprueba si un objeto es adyacente en la lista.
     * @param dato El objeto a comprobar.
     * @return true si el objeto es adyacente, false en caso contrario.
     */
    public boolean adyacente(Object dato) {
        Arco actual;
        boolean encontrado = false;
        actual = primero;
        while (actual != null && !dato.toString().equals(actual.destino.toString())) {
            actual = actual.siguiente;
        }
        if (actual != null) {
            encontrado = true;
        }
        return encontrado;
    }

    /**
     * Devuelve una representación de cadena de la lista de adyacencia.
     * @return Una cadena que representa la lista de adyacencia.
     */
    public String toString() {
        String cadena = "";
        Arco temporal = primero;
        while (temporal != null) {
            cadena = cadena + temporal.destino.toString() + ";";
            temporal = temporal.siguiente;
        }
        return cadena;
    }

    /**
     * Elimina una adyacencia de la lista.
     * @param dato El objeto de la adyacencia a eliminar.
     */
    public void eliminarAdyacencia(Object dato) {
        if (!listaVacia() && this.adyacente(dato)) {
            if (this.primero == this.ultimo) {
                this.primero = null;
                this.ultimo = null;
            } else {
                Arco pActual = this.primero;
                Arco pAnterior = null;
                while (pActual != null && dato.toString().compareTo(pActual.destino.toString()) > 0) {
                    pAnterior = pActual;
                    pActual = pActual.siguiente;
                    if (pActual == this.primero) {
                        Arco nodoEliminar = this.primero;
                        this.primero = this.primero.siguiente;
                        nodoEliminar.siguiente = null;

                    } else {
                        if (pActual == this.ultimo) {
                            pAnterior.siguiente = null;
                            this.ultimo = pAnterior;
                        } else {
                            pAnterior.siguiente = pActual.siguiente;
                            pActual.siguiente = null;
                        }
                    }
                }

            }

        }

    }

}

