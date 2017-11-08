/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Joe
 */
public class Renta {
    private int idRenta;
    private int idCliente;
    private int idEmpleado;
    private String fecha;
    private String tipoDePago;
    private int idVehiculo;
    private double total;

    public Renta(int idRenta, int idCliente, int idEmpleado, String fecha, String tipoDePago, int idVehiculo, double total) {
        this.idRenta = idRenta;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.tipoDePago = tipoDePago;
        this.idVehiculo = idVehiculo;
        this.total = total;
    }

    public Renta() {
    }

    public int getIdRenta() {
        return idRenta;
    }

    public void setIdRenta(int idRenta) {
        this.idRenta = idRenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Renta{" + "idRenta=" + idRenta + ", idCliente=" + idCliente + ", idEmpleado=" + idEmpleado + ", fecha=" + fecha + ", tipoDePago=" + tipoDePago + ", idVehiculo=" + idVehiculo + ", total=" + total + '}';
    }
      
}
