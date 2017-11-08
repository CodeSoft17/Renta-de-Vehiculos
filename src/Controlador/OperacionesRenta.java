/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jose_
 */
public interface OperacionesRenta {
    
   public String agregarRenta (Object objeto);

   public String modificarRenta(Object objeto);
    
   public String eliminarRenta(Object objeto);
    
   public DefaultTableModel mostrarRenta();
   
   public DefaultTableModel mostrarVehiculos();
   
   public DefaultTableModel mostrarEmpleados();
   
   public DefaultTableModel mostrarClientes();
   
   public DefaultTableModel buscarRenta(String cmb, String busqueda);
    
}
