
package org.estandar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    
    public static void lanzaExcepcion() throws Exception {
        throw new Exception("Se rompio todo");
      }

    //public static void main(final String[] args) throws Exception {
    //public static String main(String[] args) {
    //static void main (StringBuffer[] args) throws Exception {
    public static void main (String[] args) throws Exception {
        
        String cadena ="";
       
        /*
        final NominaEstandarInterface nomina = new NominaEstandar();
        
        String cadena ="";

        LOGGER.debug("App Estandar");

        cadena = nomina.imprimirNominaEstandar();
        
        LOGGER.debug(cadena);
        
        cadena = nomina.leerRecibosEstandar();
        
        LOGGER.debug(cadena);
        */
        
        //System.out.println("long: " + args.length);
        /*
        for( int i=0; i < args.length; i++ )
        {
            cadena = args[i].toString();
            LOGGER.debug( cadena );
            System.out.println(cadena);
        }
        
        args[5].append("jarana");
        args[6].append("palique");
        args[7].insert(0, "kokoyero");
        
        for( int i=0; i < args.length; i++ )
        {
            cadena = args[i].toString();
            LOGGER.debug( cadena );
            System.out.println(cadena);
        }        
        */        
        lanzaExcepcion();
        
        LOGGER.debug("App Estandar");
        
        final NominaEstandarInterface nomina = new NominaEstandar();
        
        System.out.println( "Maradona no es una.." );
        //System.out.println( intermedio());
        
        cadena = nomina.imprimirNominaEstandar();
            
        LOGGER.info("cadena: {}",cadena);      
        
        //return("devolvemos : " + cadena);
        
    }
    
    public static String intermedio() {
        NominaEstandarInterface nomina = new NominaEstandar();
        String cadena = nomina.imprimirNominaEstandar();
        //String cadena = "Lombriz";
        return(cadena);
    }

    public App() {
        super();
    }
}
