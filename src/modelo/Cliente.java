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
public class Cliente {
    private int idCliente;
    private String nombre;
    private int dui;
    private String tipoCliente;
    private int nit;
    private String direccion;
    private int telefono;
    private String sexo;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Cliente(int idCliente, String nombre, int dui, String tipoCliente, int nit, String direccion, int telefono, String sexo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.dui = dui;
        this.tipoCliente = tipoCliente;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", dui=" + dui + ", tipoCliente=" + tipoCliente + ", nit=" + nit + ", direccion=" + direccion + ", telefono=" + telefono + ", sexo=" + sexo + '}';
    }
    
    
}
