package BattleShip;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
@TestInstance(value = Lifecycle.PER_CLASS)
class TableroTestParametrizado {
	
	ArrayList<Integer> barco = new ArrayList<Integer>();
	ArrayList<Integer> agua = new ArrayList<Integer>();
	int count = 0;
	@ParameterizedTest(name = "{index} => a={0}, b={1}, c={2}, d={3}")
	@CsvFileSource(resources = "/barco.csv")

	void rellenar(int a, int b, int c, int d) {
		
		barco.add(a);
		barco.add(b);
		agua.add(c);
		agua.add(d);


	}
	
	@AfterAll
	//@Test
	void test() {
		
		if (count == 0) {
			
			int line = 0;
		System.out.println("valores de barcos");
			for (int i = 0; i < barco.size(); i++) {
				
				System.out.print(barco.get(i));
				System.out.print(" ");
				
				line++;
				if (line == 2) {
					System.out.println();
					line = 0;
				}
			}
		System.out.println("Valores de agua");
			for (int i = 0; i < agua.size(); i++) {
				
				System.out.print(agua.get(i));
				System.out.print(" ");
				
				line++;
				if (line == 2) {
					System.out.println();
					line = 0;
				}
			}
			
			
		
		}
		count++;

	}
	
	@Test
	public void testValorPsoicion()  // En este metodo nunca habra valores erroneos de X, e Y, se comprueban anteriormente.
									//Solo se comprueba la casilla introducida por el usuario al colocar el barco
	{
		
		Tablero t1 = new Tablero(8);
		Barco b = new Barco(4,"prueba");
		
		t1.llenarTableroAgua();
		//Agregamos 3 barcos de diferentes medidas
		t1.addBarco(1,0,"V",4,b); //1
	    t1.addBarco(5, 6, "H", 3,b); // 2
	    t1.addBarco(1, 4, "H", 4,b); //3
	    
	    t1.mostrarTablero();
	    
	    
	    
	    for (int j = 0; j < 4; j = j + 2) {
			b.agregarCoordenadas(barco.get(j), barco.get(j + 1));
			assertEquals(true, b.comprobarCoordenadas(barco.get(j), barco.get(j + 1)));
		}
	    /*
	    for (int k = 0; k < 4; k = k + 2) {
	    	assertEquals(false, b.comprobarCoordenadas(barco.get(k), barco.get(k + 1)));
		}
	    */
	    
	    for (int i = 0; i < barco.size(); i = i + 2) {
	    	
	    	assertEquals(1, t1.valorPosicion(barco.get(i), barco.get(i + 1)));
	    	assertTrue(t1.comprobarTirada(barco.get(i), barco.get(i + 1)));
	    	assertEquals(0, t1.valorPosicion(agua.get(i), agua.get(i + 1)));
	    	assertFalse(t1.comprobarTirada(agua.get(i), agua.get(i + 1)));
	    	
	    	
	    	assertEquals(false, b.comprobarCoordenadas(agua.get(i), agua.get(i + 1)));
	    	
			
		}
		
	}

}
