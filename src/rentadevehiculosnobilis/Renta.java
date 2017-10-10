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
public class Renta {
    private int idRenta;
    private int idCliente;
    private int idEmpleado;
    private String fecha;
    private int correlativo;
    private String tipoPago;

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

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Renta(int idRenta, int idCliente, int idEmpleado, String fecha, int correlativo, String tipoPago) {
        this.idRenta = idRenta;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.correlativo = correlativo;
        this.tipoPago = tipoPago;
    }

    public Renta() {
    }

    @Override
    public String toString() {
        return "Renta{" + "idRenta=" + idRenta + ", idCliente=" + idCliente + ", idEmpleado=" + idEmpleado + ", fecha=" + fecha + ", correlativo=" + correlativo + ", tipoPago=" + tipoPago + '}';
    }
    
    
}
