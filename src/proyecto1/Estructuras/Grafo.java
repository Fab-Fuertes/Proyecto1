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
    
    public Grafo(){
        primero = null;
        ultimo= null;
    }
    
    public boolean grafoVacio(){
        return primero == null;
    }
    
    /**
     * 
     * @param dato 
     * @return 
     */
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
    
    /**
     * 
     * @param origen
     * @param destino 
     */
    public void NuevoArco(Object origen, Object destino){
        if(existeVertice(origen) && existeVertice(destino)){
            NodoGrafo posicion = primero;
            while(!posicion.dato.equals(origen.toString())){
                posicion = posicion.siguiente;
            }
            
            posicion.lista.nuevaAdyacencia(destino);
        }
    }
    
  //  public void NuevaArista (Object origen, Object destino, float peso){
    //    if(existeVertice(origen)&& existeVertice(destino)){
        //    NodoGrafo posicion= primero;
      //      while(!posicion.dato.equals(origen.toString())){
     //           posicion = posicion.siguiente;
       //     }
     //       posicion.lista.nuevaAdyacenciaObject(destino, peso);
     //   }
   // }
    
    public void nuevoNodo(Object dato){
        if(!existeVertice(dato)){
            NodoGrafo nodo = new NodoGrafo(dato);
            if(grafoVacio()){
                primero = nodo;
                ultimo = nodo;
            } else{
                if(dato.toString().compareTo(primero.dato.toString())<=0){
                    nodo.siguiente = primero;
                    primero= nodo;
                    
                }else{
                    if(dato.toString().compareTo(ultimo.dato.toString())>=0){
                        ultimo.siguiente = nodo;
                        ultimo = nodo;
                    }else{
                        NodoGrafo temporal = primero;
                        while(dato.toString().compareTo(temporal.dato.toString())<0){
                            temporal = temporal.siguiente;
                        }
                    }
                }
            }
        }
    }
    
    public void eliminarArco(Object origen, Object destino){
        if(this.existeVertice(origen) && this.existeVertice(destino)){
            NodoGrafo posicion = this.primero;
            while(posicion.dato != origen){
                posicion = posicion.siguiente;
                posicion.lista.eliminarAdyacencia(destino);
            }
            
        }
        
    }

    public NodoGrafo getPrimero() {
        return primero;
    }

    public void setPrimero(NodoGrafo primero) {
        this.primero = primero;
    }

    public NodoGrafo getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoGrafo ultimo) {
        this.ultimo = ultimo;
    }
    
    
    public String toString(){
        String cadena = "";
        NodoGrafo temporal = primero;
        while(temporal != null){
            cadena = cadena +temporal.dato.toString()+" -> "+temporal.lista.toString()+"\n";
            temporal= temporal.siguiente;
            
        
        }
        return cadena;
    }
    
    
    
}
