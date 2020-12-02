package BattleShip;

import java.util.ArrayList;

public class MockDatosJugar implements DatosJugar{
	
	private ArrayList<Integer>coordX = new ArrayList<Integer>();
	private ArrayList<Integer>coordY= new ArrayList<Integer>();
	private ArrayList<Integer>coordDisparoX = new ArrayList<Integer>();
	private ArrayList<Integer>coordDisparoY= new ArrayList<Integer>();
	private ArrayList<String>posi = new ArrayList<String>();
	private int contX =0, contY=0, contP=0, contDisX=0, contDisY=0;
	
	public void entradasTeclado(int tipo) 
	{
		//Los valores decimales no se pueden comprobar con el mock, pero se han comprobado manualmente.
		//Igual que cualquier valor no idoneo para el tipo de dato.
		
	  if(tipo==1) //Coordenadas de introduccion de barco j1
	  {
		    coordX.add(0);coordY.add(0);posi.add("V");
			coordX.add(1);coordY.add(1);posi.add("H");
			coordX.add(2);coordY.add(5);posi.add("V");
			coordX.add(5);coordY.add(6);posi.add("H");
			coordX.add(0);coordY.add(6);posi.add("V");
			coordX.add(5);coordY.add(3);posi.add("H");
			coordX.add(7);coordY.add(0);posi.add("V");
			coordX.add(7);coordY.add(7);posi.add("V");
	  }
	  if(tipo==2) //Coordenadas de disparar a barcos j2
	  {
		  coordDisparoX.add(0);coordDisparoY.add(0); //TOCADO
		  coordDisparoX.add(2);coordDisparoY.add(2); //AGUA
		  coordDisparoX.add(7);coordDisparoY.add(0); //TOCADO Y HUNDIDO
		  coordDisparoX.add(8);coordDisparoY.add(8); //ERROR
		  coordDisparoX.add(5);coordDisparoY.add(6); //TOCADO
		  coordDisparoX.add(0);coordDisparoY.add(0); //YA DISPARADA!
		  coordDisparoX.add(1);coordDisparoY.add(3); //AGUA
		  coordDisparoX.add(2);coordDisparoY.add(3); //AGUA
		  coordDisparoX.add(3);coordDisparoY.add(3); //AGUA
		  coordDisparoX.add(4);coordDisparoY.add(3); //AGUA
		  coordDisparoX.add(2);coordDisparoY.add(5); 
		  coordDisparoX.add(0);coordDisparoY.add(7); //TOCADO
		  coordDisparoX.add(0);coordDisparoY.add(6); //TOCADO Y HUNDIDO
		  coordDisparoX.add(-1);coordDisparoY.add(-1); //ERROR
		  coordDisparoX.add(0);coordDisparoY.add(4); //AGUA
		  coordDisparoX.add(1);coordDisparoY.add(4); //AGUA
		  coordDisparoX.add(2);coordDisparoY.add(4); //AGUA
		  coordDisparoX.add(3);coordDisparoY.add(4); //AGUA
		  coordDisparoX.add(4);coordDisparoY.add(4); //AGUA
		  coordDisparoX.add(5);coordDisparoY.add(4); //AGUA
		  coordDisparoX.add(6);coordDisparoY.add(4); //AGUA
		  coordDisparoX.add(7);coordDisparoY.add(4); //AGUA
		  coordDisparoX.add(7);coordDisparoY.add(7); //TOCADO Y HUNDIDO
		  coordDisparoX.add(2);coordDisparoY.add(5);
		  coordDisparoX.add(6);coordDisparoY.add(3); //TOCADO
		  coordDisparoX.add(5);coordDisparoY.add(3); //TOCADO Y HUNDIDO
		  coordDisparoX.add(2);coordDisparoY.add(5);
		  coordDisparoX.add(100);coordDisparoY.add(1122); //ERROR
		  coordDisparoX.add(3);coordDisparoY.add(2); //AGUA
		  coordDisparoX.add(4);coordDisparoY.add(2); //AGUA
		  coordDisparoX.add(5);coordDisparoY.add(2); //AGUA
		  coordDisparoX.add(6);coordDisparoY.add(2); //AGUA
		  coordDisparoX.add(7);coordDisparoY.add(2); //AGUA
		  coordDisparoX.add(3);coordDisparoY.add(5); //AGUA
		  coordDisparoX.add(7);coordDisparoY.add(0); //YA DISPARADA Y HUNDIDA
		  coordDisparoX.add(5);coordDisparoY.add(5); 
		  coordDisparoX.add(6);coordDisparoY.add(5);
		  coordDisparoX.add(7);coordDisparoY.add(5); //AGUA
		  coordDisparoX.add(2);coordDisparoY.add(5); //UNA TIRADA DE MAS QUE NO DEBE INFLUIR
		  
		  //jug1 9 tocados y 4 hunidoos los 2 de 2, i los 2 de 1.
		  
		  
		  //continuar metiendo coordenadas hasta 45. si no se meten sale ya disparadas pero es normal
		  
	  } 
	  if(tipo==3) //coordenadas de introduccion de barco j2

	  {
		    coordX.add(-3);coordY.add(-2);posi.add("V"); //ERROR
			coordX.add(12120);coordY.add(12343);posi.add("H"); //ERROR
			coordX.add(12120);coordY.add(12343);posi.add("X"); //ERROR
			coordX.add(12120);coordY.add(12343);posi.add("J"); //ERROR
			coordX.add(0);coordY.add(0);posi.add("V"); //ok medida4
			coordX.add(0);coordY.add(2);posi.add("V"); //error barco en mismo sitio que uno existente
			coordX.add(1);coordY.add(1);posi.add("H"); //ok medida4
			coordX.add(3);coordY.add(0);posi.add("V"); //error  medida 3, casilla 2 del barco coincide con uno ya existente en V
			coordX.add(2);coordY.add(5);posi.add("V");
			coordX.add(5);coordY.add(6);posi.add("H");
			coordX.add(4);coordY.add(6);posi.add("H"); //error barco casilla 2 en mismo sitio que uno existente en H
			coordX.add(0);coordY.add(6);posi.add("V");
			coordX.add(5);coordY.add(3);posi.add("H");
			coordX.add(7);coordY.add(0);posi.add("V");
			coordX.add(7);coordY.add(0);posi.add("V"); //error barco en mismo sitio que uno existente
			coordX.add(7);coordY.add(7);posi.add("V");
		  
	  }
	  if(tipo==4) 
	  {
		  
		  coordDisparoX.add(0);coordDisparoY.add(0); //TOCADO
		  coordDisparoX.add(2);coordDisparoY.add(2);//AGUA
		  coordDisparoX.add(7);coordDisparoY.add(0); //TOCADO Y HUNDIDO
		  coordDisparoX.add(8);coordDisparoY.add(8); //error
		  coordDisparoX.add(5);coordDisparoY.add(6); //TOCADO
		  coordDisparoX.add(0);coordDisparoY.add(0);// YA DISPARADA!
		  coordDisparoX.add(1);coordDisparoY.add(3);//AGUA
		  coordDisparoX.add(2);coordDisparoY.add(3);
		  coordDisparoX.add(3);coordDisparoY.add(3);
		  coordDisparoX.add(4);coordDisparoY.add(3);//AGUA
		  coordDisparoX.add(2);coordDisparoY.add(5);
		  coordDisparoX.add(0);coordDisparoY.add(7);//TOCADO
		  coordDisparoX.add(0);coordDisparoY.add(6);//TOCADOY HUNDIDO
		  coordDisparoX.add(-1);coordDisparoY.add(-1); //ERROR
		  coordDisparoX.add(2);coordDisparoY.add(6); //TOCADO
		  coordDisparoX.add(1);coordDisparoY.add(4);
		  coordDisparoX.add(2);coordDisparoY.add(4);
		  coordDisparoX.add(3);coordDisparoY.add(4);
		  coordDisparoX.add(4);coordDisparoY.add(4);
		  coordDisparoX.add(5);coordDisparoY.add(4);
		  coordDisparoX.add(6);coordDisparoY.add(4);
		  coordDisparoX.add(7);coordDisparoY.add(4);//AGUA
		  coordDisparoX.add(7);coordDisparoY.add(7); //TOCADO Y HUNDIDO
		  coordDisparoX.add(2);coordDisparoY.add(5);
		  coordDisparoX.add(6);coordDisparoY.add(3); //TOCADO
		  coordDisparoX.add(5);coordDisparoY.add(3); //TOCADO Y HUNDIDO
		  coordDisparoX.add(2);coordDisparoY.add(5);
		  coordDisparoX.add(100);coordDisparoY.add(1122); //ERROR
		  coordDisparoX.add(3);coordDisparoY.add(2);//AGUA
		  coordDisparoX.add(4);coordDisparoY.add(2);
		  coordDisparoX.add(5);coordDisparoY.add(2);
		  coordDisparoX.add(6);coordDisparoY.add(2);
		  coordDisparoX.add(7);coordDisparoY.add(2);
		  coordDisparoX.add(3);coordDisparoY.add(5);
		  coordDisparoX.add(7);coordDisparoY.add(0); //YA DISPARADA Y HUNDIDA
		  coordDisparoX.add(5);coordDisparoY.add(5);
		  coordDisparoX.add(6);coordDisparoY.add(5);
		  coordDisparoX.add(7);coordDisparoY.add(5); //AGUA
		  coordDisparoX.add(2);coordDisparoY.add(5); //UNA TIRADA DE MAS QUE NO DEBE INFLUIR

		  
		  //j2 10 tocados 4 hundidos = GANADOR.
		  
	  }
	  

		
		
	}
	public int entrarCoordenadaX() 
	{
		int res=0;
		if(contX<coordX.size()) 
		{
			res= coordX.get(contX);
			contX++;
			
		}
	    return res;
		
		
	}
	public int entrarCoordenadaY() 
	{
		int res=0;
		if(contY<coordY.size()) 
		{
			res= coordY.get(contY);
			contY++;
			
		}
	    return res;
		
		
	}
	
	
	public String entrarPosicion() 
	{

		String res="";
		if(contP<posi.size()) 
		{
			res= posi.get(contP);
			contP++;
			
		}
	    return res;
		
		
	}
	
	public int entrarCoordenadaDisparoX() 
	{
		int res=0;
		if(contDisX<coordDisparoX.size()) 
		{
			res= coordDisparoX.get(contDisX);
			contDisX++;
			
		}
	    return res;
		
		
	}
	public int entrarCoordenadaDisparoY() 
	{
		int res=0;
		if(contDisY<coordDisparoY.size()) 
		{
			res= coordDisparoY.get(contDisY);
			contDisY++;
		}
	    return res;
		
		
	}
	
	

}
