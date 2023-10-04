/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Grafo.Interfaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author fabys
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    List usuarios = new List();
    
    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addContainerGap(517, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtroArchivo = new FileNameExtensionFilter("txt", "txt");
        seleccionarArchivo.setFileFilter(filtroArchivo);
        int seleccion = seleccionarArchivo.showOpenDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION){
            File Archivo = seleccionarArchivo.getSelectedFile();
            cargarArchivo(Archivo);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cargarArchivo (File Archivo){
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileReader(Archivo);
            br = new BufferedReader(fr);
            
            String linea;
            int relaciones = 0;
            
            while ((linea= br.readLine())!= null){
                Usuarios u = new Usuarios();
                
                String arreglo[] = linea.split(",");
                //String arreglo2[] = linea.split(",");
                if (relaciones ==0){
                    System.out.println(arreglo[0]);
                    u.setUsuario(arreglo[0]);
                    
                    if (linea. equals("relaciones")){
                        relaciones ++;
                    }
                    
                
                }else{
                    System.out.println(arreglo[0] + "," + arreglo[1]);
                    u.setUsuario(arreglo[0]);
                    u.setUsuario(arreglo[1]);
                    
                }
                
                
                usuarios.addEnd(u);
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        finally{
            try{
                if (fr != null){
                    fr.close();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
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
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}