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
public class Arco {
    Object destino;
    public Arco siguiente;
    
    public Arco(Object d){  //Contructor que recibe un parámetro y  fija como destino.
        destino = d;
        siguiente = null;
    }
    
}
