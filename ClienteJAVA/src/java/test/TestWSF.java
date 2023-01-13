/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import sv.FuncionesSoap;
import sv.FuncionesSoap_Service;
/**
 *
 * @author ChristianB
 */
public class TestWSF {
        public static void main (String[] args){
     //crear cliente
     
        FuncionesSoap_Service servicio =new sv.FuncionesSoap_Service();
        FuncionesSoap cliente = servicio.getFuncionesSoapPort();
        
        // utilizar metodos
        //1 login
        if(cliente.login("Christian", "Christian124")){
            System.out.println("Credenciales correctas");
        }else{
            System.out.println("Credenciales incorrectas");
        }
        
        
    }
}
