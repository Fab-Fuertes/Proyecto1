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
public class Grafo {
    private NodoGrafo primero;
    private NodoGrafo ultimo;
    private NodoGrafo siguiente;
    
    public Grafo(){
        primero = null;
        ultimo= null;
        siguiente = null;
    }
    
    public boolean grafoVacio(){
        return primero == null;
    }
    
    public boolean existeVertice(Object dato){
        boolean existe = false;
        if(!grafoVacio()){
            NodoGrafo temporal = primero;
            while(temporal != null && !existe){
                if(temporal.dato.toString().equals(dato.toString())){
                    existe =true;
                    
                }
                temporal = temporal.siguiente;
            }
        }
        return existe;
    }
    
    public void NuevoArco(Object origen, Object destino){
        if(existeVertice(origen) && existeVertice(destino)){
            NodoGrafo posicion = primero;
            while(!posicion.dato.equals(origen.toString())){
                posicion = posicion.siguiente;
            }
            
            posicion.lista.nuevaAdyacencia(destino);
        }
    }
    
}
