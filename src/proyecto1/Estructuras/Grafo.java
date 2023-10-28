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
/**
 * Esta clase representa un grafo.
 */
public class Grafo {

    private NodoGrafo primero;
    private NodoGrafo ultimo;

    /**
     * Construye un grafo vacío.
     */
    public Grafo() {
        primero = null;
        ultimo = null;
    }

    /**
     * Verifica si el grafo está vacío.
     *
     * @return verdadero si el grafo está vacío, falso de lo contrario
     */
    public boolean grafoVacio() {
        return primero == null;
    }

    /**
     * Verifica si existe un vértice en el grafo.
     *
     * @param dato el dato del vértice a verificar
     * @return verdadero si el vértice existe, falso de lo contrario
     */
    public boolean existeVertice(Object dato) {
        boolean existe = false;
        if (!grafoVacio()) {
            NodoGrafo temporal = primero;
            while (temporal != null && !existe) {
                if (temporal.dato.toString().equals(dato.toString())) {
                    existe = true;

                }
                temporal = temporal.siguiente;
            }
        }
        return existe;
    }

    /**
     * Crea un nuevo arco entre dos vértices.
     *
     * @param origen el vértice de origen
     * @param destino el vértice de destino
     */
    public void NuevoArco(Object origen, Object destino) {
        if (existeVertice(origen) && existeVertice(destino)) {
            NodoGrafo posicion = primero;
            while (!posicion.dato.equals(origen.toString())) {
                posicion = posicion.siguiente;
            }

            posicion.lista.nuevaAdyacencia(destino);
        }
    }    

    /**
     * Crea un nuevo nodo en el grafo.
     *
     * @param dato el dato del nuevo nodo
     */
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

    /**
     * Elimina un arco entre dos vértices.
     *
     * @param origen el vértice de origen
     * @param destino el vértice de destino
     */
    public void eliminarArco(Object origen, Object destino) {
        if (this.existeVertice(origen) && this.existeVertice(destino)) {
            NodoGrafo posicion = this.primero;
            while (posicion.dato != origen) {
                posicion = posicion.siguiente;
                posicion.lista.eliminarAdyacencia(destino);
            }

        }

    }
    
    /**
     * Elimina un nodo del grafo.
     *
     * @param verticeEliminar el vértice a eliminar
     */
    public void eliminarNodo(String verticeEliminar){
        if(this.existeVertice(verticeEliminar)){
            NodoGrafo temporal = this.primero;
            while(temporal != null){
                eliminarArco(temporal.dato , verticeEliminar);
                temporal = temporal.siguiente;
                
                if(this.primero == this.ultimo){
                   this.primero= null;
                    this.ultimo= null;
                }else{
                    NodoGrafo pActual = this.primero;
                    NodoGrafo pAnterior = null;
                    while(pActual != null && verticeEliminar.toString().compareTo(pActual.dato.toString())>0){
                        pAnterior= pActual;
                        pActual =pActual.siguiente;
                        if(pActual == this.primero){
                            NodoGrafo nodoEliminar = this.primero;
                            this.primero = this.primero.siguiente;
                            nodoEliminar.siguiente= null;

                    } else {
                        if(pActual == this.ultimo){
                            pAnterior.siguiente = null;
                            this.ultimo = pAnterior;
                        }else{
                            pAnterior.siguiente= pActual.siguiente;
                            pActual.siguiente= null;
                        }
                            
                      }
                    }
                }
            }
        }
    }

    /**
     * Obtiene el primer nodo del grafo.
     *
     * @return el primer nodo
     */
    public NodoGrafo getPrimero() {
        return primero;
    }

    /**
     * Establece el primer nodo del grafo.
     *
     * @param primero el nuevo primer nodo
     */
    public void setPrimero(NodoGrafo primero) {
        this.primero = primero;
    }

    /**
     * Obtiene el último nodo del grafo.
     *
     * @return el último nodo
     */
    public NodoGrafo getUltimo() {
        return ultimo;
    }

