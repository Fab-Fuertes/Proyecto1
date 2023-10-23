package proyecto1.Grafo.Grafico;

import proyecto1.Estructuras.Grafo;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;



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
        System.out.println(grafo.toString());
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
    
   
    public static void main(String[] args) {
        MostrarGrafo grafo = new MostrarGrafo();
        grafo.agregarAristaDirigida("0", "1");
        grafo.agregarAristaDirigida("1", "2");
        grafo.agregarAristaDirigida("2", "3");
        grafo.agregarAristaDirigida("3", "0");
        grafo.mostrarGrafo();
    }
    
    
    
}
