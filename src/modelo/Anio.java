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
public class Anio {
    private int idAnio;
    private int anio;

    public int getIdAnio() {
        return idAnio;
    }

    public void setIdAnio(int idAnio) {
        this.idAnio = idAnio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Anio(int idAnio, int anio) {
        this.idAnio = idAnio;
        this.anio = anio;
    }

    public Anio() {
    }

    @Override
    public String toString() {
        return "Anio{" + "idAnio=" + idAnio + ", anio=" + anio + '}';
    }
    
    
}
