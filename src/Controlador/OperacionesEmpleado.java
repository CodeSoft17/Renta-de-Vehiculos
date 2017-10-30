/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.*;

/**
 *
 * @author Joe
 */
public interface OperacionesEmpleado {
    
    public String agregarEmpleado(Object objeto);
    
    public String modificarEmpleado(Object objeto);
    
    public String eliminarEmpleado(Object objeto);
    
    public ArrayList<Object> mostrarEmpleado();
    
}
