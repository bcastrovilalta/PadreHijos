
package org.amazon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        final NominaAmazonInterface nomina = new NominaAmazon();

        LOGGER.debug("App Amazon");

        LOGGER.debug(nomina.ImprimirNomina());

        LOGGER.debug(nomina.LeerRecibos());

    }

    public App() {
        super();
    }
}
