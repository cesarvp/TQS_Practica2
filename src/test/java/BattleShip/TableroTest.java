package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableroTest {
	Tablero t1 = new Tablero(8);
	Barco b = new Barco(4,"prueba");
	@Test
	public void testConstructor() {
		assertTrue(t1.getSize()== 8);
		assertFalse(t1.getSize()==12); 	
	}

	@Test
	public void testComprobarTablero(){
		assertTrue(t1.comprobarTablero()==true); 
	}

	
	@Test
	public void testAddBarco(){

		// TRUE (barcos bien colocados)
		assertTrue(t1.addBarco(0,0,"V",4,b)==true); //Valor minimo de frontera de X e Y
		t1.mostrarTablero();
		assertTrue(t1.addBarco(1, 1 , "H", 4,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(5, 6, "H", 3,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 5, "V", 3,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(4, 3, "H", 2,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(6, 0, "V", 2,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(0, 7, "H", 1,b)==true); //Barco en casilla Y de valor forntera
		t1.mostrarTablero();
		assertTrue(t1.addBarco(7, 7, "V", 1,b)==true); //Barco en valor frontera de X e Y maximo
		t1.mostrarTablero();
		
		
		//FALSE
		//Comprobaciones varias: 
		//1-Alguna casilla Horizontal(no Ok) encima de alguna horizontal(ok),
		//2-Alguna casilla vertical(no ok) encima de alguna casilla vertical(ok),
		//3-Primera casilla encima de casilla ocupada.
		//4-Primera casilla fuera de tablero.
		//5-Casillas de una sola pieza encima de casillas ocupadas i fuera tableo.
		//6-Numeros de casilla negativos, o superiores a medida de tablero
		
		
		
		t1.llenarTableroAgua();// Reiniciar tablero. LLeno de Agua ( se comprueba este metodo al pintarlo ) y a la vez se comprueba el metodo
		//MostrarTablero
		t1.mostrarTablero();
		
		
		//Particiones equivalentes de valores tanto positivos como negativos
		t1.mostrarTablero();
		assertTrue(t1.addBarco(5, 0, "H", 4,b )==false); //Fuera de tablero por H
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 6, "V", 4 ,b)==false); //Fuera de tablero por V
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 3, "H", 3,b)== true); // Barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(4, 1, "V", 3,b)==false); //Casilla  3 coincide con barco (2,3,H)
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 3, "V", 2,b)== false); //Casilla 1 coincide con barco(2,3,H)
		t1.mostrarTablero();
		assertTrue(t1.addBarco(7, 7, "H", 2,b )==false); //Casilla fuera de tablero V con valores forntera, pero medida superior.
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 3, "H", 1,b )==false); // Casilla coincide con casilla ocupada del barco (2,3,H)
		t1.mostrarTablero();
		assertTrue(t1.addBarco(8, 3, "H", 1 ,b)==false); //Valor limite positivo de X
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 8, "H", 1 ,b)==false); //Valor limite positivo de Y
		t1.mostrarTablero();
		assertTrue(t1.addBarco(9, 9, "H", 1 ,b)==false); //Valores superiores de X e Y
		t1.mostrarTablero();
		assertTrue(t1.addBarco(6, 3, "V", 3 ,b)==true); //Barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(5, 0, "H", 3,b )==true); //Barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 0, "H", 3 ,b)==false); //Casilla 3 coincide con barco(5,0,H);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(4, 5, "H", 3,b )==false); //Casilla 3 coincidecon barco(6,3,V)
		t1.mostrarTablero();
		assertTrue(t1.addBarco(-1, 0, "H", 2 ,b)==false); // Valor limite negativo de X
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, -1, "H", 4 ,b)==false); //Valor limite negativo de Y
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 7, "H", 2,b )==true); //Barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 7, "H", 2 ,b)==false); //Casilla 2 coincide con casilla de barco(3,7,H)
		t1.mostrarTablero();
		assertTrue(t1.addBarco(1, 3, "V", 2 ,b)==true); // Barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(1, 2, "V", 2,b )==false); //Casilla 2 coincide con casilla de barco(1,3,V)
		
		
		
	}
	
	@Test
	public void testValorPsoicion()  // En este metodo nunca habra valores erroneos de X, e Y, se comprueban anteriormente.
									//Solo se comprueba la casilla introducida por el usuario al colocar el barco
	{
		t1.llenarTableroAgua();
		//Agregamos 3 barcos de diferentes medidas
		t1.addBarco(1,0,"V",4,b); //1
	    t1.addBarco(5, 6, "H", 3,b); // 2
	    t1.addBarco(1, 4, "H", 4,b); //3
	    
	    t1.mostrarTablero();
	    
	    int res1 = t1.valorPosicion(1, 0); //Casilla ocupada 1
	    assertEquals(res1,1);
	    
	    int res2 = t1.valorPosicion(5, 6); //Casilla ocupada 2 
	    assertEquals(res2,1);
	    
	    int res3 = t1.valorPosicion(1, 4); //Casilla ocupada 3
	    assertEquals(res3,1);
	    
	    int res4 = t1.valorPosicion(6, 5); //Casilla libre (agua)
	    assertEquals(res4,0);
	    
	    
	    
		
		
	}
	@Test
	public void testCasillaOcupada() // Este metodo solo se ejecuta para comprobar si poniendo un barco en una casilla libre
	                                 //alguna casilla de su medida ocupa o no un barco puesto anteriormente.
	                                 //en este metodo no se comprueba si la casilla introducida coincide o no. Se hace en el metodo valorPosicion();
									// aqui nunca llegara� una X, o una Y  fuera de rango, ni una posicion o  medida erronia.                            
	{
		t1.llenarTableroAgua();
		//Agregamos 3 barcos de diferentes medidas en posiciones libres.
		t1.addBarco(1,0,"V",4,b); //1
	    t1.addBarco(5, 6, "H", 3,b); // 2
	    t1.addBarco(1, 4, "H", 4,b); //3
	    
	    t1.mostrarTablero();
	    
	    assertTrue(t1.casillaOcupada(0, 1, "H", 4)==true); // Hacemos coincidir la segunda casilla de este,  con una casilla del barco 1.
	    assertTrue(t1.casillaOcupada(5, 5, "V", 2)==true); // Hacemos coincidir la seguna casilla de este, con alguna casilla del barco numero 2.
	    assertTrue(t1.casillaOcupada(4, 2, "V", 3)==true); // Hacemos coincidir la ultima casilla de este, con  alguna casilla del barco numero 3.
	    assertTrue(t1.casillaOcupada(2, 5, "V", 3)==false); // Este barco no deberia coincidir con ninguno.
	    
	    assertTrue(t1.casillaOcupada(0, 7, "H", 3)==false); // Este barco tampoco deberia coincidir con ninguna.
	    
	    
	    //LOOP TESTING
	    System.out.println("LOOP TEST");
	    t1.llenarTableroAgua();
	    t1.addBarco(2,3,"H",4,b); //1
	    t1.mostrarTablero();
	    assertTrue(t1.casillaOcupada(2, 2, "V", 4)==true); // loop solo hace 1 vuelta de 4 //coincide la 2nda casilla
	    assertTrue(t1.casillaOcupada(2, 1, "V", 4)==true); //loop solo hace 2 vueltas de 4 //coincide la 3era casilla
	    assertTrue(t1.casillaOcupada(2, 0, "V", 4)==true); // loop solo hace 3 vueltas de 4 //coincide la 4rta casilla
	    assertTrue(t1.casillaOcupada(7, 0, "V", 4)==false); //loop hace todas las vueltas ; //no coincide ninguna
	    
	    
	}
	
	
	@Test
	public void testComprobarTirada() //este metodo comprueba si y actualiza una variable tocado dependiendo de si es agua o no.
	//Muy parecido a valorPosicion(), retornando boolean en vez de int.
	//Los valores x e y nuca seran erroneos pues se comprueban anteriormente
	{
		
		t1.llenarTableroAgua();
		t1.mostrarTablero();
		t1.addBarco(3,3,"V",4,b); //1
	    t1.addBarco(0, 6, "H", 3,b); // 2
	    t1.addBarco(4, 4, "H", 4,b);//3
	    t1.addBarco(0, 3, "V", 1, b);//4
	    t1.mostrarTablero();
	    
	    //Todas estas pruebas son pruebas de valor limite de los barcos colocados. tanto disparando fuera (agua)
	    //o tocando el barco (tocado)
	    
	    assertTrue(t1.comprobarTirada(3,2)==false) ;//AGUA
	    assertTrue(t1.comprobarTirada(3,3)==true) ;//TOCADO
	    assertTrue(t1.comprobarTirada(3,6)==true); //TOCADO
	    assertTrue(t1.comprobarTirada(4,6)==false);//AGUA
	    assertTrue(t1.comprobarTirada(0,5)==false) ;//AGUA
	    assertTrue(t1.comprobarTirada(0,7)==false) ;//AGUA
	    assertTrue(t1.comprobarTirada(2,6)==true) ;//TOCADO
	    assertTrue(t1.comprobarTirada(4,4)==true); //TOCADO
	    assertTrue(t1.comprobarTirada(7,4)==true);//TOCADO
	    assertTrue(t1.comprobarTirada(3,7)==false);//AGUA
	    assertTrue(t1.comprobarTirada(0,3)==true);//TOCADO
	    
	    
	}
}