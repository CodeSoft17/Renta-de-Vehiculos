/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.ControlEmpleados;
import modelo.empleado;
import conexion.Conexion;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Joe
 */
public class ControlEmpleados implements OperacionesEmpleado {
    
    public ControlEmpleados(){
    }

    @Override
    public String agregarEmpleado(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        empleado emp = (empleado) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `agregarEmpleado` (?,?,?,?,?,?,?,?)}";
            pst = cn.prepareStatement(sql);
            pst.setString(1, emp.getNombre());
            pst.setString(2, emp.getSexo());
            pst.setString(3, emp.getDui());
            pst.setString(4, emp.getDireccion());
            pst.setString(5, emp.getTelefono());
            pst.setString(6, emp.getCargo());
            pst.setString(7, emp.getUsuario());
            pst.setString(8, emp.getPassword());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Empleado agregado exitosamente";
        }catch(Exception e){
            mensaje = e.toString();
        }
        return mensaje;
    }

    @Override
    public String modificarEmpleado(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        empleado emp = (empleado) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `modificarEmpleado`(?,?,?,?,?,?,?,?,?)}";
            pst = cn.prepareStatement(sql);
            pst.setString(1, emp.getNombre());
            pst.setString(2, emp.getSexo());
            pst.setString(3, emp.getDui());
            pst.setString(4, emp.getDireccion());
            pst.setString(5, emp.getTelefono());
            pst.setString(6, emp.getCargo());
            pst.setString(7, emp.getUsuario());
            pst.setString(8, emp.getPassword());
            pst.setInt(9, emp.getIdEmpleado());
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
    public String eliminarEmpleado(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        empleado emp = (empleado) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `eliminarEmpleado`(?)}";
            pst = cn.prepareStatement(sql);
            pst.setInt(1, emp.getIdEmpleado());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Empleado eliminado correctamente";
        }catch(Exception e){
            mensaje = e.toString();
        }
        return mensaje;
    }

    @Override
    public ArrayList<Object> mostrarEmpleado() {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        String sql;
        ArrayList<Object> listaEmpleados = new ArrayList<>();
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            st = cn.createStatement();
            sql = "{CALL `mostrarEmpleados`()}";
            rs = st.executeQuery(sql);
            while(rs.next()){
                listaEmpleados.add(new empleado(
                        rs.getInt("idEmpleado"),
                        rs.getString("nombre"),
                        rs.getString("sexo"),
                        rs.getString("dui"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("cargo"),
                        rs.getString("usuario"),
                        rs.getString("password")
                ));
            }
            rs.close();
            st.close();
            cn.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return listaEmpleados;
    }
    
    
    
}
