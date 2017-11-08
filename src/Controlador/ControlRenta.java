/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import modelo.Renta;
import conexion.Conexion;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.empleado;
import vista.FrmNuevaRenta;
/**
 *
 * @author jose_
 */
public class ControlRenta implements OperacionesRenta {

    @Override
    public String agregarRenta(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        Renta re = (Renta) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `nuevaRenta` (?,?,?,?,?,?)}";
            pst = cn.prepareStatement(sql);
            pst.setInt(1, re.getIdCliente());
            pst.setString(2, re.getFecha());
            pst.setString(3, re.getTipoDePago());
            pst.setInt(4, re.getIdVehiculo());
            pst.setDouble(5, re.getTotal());
            pst.setInt(6, re.getIdEmpleado());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Renta agregada exitosamente";
        }catch(ClassNotFoundException | SQLException e){
            mensaje = e.toString();
        }
        if(mensaje.equals("Renta agregada exitosamente")){
            try{
                Class.forName(con.getDriver());
                cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
                sql = "{CALL `actualizarCompra` (?,?)}";
                pst = cn.prepareStatement(sql);
                pst.setInt(1, re.getIdVehiculo());
                pst.setString(2, "No Disponible");
                pst.execute();
                pst.close();
                cn.close();
            }catch(ClassNotFoundException | SQLException e){
                System.out.println(e.toString());
            }           
        }
        return mensaje;
    }

    @Override
    public String modificarRenta(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        Renta re = (Renta) objeto;
        try {
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `modificarRenta`(?,?,?,?,?,?,?)}";
            pst = cn.prepareStatement(sql);
            pst.setInt(1, re.getIdRenta());
            pst.setInt(2, re.getIdCliente());
            pst.setInt(3, re.getIdEmpleado());
            pst.setString(4, re.getFecha());
            pst.setString(5, re.getTipoDePago());
            pst.setInt(6, re.getIdVehiculo());
            pst.setDouble(7, re.getTotal());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Datos modificados correctamente";
        } catch (ClassNotFoundException | SQLException e) {
            mensaje = e.toString();
        }
        return mensaje;
    }

    @Override
    public String eliminarRenta(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
        Renta re = (Renta) objeto;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `eliminarRenta`(?)}";
            pst = cn.prepareStatement(sql);
            pst.setInt(1, re.getIdRenta());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Renta eliminada correctamente";
        }catch(ClassNotFoundException | SQLException e){
            mensaje = e.toString();
        }
        return mensaje;
    }

    @Override
    public DefaultTableModel mostrarRenta() {
      Conexion con = new Conexion();
      Connection cn;
      ResultSet rs;
      Object[] obj = new Object[10];
      String[] columnas = {"idRenta", "Nombre Cliente", "idCliente", "Empleado", "idEmpleado", "idVehiculo", "nombre", "fecha", "tipoDePago", "total"};
      DefaultTableModel modelo = new DefaultTableModel(null, columnas);     
      String sql;
      PreparedStatement pst;
      FrmNuevaRenta renta = new FrmNuevaRenta();
      try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "select * from rentaVista";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getString("idRenta");
                obj[1] = rs.getString("Nombre Cliente");
                obj[2] = rs.getString("idCliente");
                obj[3] = rs.getString("Empleado");
                obj[4] = rs.getString("idEmpleado");
                obj[5] = rs.getString("idVehiculo");
                obj[6] = rs.getString("nombre");
                obj[7] = rs.getString("fecha");
                obj[8] = rs.getString("tipoDePago");
                obj[9] = rs.getString("total");
                modelo.addRow(obj);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(renta, e.toString(), "Resultado", JOptionPane.ERROR_MESSAGE);
        }
      return modelo;
    }

    @Override
    public DefaultTableModel mostrarEmpleados() {
      Conexion con = new Conexion();
      Connection cn;
      ResultSet rs;
      Object[] obj = new Object[9];
      String[] columnas = {"idEmpleado", "Nombre", "Telefono"};
      DefaultTableModel modelo = new DefaultTableModel(null, columnas);     
      String sql;
      PreparedStatement pst;
      FrmNuevaRenta renta = new FrmNuevaRenta();
      try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "select idEmpleado, nombre, telefono from empleado";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getInt("idEmpleado");
                obj[1] = rs.getString("Nombre");
                obj[2] = rs.getString("Telefono");
                modelo.addRow(obj);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(renta, e.toString(), "Resultado", JOptionPane.ERROR_MESSAGE);
        }
      return modelo;
    }

    @Override
    public DefaultTableModel mostrarClientes() {
      Conexion con = new Conexion();
      Connection cn;
      ResultSet rs;
      Object[] obj = new Object[9];
      String[] columnas = {"idCliente", "Nombre", "Telefono", "TipoDeCliente"};
      DefaultTableModel modelo = new DefaultTableModel(null, columnas);     
      String sql;
      PreparedStatement pst;
      FrmNuevaRenta renta = new FrmNuevaRenta();
      try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "select idCliente, nombre, telefono, tipoCliente from cliente";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getInt("idCliente");
                obj[1] = rs.getString("Nombre");
                obj[2] = rs.getInt("Telefono");
                obj[3] = rs.getString("tipoCliente");
                modelo.addRow(obj);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(renta, e.toString(), "Resultado", JOptionPane.ERROR_MESSAGE);
        }
      return modelo;
    }

    @Override
    public DefaultTableModel mostrarVehiculos() {
      Conexion con = new Conexion();
      Connection cn;
      ResultSet rs;
      Object[] obj = new Object[9];
      String[] columnas = {"idVehiculo", "Estado", "Color", "Marca", "Modelo", "Clase"};
      DefaultTableModel modelo = new DefaultTableModel(null, columnas);     
      String sql;
      PreparedStatement pst;
      FrmNuevaRenta renta = new FrmNuevaRenta();
      try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "select vehiculo.idVehiculo, vehiculo.estado, color.nombre as \"Color\", marca.nombre as \"Marca\", modelo.nombre as \"Modelo\", "
                    + "clase.nombre as \"Clase\" from vehiculo join color on vehiculo.idColor = color.idColor join marca on vehiculo.idMarca = marca.idMarca "
                    + "join modelo on vehiculo.idModelo = modelo.idModelo join clase on vehiculo.idClase = clase.idClase";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getString("idVehiculo");
                obj[1] = rs.getString("Estado");
                obj[2] = rs.getString("Color");
                obj[3] = rs.getString("Marca");
                obj[4] = rs.getString("Modelo");
                obj[5] = rs.getString("Clase");
                modelo.addRow(obj);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(renta, e.toString(), "Resultado", JOptionPane.ERROR_MESSAGE);
        }
      return modelo;
    }

    @Override
    public DefaultTableModel buscarRenta(String cmb, String busqueda) {
        String[] columnas = {"idRenta", "Nombre Cliente", "idCliente", "Empleado", "idEmpleado", "idVehiculo", "nombre", "tipoDePago", "total"};
        Object[] obj = new Object[9];
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        FrmNuevaRenta renta = new FrmNuevaRenta();
       try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "select * from rentavista where " + cmb + " like '" + busqueda + "%'";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getString("idRenta");
                obj[1] = rs.getString("Nombre Cliente");
                obj[2] = rs.getString("idCliente");
                obj[3] = rs.getString("Empleado");
                obj[4] = rs.getString("idEmpleado");
                obj[5] = rs.getString("idVehiculo");
                obj[6] = rs.getString("nombre");
                obj[7] = rs.getString("tipoDePago");
                obj[8] = rs.getString("total");
                modelo.addRow(obj);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(renta, e.toString(), "Resultado", JOptionPane.ERROR_MESSAGE);
        }
       return modelo;
    }
    
}
