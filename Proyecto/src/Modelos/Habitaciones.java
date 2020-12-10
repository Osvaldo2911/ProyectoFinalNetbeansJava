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
public class Habitaciones {
    private int idHabitacion;
    private int numPersonas;
    private int precio;
    private String tipoHabitacion;

    public Habitaciones(int idHabitacion, int numPersonas, int precio, String tipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.numPersonas = numPersonas;
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    
}
