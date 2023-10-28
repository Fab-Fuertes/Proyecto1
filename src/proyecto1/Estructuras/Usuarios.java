/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Estructuras;

/**
 * Esta clase representa un usuario.
 * @author fabys
 */
public class Usuarios {
    
    private String usuario;
    
    /**
     * Constructor para la clase Usuarios.
     * Inicializa el usuario a null.
     */
    public Usuarios(){
        this.usuario= null;
    }
    
    /**
     * Este método devuelve el nombre de usuario.
     * @return el nombre de usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Este método establece el nombre de usuario.
     * @param usuario el nombre de usuario a establecer.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

