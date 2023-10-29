package proyecto1.Grafo.Grafico;

import proyecto1.Estructuras.Grafo;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

/**
 * Esta clase se utiliza para mostrar un grafo.
 */
public class MostrarGrafo {

    public static Grafo grafo;
    private Graph graph;

    /**
     * Constructor que inicializa un nuevo grafo y un nuevo objeto Graph de GraphStream.
     */
    public MostrarGrafo() {
        grafo = new Grafo();
        graph = new SingleGraph("Tutorial");
    }

    /**
     * Agrega una arista dirigida entre dos vértices al grafo.
     *
     * @param origen el vértice de origen
     * @param destino el vértice de destino
     */
    public void agregarAristaDirigida(String origen, String destino) {
        if (!grafo.existeVertice(origen)) {
            grafo.nuevoNodo(origen);
            graph.addNode(origen);
        }
        if (!grafo.existeVertice(destino)) {
            grafo.nuevoNodo(destino);
            graph.addNode(destino);
        }

        grafo.NuevoArco(origen, destino);
        graph.addEdge(origen + "-" + destino, origen, destino, true);
    }

    /**
     * Muestra el grafo.
     */
    public void mostrarGrafo() {
        inicializarGrafo();
        graph.display();
    }

    /**
     * Obtiene el grafo.
     *
     * @return el grafo
     */
    public Grafo getGrafo() {
        return grafo;
    }

    /**
     * Establece el grafo.
     *
     * @param grafo el nuevo grafo
     */
    public void setGrafo(Grafo grafo) {
        MostrarGrafo.grafo = grafo;
    }

    /**
     * Obtiene el objeto Graph de GraphStream.
     *
     * @return el objeto Graph
     */
    public Graph getGraph() {
        return graph;
    }

    /**
     * Establece el objeto Graph de GraphStream.
     *
     * @param graph el nuevo objeto Graph
     */
    public void setGraph(Graph graph) {
        this.graph = graph;
    }
    
    public void inicializarGrafo() {
        for (Node node : graph) {
            node.setAttribute("ui.label", node.getId());
            if (node.getId().contains("@")) {
                node.setAttribute("ui.style", "text-size: 15px; text-alignment: under; text-offset: 0px, 3px;");
            }
        }
    }


    /**
     * Muestra los componentes fuertemente conectados del grafo.
     */
    public void mostrarComponentesFuertementeConectados() {
        // Muestra el grafo.
        graph.display();

        inicializarGrafo();
        System.setProperty("org.graphstream.ui", "swing");

        // Implementa el algoritmo de Kosaraju en la clase Grafo y usa el método aquí.
        String[][] componentes = grafo.kosaraju();

        // Asigna un color único a cada componente fuertemente conectado.
        String[] colores = {"red", "green", "blue", "yellow", "pink"};
        for (int i = 0; i < componentes.length; i++) {
            for (String nodo : componentes[i]) {
                if (nodo != null) {
                    Node node = graph.getNode(nodo);
                    if (node != null) { 
                        node.setAttribute("ui.style", "fill-color: " + colores[i % colores.length] + "; size: 15px;");
                        if (nodo.contains("@")) {
                            node.setAttribute("ui.style", "text-size: 15px; text-alignment: under; text-offset: 0px, 2px;");
                        }
                    }
                }
            }
        }
    }

}

