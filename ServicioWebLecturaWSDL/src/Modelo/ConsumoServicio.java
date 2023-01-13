
package Modelo;

import sv.FuncionesSoap;
import sv.FuncionesSoap_Service;

/**
 *
 * @author ChristianBarbecho
 */
public class ConsumoServicio {
      public static void main(String[] args) {
        FuncionesSoap_Service servicio = new FuncionesSoap_Service();
        FuncionesSoap funciones = servicio.getFuncionesSoapPort();
        System.out.println("Resultado "+funciones.hello("Diego"));
        System.out.println("Resultado "+funciones.eurodolar(12));
        
        //Loguin ( usuario- password)
        System.out.println("Loguin: "+funciones.loguinAcceso("chriss07", "chriss123"));
        //Operaciones basicas
            //Suma
            System.out.println("Resultado suma : "+funciones.suma(10, 3));
            //Resta
            System.out.println("Resultado resta : "+funciones.resta(8, 2));
            //Division
            System.out.println("Resultado division : "+funciones.division(25, 5));
            //Multiplicacion
            System.out.println("Resultado multiplicacion : "+funciones.multiplicacion(20, 2));
        //Formula Matematicas/Fisicas
            //Movimiento Uniforme (velocidad - tiempo)
            System.out.println("Resultado MovimientoUniforme: "+funciones.movimientoUniforme(300, 25));
            //Energia Cinetica (masa - velocidad)
            System.out.println("Resultado EnergiaCinetica : "+funciones.energiaCinetica(30, 2));
            //Calcular la Fuerza ( masa - aceleracion)
            System.out.println("Resultado Fuerza : "+funciones.calcularLaFuerza(100, 15));
    }
}
