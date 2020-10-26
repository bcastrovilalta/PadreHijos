
package org.amazon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        final NominaAmazonInterface nomina = new NominaAmazon();
        
        String cadena ="";

        LOGGER.debug("App Amazon");

        cadena = nomina.imprimirNominaAmazon();
        
        LOGGER.debug(cadena);
        
        cadena = nomina.leerRecibosAmazon();
        
        LOGGER.debug(cadena);

    }

    public App() {
        super();
    }
}
