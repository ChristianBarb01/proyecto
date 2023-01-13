
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
     * Web service operation conversion de euro a dolar
     */
    @WebMethod(operationName = "Eurodolar")
    public double Eurodoll(@WebParam(name = "valor") double valor) {
        valor = valor * 1.15;
        return valor;
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

    }
