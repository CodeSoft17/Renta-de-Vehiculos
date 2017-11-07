/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import modelo.Vehiculo;
import conexion.Conexion;
import java.util.*;
import java.sql.*;
/**
 *
 * @author Circus
 */
public class ControlVehiculo implements OperacionesVehiculo {
    @Override
    public String agregarVehiculo(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sql;
        String mensaje = null;
       Vehiculo veh = (Vehiculo) objeto;
       try{
           Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `insertarVehiculo` (?,?,?,?,?,?,?,?)}";
             pst = cn.prepareStatement(sql);
             pst.setString(1, veh.getPlaca());
             pst.setString(2, veh.getEstado());
             pst.setInt(3, veh.getNota());
             pst.setInt(4, veh.getIdClase());
             pst.setInt(5, veh.getIdanio());
             pst.setInt(6, veh.getIdModelo());
             pst.setInt(7, veh.getIdColor());
             pst.setInt(8, veh.getIdMarca());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Vehiculo agregado exitosamente";
       }catch (Exception e){
            mensaje = e.toString();
       }
        return mensaje;
    }
    
    @Override
    public String modificarVehiculo(Object objeto) {
       Conexion con = new Conexion();
       Connection cn;
       PreparedStatement pst;
       String sql;
       String mensaje = null;
       Vehiculo veh = (Vehiculo) objeto;
       try{
               Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `modificarVehiculo` (?,?,?,?,?,?,?,?,?)}";
             pst = cn.prepareStatement(sql);
             pst.setInt(1, veh.getIdVehiculo());
             pst.setString(2, veh.getPlaca());
             pst.setString(3, veh.getEstado());
             pst.setInt(4, veh.getNota());
             pst.setInt(5, veh.getIdClase());
             pst.setInt(6, veh.getIdanio());
             pst.setInt(7, veh.getIdModelo());
             pst.setInt(8, veh.getIdColor());
             pst.setInt(9, veh.getIdMarca());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Vehiculo modificado exitosamente";
           
       }catch(Exception e){
            mensaje = e.toString();
       }
       return mensaje;
    }
    
    @Override
    public String eliminarVehiculo(Object objeto) {
       Conexion con = new Conexion();
       Connection cn;
       PreparedStatement pst;
       String sql;
       String mensaje = null;
       Vehiculo veh = (Vehiculo) objeto;
       try{
               Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sql = "{CALL `eliminarVehiculo` (?)}";
             pst = cn.prepareStatement(sql);
             pst.setInt(1, veh.getIdVehiculo());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Vehiculo eliminado exitosamente";
           
       }catch(Exception e){
            mensaje = e.toString();
       }
       return mensaje;
    }
    
    @Override
    public ArrayList<Object> mostrarVehiculo() {
      Conexion con = new Conexion();
      Connection cn;
      Statement st;
      ResultSet rs;
      String sentencia; 
      ArrayList<Object>listaVehiculos = new ArrayList<>();
      try{
           Class.forName(con.getDriver());
           cn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getClave());
           st = cn.createStatement();
           sentencia = "{Call mostrarVehiculo()}";
           rs = st.executeQuery(sentencia);
             while(rs.next()){
                listaVehiculos.add(new Vehiculo(
                        rs.getInt("idVehiculo"),
                        rs.getString("placa"),
                        rs.getString("estado"),
                        rs.getInt("nota"),
                        rs.getInt("idClase"),
                        rs.getInt("idanio"),
                        rs.getInt("idModelo"),
                        rs.getInt("idColor"),
                        rs.getInt("idMarca")
                ));
            }
            rs.close();
            st.close();
            cn.close();
      }catch (Exception e){
          System.out.println(e); 
      }
      return listaVehiculos;
    }   

}
