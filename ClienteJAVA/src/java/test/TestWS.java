/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author PC
 */
public class TestWS{
    public static void main (String[] args){
     //crear cliente
        WSOperaciones_Service servicio =new WSOperaciones_Service();
        WSOperaciones cliente = servicio.getWSOperacionesPort();
        
        // utilizar metodos
        //1 login
        if(cliente.login("Pavel", "Paval12020")){
            System.out.println("Credenciales correctas");
        }else{
            System.out.println("Credenciales incorrectas");
        }
        // Procesar Pago
        System.out.println(cliente.procesarPago(5000, 2000));
        
        
    }
}