    /**
     * Establece el último nodo del grafo.
     *
     * @param ultimo el nuevo último nodo
     */
    public void setUltimo(NodoGrafo ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * Devuelve una representación en cadena del grafo.
     *
     * @return una representación en cadena del grafo
     */
    public String toString() {
        String cadena = "";
        NodoGrafo temporal = primero;
        while (temporal != null) {
            cadena = cadena + temporal.dato.toString() + " -> " + temporal.lista.toString() + "\n";
            temporal = temporal.siguiente;

        }
        return cadena;
    }

    /**
     * Busca un nodo en el grafo.
     *
     * @param dato el dato del nodo a buscar
     * @return el nodo si se encuentra, nulo de lo contrario
     */
    private NodoGrafo buscarNodo(Object dato) {
        NodoGrafo temp = primero;
        while (temp != null) {
            if (temp.dato.equals(dato)) {
                return temp;
            }
            temp = temp.siguiente;
        }
        return null;
    }

    /**
     * Agrega una arista dirigida entre dos vértices.
     *
     * @param origen el vértice de origen
     * @param destino el vértice de destino
     */
    public void agregarAristaDirigida(Object origen, Object destino) {
        NodoGrafo nodoOrigen = buscarNodo(origen);
        if (nodoOrigen != null) {
            nodoOrigen.lista.nuevaAdyacencia(destino);
        }
    }

    /**
     * Verifica si un valor está contenido en un array.
     *
     * @param array el array a verificar
     * @param v el valor a buscar
     * @return verdadero si el valor está en el array, falso de lo contrario
     */
    private boolean contains(String[] array, String v) {
        for (String element : array) {
            if (element != null && element.equals(v)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Implementa el algoritmo de Kosaraju para encontrar componentes fuertemente conectados.
     *
     * @return un array bidimensional con los componentes fuertemente conectados
     */
    public String[][] kosaraju() {
        Stack<NodoGrafo> stack = new Stack<>();
        String[] visited = new String[100]; // Asume un máximo de 100 nodos
        int visitedCount = 0;
        NodoGrafo temp = primero;
        while (temp != null) {
            if (!contains(visited, (String) temp.dato)) {
                visitedCount = dfs(temp, visited, visitedCount, stack);
            }
            temp = temp.siguiente;
        }

        Grafo transposedGraph = getTranspose();

        visited = new String[100];
        visitedCount = 0;
        String[][] stronglyConnectedComponents = new String[100][100]; // Asume un máximo de 100 componentes con 100 nodos cada uno
        int componentCount = 0;
        while (!stack.isEmpty()) {
            NodoGrafo v = stack.pop();
            if (!contains(visited, (String) v.dato)) {
                String[] component = new String[100];
                int nodeCount = 0;
                nodeCount = transposedGraph.dfs(v, visited, visitedCount, component, nodeCount);
                stronglyConnectedComponents[componentCount] = component;
                componentCount++;
            }
        }

        return stronglyConnectedComponents;
    }

    /**
     * Realiza una búsqueda en profundidad en el grafo.
     *
     * @param v el nodo inicial
     * @param visited un array con los nodos visitados
     * @param visitedCount el número de nodos visitados
     * @param stack una pila para almacenar los nodos visitados
     * @return el número de nodos visitados después de realizar la búsqueda en profundidad
     */
    private int dfs(NodoGrafo v, String[] visited, int visitedCount, Stack<NodoGrafo> stack) {
        visited[visitedCount] = (String) v.dato;
        visitedCount++;
        Arco temp = v.lista.primero;
        while (temp != null) {
            NodoGrafo adjNode = buscarNodo(temp.destino);
            if (adjNode != null && !contains(visited, (String) adjNode.dato)) {
                visitedCount = dfs(adjNode, visited, visitedCount, stack);
            }
            temp = temp.siguiente;
        }
        stack.push(v);
        return visitedCount;
    }

    /**
     * Realiza una búsqueda en profundidad en el grafo.
     *
     * @param v el nodo inicial
     * @param visited un array con los nodos visitados
     * @param visitedCount el número de nodos visitados
     * @param component un array para almacenar los nodos del componente actual
     * @param nodeCount el número de nodos en el componente actual
     * @return el número de nodos en el componente después de realizar la búsqueda en profundidad
     */
    private int dfs(NodoGrafo v, String[] visited, int visitedCount, String[] component, int nodeCount) {
        visited[visitedCount] = (String) v.dato;
        visitedCount++;
        component[nodeCount] = (String) v.dato;
        nodeCount++;
        Arco temp = v.lista.primero;
        while (temp != null) {
            NodoGrafo adjNode = buscarNodo(temp.destino);
            if (adjNode != null && !contains(visited, (String) adjNode.dato)) {
                nodeCount = dfs(adjNode, visited, visitedCount, component, nodeCount);
            }
            temp = temp.siguiente;
        }
        return nodeCount;
    }

    /**
     * Obtiene el grafo transpuesto.
     *
     * @return el grafo transpuesto
     */
    private Grafo getTranspose() {
        Grafo g = new Grafo();
        NodoGrafo temp = primero;
        while (temp != null) {
            g.nuevoNodo(temp.dato);
            temp = temp.siguiente;
        }

        temp = primero;
        while (temp != null) {
            Arco arcoTemp = temp.lista.primero;
            while (arcoTemp != null) {
                g.agregarAristaDirigida(arcoTemp.destino, temp.dato);
                arcoTemp = arcoTemp.siguiente;
            }
            temp = temp.siguiente;
        }
        return g; // Devuelve el grafo transpuesto
    }

}