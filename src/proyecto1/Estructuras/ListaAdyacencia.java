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
    
    public ListaAdyacencia(){
        primero = null;
        ultimo = null;
       
    }
    
    public boolean listaVacia(){
        return primero == null;
    }
    
    public void nuevaAdyacencia(Object destino){
        if(!adyacente(destino)){
            Arco nodo = new Arco(destino);
            insertar(nodo, destino);
        }
    }
    
    public void nuevaAdyacencia(Object destino, float peso){
        if (!adyacente(destino)){
            Arco nodo = new Arco(destino, peso);
            insertar(nodo, destino);
        }
    }
    
    public void insertar(Arco nodo, Object destino){
        if(listaVacia()){
            primero= nodo;
            ultimo = nodo;
         
        }else{
            if(destino.toString().compareTo(primero.destino.toString())<=0){
                nodo.siguiente = primero;
                primero = nodo;
            }else{
                if(destino.toString().compareTo(ultimo.destino.toString())>=0){
                    ultimo.siguiente = nodo;
                    ultimo = nodo;
                }else{
                    Arco posicion = primero;
                    
                        
                    }
                }
            }
        }
    
    
    public boolean adyacente(Object dato){
        Arco actual;
        boolean encontrado;
        encontrado = false;
        actual = primero;
        while(actual != null && !dato.toString().equals(actual.destino.toString())){
            actual = actual.siguiente;
        }
        if (actual != null){
            encontrado = true;
        }
        return encontrado;
    }
          
            
}
