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
public class Proveedor {
    private int idProveedor ;
    private String Nombre;
    private String Direccion;
    private String email;
    private String sitio;
    private int telefono;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String Nombre, String Direccion, String email, String sitio, int telefono) {
        this.idProveedor = idProveedor;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.email = email;
        this.sitio = sitio;
        this.telefono = telefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", email=" + email + ", sitio=" + sitio + ", telefono=" + telefono + '}';
    }
    
    
    
}
