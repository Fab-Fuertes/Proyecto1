package proyecto1.Grafo.Grafico;

import proyecto1.Estructuras.Grafo;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

//Para utilizar org.graphstream.graph.* y org.graphstream.graph.implementations.* en tu proyecto de Java,
//necesitas descargar e instalar la biblioteca GraphStream. Pasos a seguir:
//
//Descarga la biblioteca GraphStream desde su página oficial1 o desde su página de GitHub2. 
//La biblioteca viene con un archivo JAR preempaquetado llamado gs-core.jar3.
//
//Añade el archivo JAR a tu classpath.
//
//Una vez que hayas añadido la biblioteca a tu proyecto, podrás importar y utilizar las clases de GraphStream en 
//tu código.


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

    public static Grafo getGrafo() {
        return grafo;
    }

    public static void setGrafo(Grafo grafo) {
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
