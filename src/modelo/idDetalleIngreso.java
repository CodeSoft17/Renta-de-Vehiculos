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
public class idDetalleIngreso {
    
        private int idDetalleIngreso;
        private int idVehiculo;
        private double precioCompra;
        private double precioRenta;
        private int idIngreso;

    public idDetalleIngreso() {
    }

    public idDetalleIngreso(int idDetalleIngreso, int idVehiculo, double precioCompra, double precioRenta, int idIngreso) {
        this.idDetalleIngreso = idDetalleIngreso;
        this.idVehiculo = idVehiculo;
        this.precioCompra = precioCompra;
        this.precioRenta = precioRenta;
        this.idIngreso = idIngreso;
    }

    public int getIdDetalleIngreso() {
        return idDetalleIngreso;
    }

    public void setIdDetalleIngreso(int idDetalleIngreso) {
        this.idDetalleIngreso = idDetalleIngreso;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioRenta() {
        return precioRenta;
    }

    public void setPrecioRenta(double precioRenta) {
        this.precioRenta = precioRenta;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    @Override
    public String toString() {
        return "idDetalleIngreso{" + "idDetalleIngreso=" + idDetalleIngreso + ", idVehiculo=" + idVehiculo + ", precioCompra=" + precioCompra + ", precioRenta=" + precioRenta + ", idIngreso=" + idIngreso + '}';
    }
        
    
    
}
