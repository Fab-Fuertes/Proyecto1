/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Grafo.Interfaz;

import javax.swing.JOptionPane;
import proyecto1.Grafo.Grafico.MostrarGrafo;
import proyecto1.Estructuras.Grafo;
import static proyecto1.Grafo.Interfaz.InterfazPrincipal.lista_relaciones;
import static proyecto1.Grafo.Interfaz.InterfazPrincipal.lista_usuarios;

/**
 *
 * @author fabys
 */
public class EliminarNodo extends javax.swing.JFrame {

    /**
     * El objeto grafo.
     */
    Grafo grafo = new Grafo();

    /**
     * El objeto para mostrar el grafo.
     */
    public static MostrarGrafo mostrar;

    /**
     * La interfaz principal del proyecto.
     */
    InterfazPrincipal interfaz;

    /**
     * Constructor para la clase EliminarNodo.
     * @param grafo El grafo del cual se va a eliminar un nodo.
     */
    public EliminarNodo(MostrarGrafo grafo) {
        initComponents();
        mostrar = grafo;
        setTitle("Eliminar");
    }
    
    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método siempre
     * es regenerado por el Editor de Formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Entrada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este método se activa cuando se hace clic en jButton1.
     * Abre una nueva ventana para modificar el grafo.
     *
     * @param evt El evento de acción.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VentanaModificarGrafo a = new VentanaModificarGrafo(mostrar);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Este método se activa cuando se realiza una acción en Entrada.
     *
     * @param evt El evento de acción.
     */
    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaActionPerformed

    /**
     * Este método se activa cuando se hace clic en jButton2.
     * Intenta eliminar un nodo del grafo y actualizar la lista de usuarios y relaciones.
     *
     * @param evt El evento de acción.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
        String dato = Entrada.getText();

       //mostrar.getGrafo().eliminarNodo(dato);
        mostrar.getGraph().removeNode(dato);

        lista_usuarios.deleteValueUser(lista_usuarios, dato);
        for (int count = 0; count < lista_relaciones.getSize(); count++) {
            String[] arreglo = lista_relaciones.GetbyIndex(count);
            if (dato.equals(arreglo[0]) || dato.equals(arreglo[1])) {
                lista_relaciones.deleteValue(arreglo);
            }


        }
        Entrada.setText("");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "USUARIO NO ENCONTRADO!!", "User not found", JOptionPane.ERROR_MESSAGE);
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Método principal para iniciar la aplicación.
     *
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
            java.util.logging.Logger.getLogger(EliminarNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarNodo(mostrar).setVisible(true);
            }
        });
    }
                        
    /**
     * Entrada es un campo de texto donde el usuario puede ingresar datos.
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Entrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
