/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv;

import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PC01
 */
@WebService(serviceName = "Funciones_Soap")
public class FuncionesSoap {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String nombre) {
        return "Hello " + nombre + " !";
    }

    /**
     * Web service operation
     */
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Eurodoll")
    public double Eurodoll(@WebParam(name = "valor") double valor) {
        valor = valor * 1.15;
        return valor;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Potencia")
    public double Potencia(@WebParam(name = "valor") double valor, @WebParam(name = "potencia") int potencia) {
        valor = Math.pow(valor, potencia);
        return valor;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "NumPrimo")
    public String NumPrimo(@WebParam(name = "valor") int valor) {
        // Verificamos si es multiplo de 2
        String mensaje = "";
        int contador = 0;

        for (int i = 1; i <= valor; i++) {
            if ((valor % i) == 0) {
                contador++;
            }
        }

        if (contador <= 2) {
            mensaje = "El numero es primo";
        } else {
            mensaje = "El numero no es primo";
        }

        return "respuesta: " + mensaje;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Diccionario")
    public String Diccionario(@WebParam(name = "Palabra") String Palabra) {
        String resp = "";
        Map<String, String> dicc = new HashMap<>();
        dicc.put("java", "lenguaje de programacion");
        dicc.put("pericotear", "Robar algo");
        dicc.put("perilla", "Llave con la que se abre un picaporte");
        dicc.put("soledad", "Circunstancia de estar solo, sin compañía");
        dicc.put("amor", "Sentimiento de afecto y pasión experimentado por una persona hacia otra");
        dicc.put("cariño", "Sentimiento de simpatía, apego, amistad o amor");
        dicc.put("gratitud", "Sentimiento de la persona que agradece un favor recibido");
        dicc.put("síntoma", "Indicio de una cosa que está sucediendo o que va a suceder");
        dicc.put("toxicología", "Parte de la medicina que estudia las sustancias tóxicas o venenos.");
        dicc.put("salud", "Estado en que se encuentra el organismo de un ser vivo en relación al cumplimiento de sus funciones vitales");

        if (Palabra == null || Palabra.matches("[0-9]*")) {
            return "campo vacio o se ingreso un numero";
        } else {
            boolean b = false;
            for (Map.Entry<String, String> entry : dicc.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key.equals(Palabra)) {
                    b = true;
                    resp = value;
                    return resp;
                }
                if (b == false) {
                    return "NO existe";
                }
            }
        }
        return resp;
    }

    /**
     * Web service operation Loguin de Acceso.
     */
    @WebMethod(operationName = "LoguinAcceso")
    public String LoguinAcceso(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        String resp = "";
        Map<String, String> users = new HashMap<>();
        users.put("jenni01", "jenni123");
        users.put("chriss07", "chriss123");
        users.put("tamy22", "tamy123");
        boolean b = false;
        if (usuario == null || password == null) {
            return "Existe un campo vacio";
        } else {

            for (Map.Entry<String, String> entry : users.entrySet()) {
                String user = entry.getKey();
                String pass = entry.getValue();
                if (user.equals(usuario) && pass.equals(password)) {
                    b = true;
                    resp = "Hola " + user + " Bienvenido";
                    return resp;
                }

            }
            if (b == false) {
                return "El usuario o la contraseña no existen";
            }
        }
        return resp;
    }

    /**
     * Web service operation básicas (Suma, Resta, Multiplicación, División).
     */
    @WebMethod(operationName = "Suma")
    public String Suma(@WebParam(name = "valor1") double valor1, @WebParam(name = "valor2") double valor2) {
        String resp = "";
        if (valor1 == 0 || valor2 == 0) {
            return "No se puede realizar la operacion, existe un valor de cero";
        } else {
            double respuesta = valor1 + valor2;
            resp = String.valueOf(respuesta);
            return "Respuesta = " + resp;
        }
    }

    @WebMethod(operationName = "Resta")
    public String Resta(@WebParam(name = "valor1") double valor1, @WebParam(name = "valor2") double valor2) {
        String resp = "";
        if (valor1 == 0 || valor2 == 0) {
            return "No se puede realizar la operacion, existe un valor de cero";
        } else {
            double respuesta = valor1 - valor2;
            resp = String.valueOf(respuesta);
            return "Respuesta = " + resp;
        }
    }

    @WebMethod(operationName = "Multiplicacion")
    public String Multiplicacion(@WebParam(name = "valor1") double valor1, @WebParam(name = "valor2") double valor2) {
        String resp = "";
        if (valor1 == 0 || valor2 == 0) {
            return "No se puede realizar la operacion, existe un valor de cero";
        } else {
            double respuesta = valor1 * valor2;
            resp = String.valueOf(respuesta);
            return "Respuesta = " + resp;
        }
    }

    @WebMethod(operationName = "Division")
    public String Division(@WebParam(name = "valor1") double valor1, @WebParam(name = "valor2") double valor2) {
        String resp = "";
        if (valor1 == 0 || valor2 == 0) {
            return "No se puede realizar la operacion, existe un valor de cero";
        } else {
            double respuesta = valor1 / valor2;
            resp = String.valueOf(respuesta);
            return "Respuesta = " + resp;
        }
    }
//----------------------formulas de Matemática/Física-----------------

    /**
     * Web service operation calcular el movimiento uniforme
     */
    @WebMethod(operationName = "MovimientoUniforme")
    public String MovimientoUniforme(@WebParam(name = "velocidad") double velocidad, @WebParam(name = "tiempo") double tiempo) {
        String resp = "";
        if (velocidad == 0 || tiempo == 0) {
            return "No se puede realizar la operacion, existe un valor de cero";
        } else {
            double distancia = velocidad * tiempo;
            resp = String.valueOf(distancia);
            return resp;
        }
    }

    /**
     * Web service operation calcular la energia cinetica
     */
    @WebMethod(operationName = "EnergiaCinetica")
    public String EnergiaCinetica(@WebParam(name = "masa") double masa, @WebParam(name = "velocidad") double velocidad) {
        String resp = "";
        if (velocidad == 0 || masa == 0) {
            return "No se puede realizar la operacion, existe un valor de cero";
        } else {
            double ec = (masa * 0.5) * (Math.pow(velocidad, 2));
            resp = String.valueOf(ec);
            return resp;
        }
    }

    /**
     * Web service operation Calcular la fuerza
     */
    @WebMethod(operationName = "Calcular_la_Fuerza")
    public String Calcular_la_Fuerza(@WebParam(name = "masa") double masa, @WebParam(name = "acelaracion") double acelaracion) {
        String resp = "";
        if (acelaracion == 0 || masa == 0) {
            return "No se puede realizar la operacion, existe un valor de cero";
        } else {
            double fuerza = masa * acelaracion;
            resp = String.valueOf(fuerza);
            return resp;

        }
    }
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrasena") String Contrasena) {
        if(Usuario.equals("Christian") && Contrasena.equals("Christian123")){
            return true;
        }else{
            return false;
        }
    }
    }
