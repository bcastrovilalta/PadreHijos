
package org.estandar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(final String[] args) {
        final NominaEstandarInterface nomina = new NominaEstandar();
        
        String cadena ="";

        LOGGER.debug("App Estandar");

        cadena = nomina.imprimirNominaEstandar();
        
        LOGGER.debug(cadena);
        
        cadena = nomina.leerRecibosEstandar();
        
        LOGGER.debug(cadena);

    }

    public App() {
        super();
    }
}
