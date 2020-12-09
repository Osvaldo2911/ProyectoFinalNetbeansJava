/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author osval
 */
public class Usuarios {
    private String NombreUsuario;
    private String Contraseña;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;

    public Usuarios(String NombreUsuario , String Nombre, String ApellidoP, String ApellidoM, String Contraseña) {
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
    }

    public Usuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }
    
    
    
}
