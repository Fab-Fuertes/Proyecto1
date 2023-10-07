package proyecto1.Grafo.Grafico;

import proyecto1.Estructuras.Grafo;

public class MostrarGrafo {
    private int numNodos;
    private MiArrayList<MiArrayList<Integer>> listaAdyacencia;
    private Grafo grafo;

    MostrarGrafo(int numNodos) {
        this.numNodos = numNodos;
        listaAdyacencia = new MiArrayList<MiArrayList<Integer>>();
        for (int i = 0; i < numNodos; ++i)
            listaAdyacencia.add(new MiArrayList<Integer>());
        grafo = new Grafo();
    }

    public void agregarAristaDirigida(int origen, int destino) {
        listaAdyacencia.get(origen).add(destino);
        grafo.NuevoArco(origen, destino);
    }

    public void agregarAristaDirigidaConPeso(int origen, int destino, float peso) {
        listaAdyacencia.get(origen).add(destino);
        grafo.NuevaArista(origen, destino, peso);
    }

    public void mostrarGrafo() {
        for (int nodo = 0; nodo < numNodos; ++nodo) {
        System.out.print("Nodo " + nodo + ": ");
        MiArrayList<Integer> destinos = listaAdyacencia.get(nodo);
        for (int i = 0; i < destinos.size(); ++i) {
            Integer destino = destinos.get(i);
            System.out.print(nodo + "->" + destino + " ");
        }
        System.out.println();
       }
    }
   
    public static void main(String[] args) {
        MostrarGrafo g = new MostrarGrafo(4);
        g.agregarAristaDirigida(0, 1);
        g.agregarAristaDirigida(1, 2);
        g.agregarAristaDirigida(2, 3);
        g.agregarAristaDirigida(3, 0);
        g.mostrarGrafo();
    }
}

//EXPLICACIÓN DEL CÓDIGO:

//1. `package proyecto.Grafos.Grafico;` - Define el paquete en el que se encuentra tu clase.
//2. `import proyecto.Estructuras.Grafo;` - Importa la clase Grafo de otro paquete.
//3. `public class GraficoGrafo {` - Define la clase pública `GraficoGrafo`.
//4. `private int numNodos;` - Declara una variable privada `numNodos` para almacenar el número de nodos en 
//el grafo.
//5. `private MiArrayList<MiArrayList<Integer>> listaAdyacencia;` - Declara una lista de adyacencia para 
//representar el grafo.
//6. `private Grafo grafo;` - Declara una variable privada `grafo` de tipo `Grafo`.
//7. `GraficoGrafo(int numNodos) {...}` - Define el constructor de la clase que inicializa las variables miembro.
//8. `public void agregarAristaDirigida(int origen, int destino) {...}` - Define un método para 
//agregar una arista dirigida al grafo.
//9. `public void agregarAristaDirigidaConPeso(int origen, int destino, float peso) {...}` - Define un método 
//para agregar una arista dirigida con peso al grafo.
//10. `public void mostrarGrafo() {...}` - Define un método para imprimir el grafo en la consola.
//11. `public static void main(String[] args) {...}` - Define el método principal que se ejecuta al iniciar 
//el programa.
