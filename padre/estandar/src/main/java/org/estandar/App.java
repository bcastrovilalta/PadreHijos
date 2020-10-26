
package org.estandar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(final String[] args) {
        final NominaEstandarInterface nomina = new NominaEstandar();

        LOGGER.debug("App Estandar");

        LOGGER.debug(nomina.ImprimirNomina());

        LOGGER.debug(nomina.LeerRecibos());

    }

    public App() {
        super();
    }
}
