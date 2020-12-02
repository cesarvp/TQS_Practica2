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
	
	ArrayList<Integer> arrai = new ArrayList<Integer>();
	int count = 0;
	@ParameterizedTest(name = "{index} => a={0}, b={1}")
	@CsvFileSource(resources = "/tablerotest.csv")
	void rellenar(int a, int b) {
		
		arrai.add(a);
		arrai.add(b);

	}
	
	@AfterAll
	@Test
	void test() {
		
		if (count == 0) {
		
			for (int i = 0; i < arrai.size(); i++) {
				
				System.out.print(arrai.get(i));
				System.out.print(" ");
				
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
	    
	    int res = -1;
	    
	    for (int i = 0; i < arrai.size(); i = i + 2) {
	    	
	    	res = t1.valorPosicion(arrai.get(i), arrai.get(i + 1));
	    	
	    	assertEquals(1, res);
			
		}
	    
	    //t1.mostrarTablero();

	    /*int res1 = t1.valorPosicion(1, 1); //Casilla ocupada 1
	    assertEquals(res1,1);
	    
	    int res2 = t1.valorPosicion(5, 6); //Casilla ocupada 2 
	    assertEquals(res2,1);
	    
	    int res3 = t1.valorPosicion(1, 4); //Casilla ocupada 3
	    assertEquals(res3,1);
	    
	    int res4 = t1.valorPosicion(6, 5); //Casilla libre (agua)
	    assertEquals(res4,0);*/
	    


	    
	    
	    
		
		
	}

}
