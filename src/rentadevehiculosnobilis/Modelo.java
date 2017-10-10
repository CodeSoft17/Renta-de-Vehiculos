/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentadevehiculosnobilis;

/**
 *
 * @author Joe
 */
public class Modelo {
    private int idModelo;
    private String nombre;

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Modelo(int idModelo, String nombre) {
        this.idModelo = idModelo;
        this.nombre = nombre;
    }

    public Modelo() {
    }

    @Override
    public String toString() {
        return "Modelo{" + "idModelo=" + idModelo + ", nombre=" + nombre + '}';
    }
    
    
}
