/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import conexion.Conexion;
import modelo.Cliente;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Joe
 */
public class ControlCliente implements OperacionesCliente {
    
    public ControlCliente(){
    }
    
    @Override
    public String agregarCliente(Object objeto) {
       Conexion con = new Conexion();
       Connection cn;
       PreparedStatement pst;
       String sentencia;
       String mensaje = null;
       Cliente cli = (Cliente) objeto;
       try{
           Class.forName(con.getDriver());
           cn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getClave());
           sentencia = "{Call insertarCliente(?,?,?,?,?,?,?,?)}";
           pst= cn.prepareStatement(sentencia);
           pst.setInt(1, cli.getIdCliente());
           pst.setString(2, cli.getNombre());
           pst.setString(3, cli.getDui());
           pst.setString(4, cli.getTipoCliente());
           pst.setString(5, cli.getNit());
           pst.setString(6, cli.getDireccion());
           pst.setString(7, cli.getTelefono());
           pst.setString(8, cli.getSexo());
           pst.execute();
           pst.close();
           cn.close();
           mensaje = "Datos Insertados Correctamente";


       }catch(Exception e){
           mensaje = e.toString();
       }
       return mensaje;
    }
    
    @Override
    public String modificarCliente(Object objeto) {
       Conexion con = new Conexion();
       Connection cn;
       PreparedStatement pst;
       String sentencia;
       String mensaje = null;
       Cliente cli = (Cliente) objeto;
        try{
            cn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getClave());
            sentencia = "{CALL modificarCliente(?,?,?,?,?,?,?)}";
             pst= cn.prepareStatement(sentencia);
           pst.setString(1, cli.getNombre());
           pst.setString(2, cli.getDui());
           pst.setString(3, cli.getTipoCliente());
           pst.setString(4, cli.getNit());
           pst.setString(5, cli.getDireccion());
           pst.setString(6, cli.getTelefono());
           pst.setString(7, cli.getSexo());
           pst.execute();
           pst.close();
           cn.close();
           mensaje = "Datos Modificados Correctamente";

        }catch (Exception e){
            mensaje = e.toString();
        }
        return mensaje;
    }
    
    @Override
    public String eliminarCliente(Object objeto) {
       Conexion con = new Conexion();
       Connection cn;
       PreparedStatement pst;
       String sentencia;
       String mensaje = null;
       Cliente cli = (Cliente) objeto;
         try{
            cn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getClave());
            sentencia = "{CALL eliminarCliente(?)}";
             pst= cn.prepareStatement(sentencia);
           pst.setInt(1, cli.getIdCliente());
           pst.execute();
           pst.close();
           cn.close();
           mensaje = "Datos Eliminados Correctamente";

        }catch (Exception e){
            mensaje = e.toString();
        }
        return mensaje;
    }
  
         
   @Override
    public ArrayList<Object> mostrarCliente() {
      Conexion con = new Conexion();
      Connection cn;
      Statement st;
      ResultSet rs;
      String sentencia; 
      ArrayList<Object>listaClientes = new ArrayList<>();
       try{
           Class.forName(con.getDriver());
           cn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getClave());
           st = cn.createStatement();
           sentencia = "{Call `mostrarClientes`()}";
           rs = st.executeQuery(sentencia);
           while(rs.next()){
               listaClientes.add(new Cliente(
                rs.getInt("idCliente"),
                rs.getString("Nombre"),
                rs.getString("dui"),
                rs.getString("tipoCliente"),
                rs.getString("nit"),
                rs.getString("direccion"),
                rs.getString("telefono"),
                rs.getString("sexo")
               ));
           }
           rs.close();
           st.close();
           cn.close();
       }catch (Exception e){
           System.out.println(e);
       }
       return listaClientes;

    } 
    
}

