/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1.Grafo.Main;

import proyecto1.Grafo.Grafico.MostrarGrafo;
import proyecto1.Grafo.Interfaz.InterfazPrincipal;

/**
 * Esta es la clase principal que ejecuta la aplicación.
 */
public class Main {

    /**
     * El método principal que se ejecuta al iniciar la aplicación.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Crea un nuevo objeto MostrarGrafo
        MostrarGrafo x = new MostrarGrafo();
        
        // Crea un nuevo objeto InterfazPrincipal y lo hace visible
        InterfazPrincipal objeto = new InterfazPrincipal();
        objeto.setVisible(true);
    }
    
}

