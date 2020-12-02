package BattleShip;

public class Jugador {
	//Atributos de la clase Jugador
	private String nombre;
	private boolean ganador;
	private int hundidos;
	private int tocados;
	private boolean colocado;
	private boolean disparado;
	
	
	public Jugador(String nom)
	{
		//Constructor de la clase, encargada de inicializar los atributos
		nombre=nom;
		ganador=false;
		hundidos=0;
		tocados=0;
		colocado=false;
		disparado=false;
		
	}
	public void colocadoBarcos() 
	{
		//Metodo que asigna que el jugador ha colocado todos los barcos
		colocado=true;
	}
	public void disparadoBarcos() 
	{
		//Metodo encargado de asignar que el jugador ha realizado todos los disparos
		disparado=true;
	}
	public boolean haColocadoTodos() 
	{
		//Metodo encargado de retornar si el jugador ha colocado todos los barcos
		return colocado;
	}
	public boolean haDisparadoTodos()
	{
		//Metodo que retorna si el jugador ha realizado todos sus disparos
		return disparado;
	}
	public void ponerGanador(boolean gan) 
	{
		//Metodo que asigna si el jugador ha hundido los 8 barcos
		ganador=gan;
	}
	public String getNombre()
	{
		//Metodo encargado de retornar el nombre del jugador
		return nombre;
	}
	public boolean esGanador()
	{
		//Metodo encargado de devolver si el jugador a hundido los 8 barcos 
		return ganador;
	}
	public void sumarTocados()
	{
		//Metodo encargado de incrementar el valor de casillas de barcos tocados
		tocados++;
	}
	public int numeroTocados()
	{
		//Metodo encargado de retornar el numero de casillas tocadas
		return tocados;
	}
	public void sumarHundidos()
	{
		//Metodo que incrementa el numero de barcos hundidos
		hundidos++;
	}
	public int numeroHundidos() 
	{
		//Metodo encargado de retornar el numero de barcos hundidos
		return hundidos;
	}
	public void reinciarTocados()
	{
		//Metodo encargado de reiniciar las casillas de barcos tocados a 0 usada en test
		tocados=0;
	}
}
