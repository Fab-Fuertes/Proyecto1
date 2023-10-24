package proyecto1.Grafo.Grafico;

import proyecto1.Estructuras.Grafo;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import proyecto1.Estructuras.NodoGrafo;

public class MostrarGrafo {

    public static Grafo grafo;
    private Graph graph;

    public MostrarGrafo() {
        grafo = new Grafo();
        graph = new SingleGraph("Tutorial");
    }

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

    public void mostrarGrafo() {
        for (Node node : graph) {
            node.setAttribute("ui.label", node.getId());
        }
       
        graph.display();
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        MostrarGrafo.grafo = grafo;
    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }
    
        

    public void mostrarComponentesFuertementeConectados() {
        System.setProperty("org.graphstream.ui", "swing");

        // Implementa el algoritmo de Kosaraju en tu clase Grafo y usa ese método aquí.
        String[][] componentes = grafo.kosaraju();

        // Asigna un color único a cada componente fuertemente conectado.
        String[] colores = {"red", "green", "blue", "yellow", "pink"};
        for (int i = 0; i < componentes.length; i++) {
            for (String nodo : componentes[i]) {
                if (nodo != null) {
                    Node node = graph.getNode(nodo);
                    node.setAttribute("ui.style", "fill-color: " + colores[i % colores.length] + ";");
                }
            }
        }
    }

   

}
