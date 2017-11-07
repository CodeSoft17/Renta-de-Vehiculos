/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;

/**
 *
 * @author Circus
 */
public interface OperacionesVehiculo {
   public String agregarVehiculo (Object objeto);

   public String modificarVehiculo(Object objeto);
    
   public String eliminarVehiculo(Object objeto);
    
   public ArrayList<Object>mostrarVehiculo();
    
}
