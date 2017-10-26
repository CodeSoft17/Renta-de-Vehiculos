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
public class detalleRenta {
    private int idDetalleRenta;
    private int idRenta;
    private double cantidad;
    private int idOferta;
    private int idVehiculo;

    public int getIdDetalleRenta() {
        return idDetalleRenta;
    }

    public int getIdRenta() {
        return idRenta;
    }

    public double getCantidad() {
        return cantidad;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public detalleRenta() {
    }

    public detalleRenta(int idDetalleRenta, int idRenta, double cantidad, int idOferta, int idVehiculo) {
        this.idDetalleRenta = idDetalleRenta;
        this.idRenta = idRenta;
        this.cantidad = cantidad;
        this.idOferta = idOferta;
        this.idVehiculo = idVehiculo;
    }

    @Override
    public String toString() {
        return "detalleRenta{" + "idDetalleRenta=" + idDetalleRenta + ", idRenta=" + idRenta + ", cantidad=" + cantidad + ", idOferta=" + idOferta + ", idVehiculo=" + idVehiculo + '}';
    }
    
    
    
}
