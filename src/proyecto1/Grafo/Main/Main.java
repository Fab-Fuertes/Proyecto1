/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Grafo.Main;

import proyecto1.Grafo.Grafico.MostrarGrafo;
import proyecto1.Grafo.Interfaz.InterfazPrincipal;

/**
 *
 * @author fabys
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MostrarGrafo x = new MostrarGrafo();
        InterfazPrincipal objeto = new InterfazPrincipal();
        objeto.setVisible(true);
    }
    
}
