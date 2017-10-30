/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author Joe
 */
public class Conexion {
    private String driver;
    private String bd;
    private String url;
    private String usuario;
    private String clave;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Conexion() {
        driver = "com.mysql.jdbc.Driver";
        bd = "rentavehiculos";
        url = "jdbc:mysql://localhost:3306/" + bd;
        usuario = "root";
        clave = "";
    }

    public Conexion(String driver, String bd, String url, String usuario, String clave) {
        this.driver = driver;
        this.bd = bd;
        this.url = url + this.bd;
        this.usuario = usuario;
        this.clave = clave;
    }
            
}
