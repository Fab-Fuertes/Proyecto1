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
public class ListaAdyacencia {

    Arco primero;
    Arco ultimo;

    public ListaAdyacencia() {
        primero = null;
        ultimo = null;

    }

    public boolean listaVacia() {
        return primero == null;
    }

    public void nuevaAdyacencia(Object destino) {
        if (!adyacente(destino)) {
            Arco nodo = new Arco(destino);
            insertar(nodo, destino);
        }
    }

    public void nuevaAdyacenciaObject(Object destino, float peso) {
        if (!adyacente(destino)) {
            Arco nodo = new Arco(destino, peso);
            insertar(nodo, destino);
        }
    }

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

    public boolean adyacente(Object dato) {
        Arco actual;
        boolean encontrado;
        encontrado = false;
        actual = primero;
        while (actual != null && !dato.toString().equals(actual.destino.toString())) {
            actual = actual.siguiente;
        }
        if (actual != null) {
            encontrado = true;
        }
        return encontrado;
    }

    public String toString() {
        String cadena = "";
        Arco temporal = primero;
        while (temporal != null) {
            cadena = cadena + temporal.destino.toString() + ";";
            temporal = temporal.siguiente;
        }
        return cadena;

    }

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
