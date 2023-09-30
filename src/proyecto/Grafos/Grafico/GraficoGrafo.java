package proyecto.Grafos;


import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

public class MostrarGrafo {

    private static final String NOMBRE_GRAFO = "Grafo de usuarios y sus relaciones";
    
    public static void main(String[] args) {

        Graph<String, DefaultEdge> graph = new SimpleGraph<>(DefaultEdge.class);
        
        graph.addVertex("Alice");
        graph.addVertex("Bob");
        graph.addVertex("Carol");
        graph.addVertex("Dave");
        
        graph.addEdge("Alice", "Bob");
        graph.addEdge("Bob", "Carol");
        graph.addEdge("Carol", "Dave");
        graph.addEdge("Dave", "Alice");

        graph.removeVertex("Alice");
        
        System.out.println(NOMBRE_GRAFO + ": " + graph.toString());
    }
}









