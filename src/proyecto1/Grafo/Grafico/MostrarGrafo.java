/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Grafo.Grafico;


import java.util.ArrayList;

public class GraficoGrafo {
    private int numNodos;
    private ArrayList<ArrayList<Integer>> listaAdyacencia;

    GraficoGrafo(int numNodos) {
        this.numNodos = numNodos;
        listaAdyacencia = new ArrayList<ArrayList<Integer>>(numNodos);
        for (int i = 0; i < numNodos; ++i)
            listaAdyacencia.add(new ArrayList<Integer>());
    }

    public void agregarAristaDirigida(int origen, int destino) {
        listaAdyacencia.get(origen).add(destino);
    }

    public void mostrarGrafo() {
        for (int nodo = 0; nodo < numNodos; ++nodo) {
            System.out.print("Nodo " + nodo + ": ");
            for (Integer destino : listaAdyacencia.get(nodo)) {
                System.out.print(nodo + "->" + destino + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraficoGrafo g = new GraficoGrafo(4);
        g.agregarAristaDirigida(0, 1);
        g.agregarAristaDirigida(1, 2);
        g.agregarAristaDirigida(2, 3);
        g.agregarAristaDirigida(3, 0);
        g.mostrarGrafo();
    }
}

//EXPLICACIÓN DEL CÓDIGO:
//Este código es una implementación de un grafo dirigido utilizando la clase ArrayList.
//
//En la línea 5, se define la clase GraficoGrafo con tres campos: numNodos, que representa el número de 
//nodos en el grafo; listaAdyacencia, que es una lista de adyacencia que almacena las aristas del grafo; 
//y un constructor que inicializa los campos.
//
//En el constructor, se inicializa el campo numNodos con el valor pasado como argumento y se crea una lista
//de adyacencia vacía para cada nodo del grafo.
//
//El método agregarAristaDirigida agrega una arista dirigida desde el nodo origen al nodo destino en la 
//lista de adyacencia correspondiente.
//
//El método mostrarGrafo muestra la lista de adyacencia para cada nodo del grafo. Para cada nodo, se imprime
//su número seguido de una lista de los nodos a los que está conectado.
//
//En el método main, se crea un objeto de la clase GraficoGrafo con 4 nodos. Luego, se agregan cuatro 
//aristas dirigidas al grafo y se llama al método mostrarGrafo para mostrar la lista de adyacencia para 
//cada nodo del grafo.