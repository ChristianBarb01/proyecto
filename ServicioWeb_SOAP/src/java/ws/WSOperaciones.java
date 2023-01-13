/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ChristianB
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    public static int us = 2;
    public static CrearDatos[] user = new CrearDatos[20];
//crear clase
    public class CrearDatos {
        String NCuenta;
        String Usuario;
        double Saldo;
        String Pass;
    }
//cargar info
    @WebMethod(operationName = "Cargardatos")
    public void Cargardatos() {
        user[1] = new CrearDatos();
        user[1].NCuenta = "101001";
        user[1].Usuario = "christian";
        user[1].Saldo = 7000;
        user[1].Pass = "chris123";
    }
//loguaerse
    @WebMethod(operationName = "LoguinAcceso")
    public boolean LoguinAcceso(String usuario, String password) {
        boolean cond = false;
        for (int i = 1; i < us; i++) {
            if (usuario.equals(user[i].Usuario) && password.equals(user[i].Pass)) {
                cond = true;
                break;
            }
        }
        return cond;
    }
//Registrar Usuario
    @WebMethod(operationName = "Registrar")
    public void Registrar(String usuario, String pass, double saldo, String Ncuenta) {
        user[us] = new CrearDatos();
        user[us].NCuenta = Ncuenta;
        user[us].Usuario = usuario;
        user[us].Saldo = saldo;
        user[us].Pass = pass;
        us++;
    }
//Depositar Dinero
    @WebMethod(operationName = "Depositar")
    public void Depositar(String cuenta, double valor) {
        for (int i = 1; i < us; i++) {
            if (cuenta.equals(user[i].Usuario)) {
                user[i].Saldo = user[i].Saldo + valor;
            }
        }
    }
//Retirar Dinero
    @WebMethod(operationName = "Retirar")
    public void Retirar(String cuenta, double valor) {
        for (int i = 1; i < us; i++) {
            if (cuenta.equals(user[i].Usuario)) {
                user[i].Saldo = user[i].Saldo - valor;
            }
        }
    }

}
