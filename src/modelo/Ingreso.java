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
public class Ingreso {
    private int idIngreso;
    private int idEmpleado;
    private int idProveedor;
    private String fecha;
    private int correlativo;

    public Ingreso() {
    }

    public Ingreso(int idIngreso, int idEmpleado, int idProveedor, String fecha, int correlativo) {
        this.idIngreso = idIngreso;
        this.idEmpleado = idEmpleado;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.correlativo = correlativo;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    @Override
    public String toString() {
        return "Ingreso{" + "idIngreso=" + idIngreso + ", idEmpleado=" + idEmpleado + ", idProveedor=" + idProveedor + ", fecha=" + fecha + ", correlativo=" + correlativo + '}';
    }
    
}
