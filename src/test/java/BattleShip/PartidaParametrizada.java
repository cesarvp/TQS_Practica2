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
class PartidaParametrizada {

	ArrayList<Integer> barcoj1 = new ArrayList<Integer>();
	
	ArrayList<Integer> barcoj2 = new ArrayList<Integer>();
	
	ArrayList<Integer> disparoj1 = new ArrayList<Integer>();
	
	ArrayList<Integer> disparoj2 = new ArrayList<Integer>();
	
	int count = 0;
	@ParameterizedTest(name = "{index} => a={0}, b={1}, c={2}, d={3}, e={4} , f={5}, g={6} , h={7}, i={8} , j={9} ")
	@CsvFileSource(resources = "/partida1.csv")
	
	void rellenar(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
		
		barcoj1.add(a);
		barcoj1.add(b);
		barcoj1.add(c);
		
		barcoj2.add(d);
		barcoj2.add(e);
		barcoj2.add(f);
		
		disparoj1.add(g);
		disparoj1.add(h);
		
		disparoj2.add(i);
		disparoj2.add(j);
		
		
	}
	

	//@Test
	void datos() {
		
		if (count == 0) {
			
			int line = 0;
		System.out.println("valores barcoj1");
			for (int i = 0; i < 24; i++) {
				
				System.out.print(barcoj1.get(i));
				System.out.print(" ");
				
				line++;
				if (line == 3) {
					System.out.println();
					line = 0;
				}
				

			}
			
			System.out.println("valores barcoj2");
			for (int j = 0; j < 24; j++) {
				
				System.out.print(barcoj2.get(j));
				System.out.print(" ");
				
				line++;
				if (line == 3) {
					System.out.println();
					line = 0;
				}
				

			}
			System.out.println("Disparos J1");
			for (int k = 0; k < disparoj1.size(); k = k + 2) {
				
				System.out.print(disparoj1.get(k));
				System.out.print(disparoj1.get(k + 1));
				System.out.println();
				
			}
			
			System.out.println("Disparos J2");
			for (int k = 0; k < disparoj2.size(); k = k + 2) {
				
				System.out.print(disparoj2.get(k));
				System.out.print(disparoj2.get(k + 1));
				System.out.println();
				
			}
			
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	void partida1() {
	    Juego juego = new Juego();
    	Jugador j1 = new Jugador("j1");
    	Jugador j2 = new Jugador("j2");
    	
       	Inicio ini = new Inicio();
		MockDatosInicio mckI = new MockDatosInicio();
		
		mckI.datosMenu(1); 
		ini.tipoDatos(mckI);
		ini.main(null);
		
    	MockDatosJugar mck = new MockDatosJugar();
    	
    	
    	//mck.entradasTeclado(partida1.get(1)); //Entrada de barco del usuario (j1)
    	
    	/*
    	 * Introducir barcos del Jugador1 de forma parametrizada
    	 */
    	ArrayList<Integer> x1 = new ArrayList<>();
    	ArrayList<Integer> y1 = new ArrayList<>();
    	ArrayList<String> p1 = new ArrayList<>();
    	
    	
    	for (int i = 0; i < 24; i = i + 3) {
			x1.add(barcoj1.get(i));
			y1.add(barcoj1.get(i + 1));
			if (barcoj1.get(i + 2) == 1) {
				p1.add("V");
			}else {
				p1.add("H");
			}
			
			
		}
    	
    	mck.setCoordX(x1);
    	mck.setCoordY(y1);
    	mck.setPosi(p1);
    	
    	System.out.println("X1");
    	System.out.println(mck.getCoordX());
    	System.out.println("Y1");
    	System.out.println(mck.getCoordY());
    	System.out.println("P1");
    	System.out.println(mck.getPosi());
    	
    	juego.tipoEntradaDatos(mck);
    	juego.colocarBarcos();
    	
    	/*
    	 * Introducir las posiciones que el Jugador1 usara para disparar
    	 */
    	ArrayList<Integer> dx1 = new ArrayList<>();
    	ArrayList<Integer> dy1 = new ArrayList<>();
    	for (int k = 0; k < disparoj1.size(); k = k + 2) {
			dx1.add(disparoj1.get(k));
			dy1.add(disparoj1.get(k + 1));
		}
    	
    	mck.setCoordDisparoX(dx1);
    	mck.setCoordDisparoY(dy1);
    	
    	System.out.println("dx1");
    	System.out.println(mck.getCoordDisparoX());
    	System.out.println("dy1");
    	System.out.println(mck.getCoordDisparoY());
    	
    	juego.jugar(j1);
    	
    	int hun= j1.numeroHundidos();
    	int toc =j1.numeroTocados();
    	assertEquals(hun,4);
    	assertEquals(toc,9);
    	
    	/*
    	 * Turno del jugador 2
    	 */
        juego.resetTablerosYBarcos();
        
    	/*
    	 * Introducir barcos del Jugador2 de forma parametrizada
    	 */
        
        
    	
    	ArrayList<Integer> x2 = new ArrayList<>();
    	ArrayList<Integer> y2 = new ArrayList<>();
    	ArrayList<String> p2 = new ArrayList<>();
    	
    	
    	for (int i = 0; i < 24; i = i + 3) {
			x1.add(barcoj2.get(i));
			y1.add(barcoj2.get(i + 1));
			if (barcoj2.get(i + 2) == 1) {
				p1.add("V");
			}else {
				p1.add("H");
			}
			
			
		}
    	
    	mck.setCoordX(x1);
    	mck.setCoordY(y1);
    	mck.setPosi(p1);
    	/*
    	System.out.println("X2");
    	System.out.println(mck.getCoordX());
    	System.out.println("Y2");
    	System.out.println(mck.getCoordY());
    	System.out.println("P2");
    	System.out.println(mck.getPosi());
    	*/
    	juego.tipoEntradaDatos(mck);
    	juego.colocarBarcos();
    	
    	
    	/*
    	 * Introducir las posiciones que el Jugador2 usara para disparar
    	 */
    	
    	ArrayList<Integer> dx2 = new ArrayList<>();
    	ArrayList<Integer> dy2 = new ArrayList<>();
    	for (int k = 0; k < disparoj2.size(); k = k + 2) {
			dx1.add(disparoj2.get(k));
			dy1.add(disparoj2.get(k + 1));
		}
    	
    	mck.setCoordDisparoX(dx1);
    	mck.setCoordDisparoY(dy1);
    	/*
    	System.out.println("dx2");
    	System.out.println(mck.getCoordDisparoX());
    	System.out.println("dy2");
    	System.out.println(mck.getCoordDisparoY());
    	*/
    	juego.jugar(j2);
    	
    	int hun2= j2.numeroHundidos();
    	int toc2=j2.numeroTocados();
    	assertEquals(hun2,4);
    	assertEquals(toc2,10);
    	
    	juego.determinarGanador(j1, j2);
        
    	
	}
	
	
	


}


