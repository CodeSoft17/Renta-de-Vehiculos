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
public class solicitudVehiculo {
    private int idSolicitud;
    private int idEmpleado;
    private String fecha;
    private int correlativo;
    private int idProveedor;

    public solicitudVehiculo() {
    }

    public solicitudVehiculo(int idSolicitud, int idEmpleado, String fecha, int correlativo, int idProveedor) {
        this.idSolicitud = idSolicitud;
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.correlativo = correlativo;
        this.idProveedor = idProveedor;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
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

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "solicitudVehiculo{" + "idSolicitud=" + idSolicitud + ", idEmpleado=" + idEmpleado + ", fecha=" + fecha + ", correlativo=" + correlativo + ", idProveedor=" + idProveedor + '}';
    }
    
    
    
}
