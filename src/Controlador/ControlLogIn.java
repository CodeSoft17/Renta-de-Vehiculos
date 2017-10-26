/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import conexion.Conexion;
import rentadevehiculosnobilis.empleado;
import java.util.*;
import java.sql.*;
/**
 *
 * @author Joe
 */
public class ControlLogIn implements OperacionesLogIn{
    public ControlLogIn(){
    
    }

    @Override
    public String logIn(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String LogIn(Object objeto){
        Conexion con = new Conexion();
        Connection cn;
        Statement statement;
        ResultSet rs;
        String userNameDB = "";
        String passwordDB = "";
        empleado emp = (empleado) objeto;
        String mensaje = "";
        String sql;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            statement = cn.createStatement();
            sql = "select usuario , password from empleado";
            rs = statement.executeQuery(sql);
            while(rs.next()){
                userNameDB = rs.getString("usuario");
                passwordDB = rs.getString("password");
                    if(emp.getUsuario().equals(userNameDB) && emp.getPassword().equals(passwordDB)){
                    mensaje = "Succes"; 
                }
            }
            cn.close();
        }catch(Exception e){
            return e.toString();
        }
        
        return mensaje;
    }
}
