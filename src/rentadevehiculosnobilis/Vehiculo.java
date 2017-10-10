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
public class Vehiculo {
    private String idVehiculo;
    private int placa;
    private String estado;
    private String nota;
    private int idClase;
    private int idanio;
    private int idModelo;
    private int idColor;
    private int idMarca;

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getIdanio() {
        return idanio;
    }

    public void setIdanio(int idanio) {
        this.idanio = idanio;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public Vehiculo(String idVehiculo, int placa, String estado, String nota, int idClase, int idanio, int idModelo, int idColor, int idMarca) {
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.estado = estado;
        this.nota = nota;
        this.idClase = idClase;
        this.idanio = idanio;
        this.idModelo = idModelo;
        this.idColor = idColor;
        this.idMarca = idMarca;
    }

    public Vehiculo() {
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", placa=" + placa + ", estado=" + estado + ", nota=" + nota + ", idClase=" + idClase + ", idanio=" + idanio + ", idModelo=" + idModelo + ", idColor=" + idColor + ", idMarca=" + idMarca + '}';
    }
    
    
}
