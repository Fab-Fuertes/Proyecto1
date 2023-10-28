/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Grafo.Interfaz;

//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto1.Estructuras.Grafo;
import proyecto1.Estructuras.Usuarios;
import proyecto1.Grafo.Grafico.MostrarGrafo;

/**
 * Esta clase InsertarNodo extiende de javax.swing.JFrame y se utiliza para insertar nodos en un grafo.
 */
public class InsertarNodo extends javax.swing.JFrame {

    Grafo grafo = new Grafo();
    public static MostrarGrafo mostrar;
    InterfazPrincipal interfaz;

    /**
     * Constructor de la clase InsertarNodo.
     * @param grafo El objeto GraficoGrafo que se va a mostrar.
     */
    public InsertarNodo(MostrarGrafo grafo) {
        initComponents();
        mostrar = grafo;
        setTitle("Insertar");
        

    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método siempre
     * es regenerado por el Editor de Formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Entrada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextArea();
        NuevoNodo = new javax.swing.JButton();
        NuevoArco = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });

        Salida.setColumns(20);
        Salida.setRows(5);
        jScrollPane1.setViewportView(Salida);

        NuevoNodo.setText("Nuevo Nodo");
        NuevoNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoNodoActionPerformed(evt);
            }
        });

        NuevoArco.setText("Nuevo Arco");
        NuevoArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoArcoActionPerformed(evt);
            }
        });

        jButton3.setText("Atrás");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(NuevoNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(NuevoArco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton3))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NuevoNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NuevoArco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Este método se activa cuando se realiza una acción en el campo de texto Entrada.
    * @param evt El evento de acción.
    */
    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaActionPerformed

    /**
     * Este método se activa cuando se realiza una acción en el botón NuevoArco.
     * Se utiliza para crear un nuevo arco entre dos nodos del grafo.
     * @param evt El evento de acción.
     */
    private void NuevoArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoArcoActionPerformed
        // TODO add your handling code here:

        String origen = "";
        String destino = "";
        origen = JOptionPane.showInputDialog("Origen:");
        destino = JOptionPane.showInputDialog("Destino:");
        String[] relacion = new String[2];
        relacion[0] = origen;
        relacion[1] = destino;
        if (mostrar.getGrafo().existeVertice(origen) && mostrar.getGrafo().existeVertice(destino)) {
            InterfazPrincipal.lista_relaciones.addEnd(relacion);
            mostrar.getGrafo().NuevoArco(origen, destino);
            mostrar.getGraph().addEdge(origen + "-" + destino, origen, destino, true);
        } 
        Salida.setText(MostrarGrafo.grafo.toString());
    }//GEN-LAST:event_NuevoArcoActionPerformed

    /**
     * Este método se activa cuando se realiza una acción en el botón NuevoNodo.
     * Se utiliza para crear un nuevo nodo en el grafo.
     * @param evt El evento de acción.
     */
    private void NuevoNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoNodoActionPerformed
        // TODO add your handling code here:
        String dato = Entrada.getText();
        Usuarios user = new Usuarios();
        user.setUsuario(dato);
        if (!(mostrar.getGrafo().existeVertice(dato))) {
            InterfazPrincipal.lista_usuarios.addEnd(user);
            InterfazPrincipal.lista_adyacencias.nuevaAdyacencia(dato);
            mostrar.getGrafo().nuevoNodo(dato);
            mostrar.getGraph().addNode(dato);
            Salida.setText(mostrar.getGrafo().toString());
            Entrada.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe el usuario!!", "Input", JOptionPane.ERROR_MESSAGE);
        }
        
        

    }//GEN-LAST:event_NuevoNodoActionPerformed

    /**
     * Este método se activa cuando se realiza una acción en el botón jButton3.
     * @param evt El evento de acción.
     */    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        VentanaModificarGrafo a = new VentanaModificarGrafo(mostrar);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Método principal de la clase InsertarNodo. 
     * Crea y muestra una nueva instancia de la clase InsertarNodo.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertarNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarNodo(mostrar).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Entrada;
    private javax.swing.JButton NuevoArco;
    private javax.swing.JButton NuevoNodo;
    private javax.swing.JTextArea Salida;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
