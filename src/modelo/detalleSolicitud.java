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
public class detalleSolicitud {
    private int idDetalleSolicitud;
    private int idSolicitud;
    private String nombreVehiculo;

    public detalleSolicitud() {
    }

    public detalleSolicitud(int idDetalleSolicitud, int idSolicitud, String nombreVehiculo) {
        this.idDetalleSolicitud = idDetalleSolicitud;
        this.idSolicitud = idSolicitud;
        this.nombreVehiculo = nombreVehiculo;
    }

    public int getIdDetalleSolicitud() {
        return idDetalleSolicitud;
    }

    public void setIdDetalleSolicitud(int idDetalleSolicitud) {
        this.idDetalleSolicitud = idDetalleSolicitud;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    @Override
    public String toString() {
        return "detalleSolicitud{" + "idDetalleSolicitud=" + idDetalleSolicitud + ", idSolicitud=" + idSolicitud + ", nombreVehiculo=" + nombreVehiculo + '}';
    }
    
    
}
