/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;

/**
 *
 * @author Joe
 */
public interface OperacionesCliente {
    
        public String agregarCliente (Object objeto);
        public String modificarCliente (Object objeto);
        public String eliminarCliente (Object objeto);
        public ArrayList <Object> mostrarCliente();
}
