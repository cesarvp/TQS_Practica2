package BattleShip;

import java.util.Scanner;

public class LeerDatosInicioMenu implements DatosInicio{
	
private Scanner read;
	
    LeerDatosInicioMenu()
	{
		read= new Scanner(System.in);
	}
	public int datosInicioMenu() //solo se ejecutan las siguientes si se entraran los datos a mano.
	{
		return read.nextInt();
	}
	
	

}
