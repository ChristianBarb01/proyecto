
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
        System.out.println("Resultado "+funciones.eurodoll(12));
    }
}
