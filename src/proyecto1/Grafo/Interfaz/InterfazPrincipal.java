/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Grafo.Interfaz;

import proyecto1.Estructuras.Usuarios;
import proyecto1.Estructuras.List;
import proyecto1.Grafo.Grafico.MostrarGrafo;
import proyecto1.Estructuras.ListaAdyacencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Esta clase InterfazPrincipal extiende de javax.swing.JFrame y se utiliza para interactuar con el usuario.
 */
public class InterfazPrincipal extends javax.swing.JFrame {
    // Variables de clase
    public static List<Usuarios> lista_usuarios = new List();
    public static ListaAdyacencia lista_adyacencias = new ListaAdyacencia();
    MostrarGrafo grafo;
    public static List<String[]> lista_relaciones = new List<String[]>();
    public static File archivo;

    /**
     * Constructor de la clase InterfazPrincipal.
     * Inicializa los componentes de la interfaz y establece el título de la ventana.
     */
    public InterfazPrincipal() {
        initComponents();
        setTitle("Menu");

        System.setProperty("org.graphstream.ui", "swing");
        grafo = new MostrarGrafo(); // Inicializa la instancia de GraficoGrafo con 5 nodos

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
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        GuadarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar Grafo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar Grafo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("      Bienvenido");

        jButton3.setText("Ver componentes  ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GuadarCambios.setText("Guardar Cambios");
        GuadarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuadarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(GuadarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GuadarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este método se activa cuando se realiza una acción en el botón jButton1.
     * Se utiliza para cargar un archivo seleccionado por el usuario.
     * @param evt El evento de acción.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtroArchivo = new FileNameExtensionFilter("txt", "txt");
        seleccionarArchivo.setFileFilter(filtroArchivo);
        int seleccion = seleccionarArchivo.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File Archivo = seleccionarArchivo.getSelectedFile();
            archivo = Archivo;
            cargarArchivo(Archivo);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Este método se activa cuando se realiza una acción en el botón jButton2.
     * Se utiliza para mostrar el grafo si hay un archivo apto cargado.
     * @param evt El evento de acción.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (this.ArchivoApto(archivo) == true) {

            grafo.mostrarGrafo(); // Llama al método mostrarGrafo() cuando se presiona el botón

        } else {
            JOptionPane.showMessageDialog(null, "Ningun Archivo detectado!!", "WARNING", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Este método se activa cuando se realiza una acción en el botón jButton4.
     * Se utiliza para abrir la ventana de modificación del grafo.
     * @param evt El evento de acción.
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        VentanaModificarGrafo a = new VentanaModificarGrafo(grafo);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Este método se activa cuando se realiza una acción en el botón jButton3.
     * Se utiliza para mostrar los componentes fuertemente conectados del grafo si hay un archivo apto cargado.
     * @param evt El evento de acción.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (this.ArchivoApto(archivo) == true) {

            grafo.mostrarComponentesFuertementeConectados();

        } else {
            JOptionPane.showMessageDialog(null, "Ningun Archivo detectado!!", "WARNING", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Este método se activa cuando se realiza una acción en el botón GuadarCambios.
     * Se utiliza para guardar los cambios realizados en el grafo en el archivo cargado.
     * @param evt El evento de acción.
     */
    
    private void GuadarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuadarCambiosActionPerformed
        
        if (this.archivo == null) {
            System.out.println("El archivo no ha sido inicializado");
            return;
        }
        
        try (PrintWriter writer = new PrintWriter(this.archivo)) {
            writer.println("usuarios");

            for (int count = 0; count < lista_usuarios.getSize(); count++) {
                System.out.println(lista_usuarios.GetbyIndex(count).getUsuario());
                writer.println(lista_usuarios.GetbyIndex(count).getUsuario());
            }

            writer.println("relaciones");

            for (int count = 0; count < lista_relaciones.getSize(); count++) {
                System.out.println(lista_relaciones.GetbyIndex(count)[0] + ", " + lista_relaciones.GetbyIndex(count)[1]);
                writer.println(lista_relaciones.GetbyIndex(count)[0] + ", " + lista_relaciones.GetbyIndex(count)[1].replaceAll(" ",""));

            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo");
            e.printStackTrace();
        }

    }//GEN-LAST:event_GuadarCambiosActionPerformed

    /**
     * Este método carga un archivo y lee su contenido línea por línea.
     * Cada línea se divide en un arreglo y se procesa de acuerdo a las condiciones establecidas.
     * @param Archivo El archivo que se va a cargar.
     */
    public void cargarArchivo(File Archivo) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(Archivo);
            br = new BufferedReader(fr);

            String linea;
            int relaciones = 0;

            while ((linea = br.readLine()) != null) {
                Usuarios u = new Usuarios();

                String arreglo[] = linea.split(",");

                //String arreglo2[] = linea.split(",");
                if (relaciones == 0) {

                    if (!linea.equals("usuarios") && !linea.equals("relaciones")) {
                        lista_adyacencias.nuevaAdyacencia(u);
                        lista_usuarios.addEnd(u);
                        u.setUsuario(linea);
                        grafo.getGraph().addNode(linea);
                        grafo.getGrafo().nuevoNodo(linea);
                    }
                    if (linea.equals("relaciones")) {
                        relaciones++;
                    }

                } else {

                    lista_relaciones.addEnd(arreglo);
                    String origen = arreglo[0];
                    String destino = arreglo[1].replaceAll(" ", "");

                    grafo.getGrafo().NuevoArco(origen, destino);
                    grafo.getGraph().addEdge(origen + "-" + destino, origen, destino, true);

                }

            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

        }
        System.out.println("HECHO!!");
        for (int cont = 0; cont < lista_usuarios.getSize();cont++) {
           System.out.println(lista_usuarios.GetbyIndex(cont).getUsuario());
       }
        int contador = 0;
        while (contador < lista_relaciones.getSize()) {
            System.out.println(lista_relaciones.GetbyIndex(contador)[0] + "," + lista_relaciones.GetbyIndex(contador)[1]);
            contador++;
        }

    }

    /**
     * Este método verifica si el archivo dado es apto para ser procesado.
     * @param Archivo El archivo que se va a verificar.
     * @return Verdadero si el archivo es apto, falso en caso contrario.
     */
    public boolean ArchivoApto(File Archivo) {
        if (Archivo != null) {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(Archivo);
                br = new BufferedReader(fr);
                String linea;

                if (!(linea = br.readLine()).equals("usuarios")) {

                    return false;

                }

            } catch (Exception e) {
                e.printStackTrace();

            } finally {
                try {
                    if (fr != null) {
                        fr.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Método principal de la aplicación.
     * @param args Argumentos de la línea de comandos.
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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuadarCambios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
