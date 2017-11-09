/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.solicitudVehiculo;

/**
 *
 * @author Circus
 */
public class ControlSolicitud implements OperacionesSolicitud {

    @Override
    public String agregarSolicitud(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        solicitudVehiculo sv = (solicitudVehiculo) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `nuevaSolicitud` (?,?,?,?,?)}";
            pst = cn.prepareStatement(sql);
            pst.setInt(1, sv.getIdSolicitud());
            pst.setInt(2, sv.getIdEmpleado());
            pst.setString(3, sv.getFecha());
            pst.setInt(4, sv.getIdProveedor());
            pst.setInt(5, sv.getIdSolicitud());           
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Nueva Solicitud agregada exitosamente";
        }catch(ClassNotFoundException | SQLException e){
            mensaje = e.toString();
        }
        return mensaje;
    }

    @Override
    public String eliminarSolicud(Object objeto) {
         Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        solicitudVehiculo sv = (solicitudVehiculo) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `eliminarSolicitud` (?)}";
            pst = cn.prepareStatement(sql);
            pst.setInt(1, sv.getIdSolicitud());          
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Solicitud eliminada exitosamente";
        }catch(ClassNotFoundException | SQLException e){
            mensaje = e.toString();
        }
        return mensaje;
    }
    
}
