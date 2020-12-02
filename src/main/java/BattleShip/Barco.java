package BattleShip;
import java.util.ArrayList;

public class Barco {

	private int medida;
	private String tipo;
	private boolean hundido;
	private int tocado;
	ArrayList<String> coordenadas = new ArrayList<String>();
	ArrayList<Boolean>coordTocadas= new ArrayList<Boolean>();
	
	
	public Barco(int med, String tip) 
	{
		//Constructor de la clase Barco inicializando los atributos
		medida= med;
		tipo=tip;
		hundido=false;
		tocado=0;
		for(int i=0;i<medida;i++)
		{
			coordTocadas.add(false);
		}		
	}
	
	public void agregarCoordenadas(int x, int y)
	{
		//Metodo encargado de agregar las casillas X e Y que ocupa el Barco
			String sA = String.valueOf(x);
			String sB = String.valueOf(y);
	
			String res = sA + sB;
		
			coordenadas.add(res);		
	}
	
	public boolean estaHundido() 
	{
		//Nos retorna si el barco se encuentra hundido o no
		return 	hundido;
	}
	
	public int numeroTocado() //Metodo de test
	{
		//Nos retorna el numero de veces que el barco ha sido tocado
		return tocado;
	}
	
	public void sumarTocado() 
	{	
		//Metodo encargado de incrementar las veces que ha sido tocado 
		tocado++;
		if(tocado==medida) {hundido=true;}
	}
	
	public boolean comprobarCoordenadas(int x, int y) // Comprobamos si existe coordenada, y si es asi tocamos el barco!
	{
		String sA = String.valueOf(x);
		String sB = String.valueOf(y);

		String res = sA + sB;
		
		int cont=0;
		boolean encontrado=false;
		if(estaHundido()==false) {
			while(cont<coordenadas.size() && encontrado ==false) 
			{
				
				if(coordenadas.get(cont).equals(res) && coordTocadas.get(cont)==false)
				{
					encontrado=true;
					coordTocadas.add(cont, true);	
				}			
				cont++;
			}
		}
		return encontrado;
		
	}
	
	public void pintarCoordenadas() 
	{
		//Metodo que muestra las coordenadas que ocupa el barco
		for(int i =0; i<coordenadas.size();i++) 
		{
			System.out.print(coordenadas.get(i));
			System.out.print(" ; ");
			
		}
		System.out.println();
	}
	

	public int getMedida() {
		//Retorna las casillas que ocupa el barco
		return medida;
	}

	public String getTipo() {
		//Retorna el tipo de barco 
		return tipo;
	}

}
