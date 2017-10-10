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
public class empleado {
    private int idEmpleado;
    private String nombre;
    private String sexo;
    private String dui;
    private String direccion;
    private String telefono;
    private String cargo;
    private String usuario;
    private String password;

    public empleado() {
    }

    public empleado(int idEmpleado, String nombre, String sexo, String dui, String direccion, String telefono, String cargo, String usuario, String password) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sexo = sexo;
        this.dui = dui;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", sexo=" + sexo + ", dui=" + dui + ", direccion=" + direccion + ", telefono=" + telefono + ", cargo=" + cargo + ", usuario=" + usuario + ", password=" + password + '}';
    }
    
    
    
}
