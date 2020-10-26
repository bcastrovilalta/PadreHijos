
package org.amazon;

import org.estandar.*;

public class NominaAmazon implements NominaAmazonInterface {

    NominaEstandar ne;

    public NominaAmazon() {
        ne = new NominaEstandar();
    }

    public String imprimirNominaAmazon() {
        return ("Imprimiendo Nomina Amazon");
    }

    public String leerRecibosAmazon() {
        return (ne.leerRecibosEstandar());
    }

}
