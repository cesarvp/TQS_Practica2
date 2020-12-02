package BattleShip;
import java.util.Scanner;

public class Inicio {

	static DatosInicio datosIni = new LeerDatosInicioMenu();
	
	public void tipoDatos (DatosInicio di) 
	{
		
		datosIni=di;
		
		
	}

	public static void main (String[] args) 
	{
		System.out.println("BIENVENIDO A HUNDIR LA FLOTA TEST EDITION! \n");
		
		Jugador j1 = new Jugador("Jugador1");
	    Jugador j2 = new Jugador("Jugador2");
			  
		Scanner read= new Scanner(System.in);
		boolean salir = false;
		
		
		while(salir==false)
		{ 
			try 
			{
				System.out.println("MENU INICIO: \n");
				System.out.println("Entra 1: Normas");
				System.out.println("Entra 2: Jugar");
				System.out.println("Entra 3: Salir");
				int op = datosIni.datosInicioMenu();
				switch(op)
				{
					case 1:
						salir=false;
						 System.out.println("BIENVENIDO A HUNDIR LA FLOTA TEST EDITION! \n"
						 		+ "NORMATIVA Y DINAMICA DE JUEGO:\n\n"
						 		+ "BARCOS:");
						  System.out.println(" Hay 4 tipos de Barcos");
						  System.out.println(" 2 Portaaviones que ocupan 4 casillas cada uno ");
						  System.out.println(" 2 Destructores que ocupan 3 casillas cada uno");
						  System.out.println(" 2 Fragatas que ocupan 2 casillas cada uno");
						  System.out.println(" 2 Submarinos que ocupan 1 casilla cada uno");
						  System.out.println(" Por lo tanto 8 barcos en total que ocupan 20 casillas. \n\n"
						  		+ "TABLERO:");
						  
						  System.out.println(" EL TABLERO TIENE VOLUMEN FIJO DE 8 por 8 (total 64 casillas)");
						  System.out.println(" LOS 0 SON AGUA Y LOS 1 SERAN LOS BARCOS \n");
						
						  System.out.print("\n");
						  System.out.print("COMO JUGAR:\n");
						  System.out.println(" PARA INTRODUCIR LOS BARCOS, INTRODUCE LOS NUMEROS DE LAS COORDENADAS DE LA PRIMERA CASILLA   \n"
						  		+ " DONDE QUIERAS COLOCAR EL BARCO Y LA POSICION VERTICAL U HORIZONTAL ( V o H ), \n"
						  		+ " FIJATE BIEN DONDE COLOCAS EL BARCO YA QUE LA POSICION SIEMPRE SERAN HACIA LA DERECHA(H) O HACIA ABAJO(V).\n"
						  		+ " EN LOS SUBMARINOS DE 1 CASILLA ES INDIFERENTE PONER H O V, SE PONDRA ,SI ESTA LIBRE, EN LAS COORDENADAS SELECCIONADAS");
						  System.out.println("\n");
						  System.out.println("---------------------------------- \n");
						  System.out.println (" LA DINAMICA DEL JUEGO ES POR TURNOS COMPLETOS. ES DECIR, EL JUGADOR 1, COLOCA TODOS SUS BARCOS EN EL TABLERO. "
								+ "\n UNA VEZ COLOCADOS, ES EL TURNO DEL JUGADOR 2, QUE DEBE INTETNTAR HUNDIRLOS. TENDRA 35 INTENTOS PARA ELLO. \n CUANTOS MAS HUNDA O TOQUE MEJOR "
								+ "\n UNA VEZ EL JUGADOR 2 HAYA AGOTADO SUS TIRADAS O HUNDIDO TODOS LOS BARCOS, CREARA SU TABLERO, \n Y SERA EL TURNO DEL JUGADOR 1 DE INTENTAR HUNDIR "
								+ "\n O TOCAR EL MAXIMO DE BARCOS POSSIBLES. "
								+ "\n QUIEN MAS BARCOS HUNDIDOS Y/O TOCADOS TENGA, GANA LA PARTIDA. \n");
						break;
					case 2:
						salir = true;
						Juego juego = new Juego();
				
						juego.inicioPartida(j1, j2);
						
						break;
					case 3:
						salir = true;
					System.out.println("GRACIAS POR JUGAR!");
						break;
					default:
						System.out.println("Debes introducir un numero del 1 al 3.");
						System.out.println();
				}
			} catch(Exception e) {
				System.out.println("Error al No introducir numero, debe introducir un numero del 1 al 3");
				datosIni.datosInicioMenu();
			}
		}
		read.close();
	
	}
	
}
