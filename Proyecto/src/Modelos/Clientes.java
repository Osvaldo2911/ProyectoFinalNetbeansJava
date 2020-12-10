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
public class Clientes {
    private int idClientes;
    private String nombre;
    private String apellidoA;
    private String apellidoM;
    private String telefono;
    private String direccion;

    public Clientes(int idClientes, String nombre, String apellidoA, String apellidoM, String telefono, String direccion) {
        this.idClientes = idClientes;
        this.nombre = nombre;
        this.apellidoA = apellidoA;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoA() {
        return apellidoA;
    }

    public void setApellidoA(String apellidoA) {
        this.apellidoA = apellidoA;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
