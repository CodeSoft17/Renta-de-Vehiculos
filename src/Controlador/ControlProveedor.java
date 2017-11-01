/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import conexion.Conexion;
import java.util.*;
import java.sql.*;
import modelo.Proveedor;

/**
 *
 * @author Joe
 */
public class ControlProveedor implements OperacionesProveedor{

    @Override
    public String agregarProveedor(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        Proveedor pro = (Proveedor) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `agreagarProveedor` (?,?,?,?,?)}";
            pst = cn.prepareStatement(sql);
            pst.setString(1, pro.getNombre());
            pst.setString(2, pro.getDireccion());
            pst.setString(3, pro.getEmail());
            pst.setString(4, pro.getSitio());
            pst.setInt(5, pro.getTelefono());           
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Proveedor agregado exitosamente";
        }catch(ClassNotFoundException | SQLException e){
            mensaje = e.toString();
        }
        return mensaje;
    }

    @Override
    public String modificarProveedor(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        Proveedor pro = (Proveedor) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `modificarProveedor`(?,?,?,?,?,?)}";
            pst = cn.prepareStatement(sql);
            pst.setInt(1, pro.getIdProveedor());
            pst.setString(2, pro.getNombre());
            pst.setString(3, pro.getDireccion());
            pst.setString(4, pro.getEmail());
            pst.setString(5, pro.getSitio());
            pst.setInt(6, pro.getTelefono());           
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Datos modificados correctamente";
        }catch(Exception e){
            mensaje = e.toString();
        }
        return mensaje;
    }

    @Override
    public String eliminarProveedor(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        Proveedor pro = (Proveedor) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `eliminarProveedor`(?)}";
            pst = cn.prepareStatement(sql);
            pst.setInt(1, pro.getIdProveedor());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Proveedor eliminado correctamente";
        }catch(Exception e){
            mensaje = e.toString();
        }
        return mensaje;
    }

    @Override
    public ArrayList<Object> mostrarProveedor() {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        String sql;
        ArrayList<Object> listaProveedores = new ArrayList<>();
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            st = cn.createStatement();
            sql = "{CALL `mostrarProveedor`()}";
            rs = st.executeQuery(sql);
            while(rs.next()){
                listaProveedores.add(new Proveedor(
                        rs.getInt("idProveedor"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("email"),
                        rs.getString("sitio"),
                        rs.getInt("telefono")
                       
                ));
            }
            rs.close();
            st.close();
            cn.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return listaProveedores;
    }
    
}
