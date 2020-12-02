package BattleShip;
import java.util.Scanner;

public class LeerDatosJugar implements DatosJugar{
	
	private Scanner read;
	
	LeerDatosJugar()
	{
		read= new Scanner(System.in);
	}
	public int entrarCoordenadaX() //solo se ejecutan las siguientes si se entraran los datos a mano.
	{
		return read.nextInt();
	}
	public int entrarCoordenadaY() 
	{
		return read.nextInt();
	}
	public int entrarCoordenadaDisparoX() 
	{
		return read.nextInt();
	}
	public int entrarCoordenadaDisparoY() 
	{
		return read.nextInt();
	}
	
	public String entrarPosicion() 
	{
		return read.next();
	}
	public int entrarOpcionMenu() 
	{
		return read.nextInt();
		
	}

}
