/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Circus
 */
public class Oferta {
    
    private int idOferta;
    private String descripcion;
    private double descuento;
    private int porcentaje;
    private String nombre;
    private String tipo;

    public Oferta() {
    }

    public Oferta(int idOferta, String descripcion, double descuento, int porcentaje, String nombre, String tipo) {
        this.idOferta = idOferta;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.porcentaje = porcentaje;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Oferta{" + "idOferta=" + idOferta + ", descripcion=" + descripcion + ", descuento=" + descuento + ", porcentaje=" + porcentaje + ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    
}
