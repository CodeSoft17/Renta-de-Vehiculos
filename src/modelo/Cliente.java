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
    private String dui;
    private String tipoCliente;
    private String nit;
    private String direccion;
    private String telefono;
    private String sexo;

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDui() {
        return dui;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getNit() {
        return nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Cliente(int idCliente, String nombre, String dui, String tipoCliente, String nit, String direccion, String telefono, String sexo) {
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
