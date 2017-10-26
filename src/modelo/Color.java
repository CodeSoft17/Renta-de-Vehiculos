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
public class Color {
    private int idColor;
    private String nombre;

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color(int idColor, String nombre) {
        this.idColor = idColor;
        this.nombre = nombre;
    }

    public Color() {
    }

    @Override
    public String toString() {
        return "Color{" + "idColor=" + idColor + ", nombre=" + nombre + '}';
    }
    
    
}
