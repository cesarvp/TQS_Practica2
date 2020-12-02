package BattleShip;


import org.junit.Test;

public class InicioTest {
	
	@Test
	public void testmenuInicio() 
	{
		Inicio ini = new Inicio();
		
		//MOCK UTILIZADO PARA INCIAR EL JUEGO EN MODO REGLAMENTO Y SALIR
		MockDatosInicio mckI = new MockDatosInicio();
    	
		//OPCION 1 REGLAMENTO Y SALIR, OPCION 2 JUGAR
		mckI.datosMenu(1); 
		ini.tipoDatos(mckI);
		ini.main(null);

		
	}

}
