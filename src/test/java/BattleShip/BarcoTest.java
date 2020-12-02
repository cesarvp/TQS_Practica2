package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class BarcoTest {

	@Test
	public void test() {
		
		//Cada metodo testeado siempre le llegan bien los datos de coordenadas y posicion del barco.
		//Comprobado en metodos superiores.
		
		
		Barco bar = new Barco(4,"Prueba");
		
		int med = bar.getMedida(); // la medida del barco esta establezida no la entra el usuario,
		// pero comprobamos que el metodo funciona bien.
		assertEquals(med,4);
		
		String tip = bar.getTipo();// lo mismo pasa con el tipo, ya esta establecido por el juego,
		assertEquals(tip,"Prueba"); // pero lo comprobamos.

		int toc = bar.numeroTocado();  //Inicio barco no esta tocado
		assertEquals(toc,0);
		
		
		bar.agregarCoordenadas(0,1); //Metemos las coordenadas donde esta el barco en el tablero
		
		
		//comprovacion que no se puede entrar la misma coordenada. 
		assertTrue(bar.comprobarCoordenadas(0, 1)==true); 
		//comprovamos una coordenada no entrada. 
		//no haria falta ya que si no hay baco en una coordenada no entrara nuca a mirar que barcos la tienen.
	    assertTrue(bar.comprobarCoordenadas(3, 5)==false);
		
		// suma ++  a tocado al encontrar una coordenada que coninciida con el
		bar.sumarTocado();
		int toc2 = bar.numeroTocado(); 
		assertEquals(toc2,1);
		
		//comprovamos que un barco con un solo toque no esta hundido, ya que es de medida 4.
		assertTrue(bar.estaHundido()==false);
		
		// agregamoos las coordenadas restantes de sus posiciones

		bar.agregarCoordenadas(0,2);
		bar.agregarCoordenadas(0,3);
		bar.agregarCoordenadas(0,4);
		
		//Comprobamos si estan todas las coordenadas
		assertTrue(bar.comprobarCoordenadas(0, 2)==true);
		bar.sumarTocado();
		assertTrue(bar.comprobarCoordenadas(0, 3)==true);
		bar.sumarTocado();
		assertTrue(bar.comprobarCoordenadas(0, 4)==true);
		bar.sumarTocado();

		
		int toc3 = bar.numeroTocado(); 
		System.out.println(toc3);
		assertEquals(toc3,4); // Comprovamos que se ha tocado las 4 coordenadas del barco i sumamos 4 tocados
		
		// Por lo tanto esta hundido
		assertTrue(bar.estaHundido()==true); // por lo tanto esta hundido
		assertTrue(bar.comprobarCoordenadas(0, 4)==false); // volvemos a comprobar una coordenada igual del mismo barco
		assertTrue(bar.estaHundido()==true); // comprovamos que continua hundido
		int toc4 = bar.numeroTocado(); 
		System.out.println(toc4);
		assertEquals(toc4,4); //  No suma mas tocados
		
		bar.agregarCoordenadas(0,5); //error limite de coordenadas ( mostrado por si a caso en pantalla).
		//independiente del numero de las coordenadas, es el hecho de a�adir m�s.
		
		//Pintamos coordenadas entradas del barco
		
		
		bar.pintarCoordenadas();
		
		
		
		
	}

}