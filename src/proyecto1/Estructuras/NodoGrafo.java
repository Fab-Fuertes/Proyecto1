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
public class NodoGrafo {
    Object dato;
    ListaAdyacencia lista;
    NodoGrafo siguiente;
    
    public NodoGrafo(Object x){
        dato = x;
        lista = new ListaAdyacencia();
        siguiente = null;
    }
    
}
