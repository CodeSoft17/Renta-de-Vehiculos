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
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        empleado emp = (empleado) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `LogIn`(?,?)}";
            pst = cn.prepareStatement(sql);
            pst.setString(1, emp.getUsuario());
            pst.setString(2, emp.getPassword());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "LogIn Succesfull";
        }catch(Exception e){
            mensaje = e.toString();
        }
        return mensaje;
    }
}
