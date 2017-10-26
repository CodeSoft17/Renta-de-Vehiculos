/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Joe
 */
public class Clase {
    private int idClase;
    private String nombre;

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase() {
    }

    public Clase(int idClase, String nombre) {
        this.idClase = idClase;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Clase{" + "idClase=" + idClase + ", nombre=" + nombre + '}';
    }
        
}
