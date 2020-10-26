package org.amazon;

import org.estandar.*;

public class NominaAmazon implements NominaAmazonInterface
{
	NominaEstandar ne;
	
	public NominaAmazon()
	{
		ne = new NominaEstandar();
	}
	
	public String ImprimirNomina()
	{
		return("Imprimiendo Nomina Amazon");
	}
	
	public String LeerRecibos()
	{
		return(ne.LeerRecibos());
	}
	
}