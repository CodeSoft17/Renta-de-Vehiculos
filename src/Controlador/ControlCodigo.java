/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import modelo.*;
import conexion.Conexion;
import java.util.*;
import java.sql.*;
/**
 *
 * @author Circus
 */
public class ControlCodigo implements VistaId {
    
    public ControlCodigo (){
    
}

    @Override
    public ArrayList<Object> mostrarClase() {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        String sentencia;
        ArrayList<Object>mostrarClase = new ArrayList<>();
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            st = cn.createStatement();
            sentencia = "{CALL `mostrarClase`()}";
            rs = st.executeQuery(sentencia);
           
            while(rs.next()){
                mostrarClase.add(new Clase (
                   rs.getInt("idClase"),
                   rs.getString("nombre")        
                ));
            }
            rs.close();
            st.close();
            cn.close();
        }catch (Exception e){
            System.out.println(e);
        }
         return mostrarClase;
    }

    @Override
    public ArrayList<Object> mostrarAnio() {
       Conexion con = new Conexion();
       Connection cn;
       Statement st;
       ResultSet rs;
       String sql;
       ArrayList<Object>mostrarAnio = new ArrayList<>();
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            st = cn.createStatement();
            sql = "{CALL `mostrarAnio`()}";
            rs = st.executeQuery(sql);
            while(rs.next()){
                mostrarAnio.add(new Anio (
                  rs.getInt("idAnio"),
                  rs.getInt("Anio")
                        
                ));
            }
            rs.close();
            st.close();
            cn.close();
        }catch (Exception e){
            System.out.println(e);
        }
         return mostrarAnio;
    }

    @Override
    public ArrayList<Object> mostrarMarca() {
       Conexion con = new Conexion();
       Connection cn;
       Statement st;
       ResultSet rs;
       String sql;
       ArrayList<Object>mostrarMarca = new ArrayList<>();
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            st = cn.createStatement();
            sql = "{CALL `mostrarMarca`()}";
            rs = st.executeQuery(sql);
            while(rs.next()){
                mostrarMarca.add(new Marca (
                  rs.getInt("idMarca"),
                  rs.getString("Nombre")                       
                ));
            }
             rs.close();
            st.close();
            cn.close();
        }catch (Exception e){
            System.out.println(e);
        }
         return mostrarMarca;
    }

    @Override
    public ArrayList<Object> mostrarColor() {
       Conexion con = new Conexion();
       Connection cn;
       Statement st;
       ResultSet rs;
       String sql;
       ArrayList<Object>mostrarColor = new ArrayList<>();
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            st = cn.createStatement();
            sql = "{CALL `mostrarColor`()}";
            rs = st.executeQuery(sql);
            while(rs.next()){
                mostrarColor.add(new Color (
                  rs.getInt("idcolor"),
                  rs.getString("nombre")                       
                ));
            }
            rs.close();
            st.close();
            cn.close();
        }catch (Exception e){
            System.out.println(e);
        }
         return mostrarColor;
    }
    
}
