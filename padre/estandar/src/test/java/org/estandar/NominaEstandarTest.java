package org.estandar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NominaEstandarTest {

    String cadena;
    NominaEstandar nomina;
    
    public NominaEstandarTest() {
        super();
    }
    
    @BeforeEach
    void setUp() throws Exception {
        nomina = new NominaEstandar();
    }

    @AfterEach
    void tearDown() throws Exception {
        nomina = null;
    }

    @Test
    void testImprimirNominaEstandar() throws Exception {                       
        cadena = nomina.imprimirNominaEstandar();        
        assertEquals("Imprimiendo Nomina estandar",cadena);
    }

    @Test
    void testLeerRecibosEstandar() throws Exception { 
        cadena = nomina.leerRecibosEstandar();        
        assertEquals("Leyendo recibos estandar",cadena);
    }

}
