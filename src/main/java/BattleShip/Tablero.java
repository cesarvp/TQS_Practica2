package BattleShip;

public class Tablero {
	
	private int size;
	private int [][] tab;

	 final int  AGUA = 0;
	 final int  BARCO = 1;
	 
		
	public Tablero (int s) {
		size=s;
		tab= new int [size][size];
		llenarTableroAgua();
	}
	


	
	public int getSize() {
		return size;
	}
	
	public void llenarTablero(int posI, int posJ, int valor) 
	{
		tab[posI][posJ]=valor;	
	}

	public void llenarTableroAgua() {
		  
		  for(int i =0; i<getSize();i++)
		  {
			  for(int j=0; j<getSize();j++) 
			  {
				  llenarTablero(i, j, AGUA);
			  }
		  }
	  }
	  
	public void mostrarTablero() 
	{
		System.out.print("X  ");
		for(int x=0; x<getSize();x++)
		{
			System.out.print(x);
		}
		System.out.print("\n");
		System.out.print("Y");
		System.out.print("\n");
		for(int i =0; i<getSize();i++) 
		{
			System.out.print(" "+ (i) + " ");
			for(int j =0; j<getSize();j++) 
			{
				System.out.print(tab[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public int valorPosicion(int x, int y)
	{
		return tab[y][x];
	}
	
	//comprovacion de si alguna casilla de un barco coincide con alguna ocupada.
	public boolean casillaOcupada(int x, int y, String pos, int medida){
		boolean ocupada = false;
	
	
		
		if(pos=="V"){
		
			int conty = y;
			
			while(conty< y+medida && ocupada==false){
				
			
				
				if(valorPosicion(x,conty)==BARCO)
				{ocupada=true;}
				
				else{ conty ++;
				}
				
			}
		}else{ 
			int contx = x;
		
			while(contx< x+medida && ocupada==false){
		
				
				if(valorPosicion(contx,y)==BARCO)
				{
					ocupada=true;
				}
				else{ 
					contx ++;
				}
				
			}
		}
		
		return ocupada;
	}
	public boolean addBarco(int x, int y, String pos, int medida, Barco bar) 
	{
		
		boolean barcoOK = false;
		if(pos.equals("V") || pos.equals("H") ){barcoOK=true;}
		else{
			barcoOK=false;
		}
		
		if(x<0 || y<0 || x>7 || y>7){barcoOK = false;} //comprovamos que x e y esten dentro de los rangos.
		if(barcoOK==true && valorPosicion(x,y)==BARCO){barcoOK = false;} //comprovamos primera casilla ok
		if(barcoOK==true && pos=="H" && x+(medida-1)>7){barcoOK = false;} // comprovamos si medida en H, sale de los limites
		if(barcoOK==true && pos=="V" && y+(medida-1)>7){barcoOK = false;} // comprobamos si medida en V sale de los limites
		if(barcoOK==true && casillaOcupada(x,y,pos, medida)==true){barcoOK= false;} //comprovamos si alguna casilla del abrcos coicnide con un barco ya puesto
		if(barcoOK == true ){
			if( pos.equals("V") || pos.equals("v")){
				for(int i=y; i<=y+(medida-1); i++){
					llenarTablero(i,x,BARCO);
					bar.agregarCoordenadas(x,i);
				}
			}
			if( pos.equals("H")|| pos.equals("h")){
				for(int j=x; j<=x+(medida-1);j++) 
				{
					llenarTablero(y,j,BARCO);
					bar.agregarCoordenadas(j,y);
				}
	
			}
			
		}
		
		return barcoOK;
	}
	
	public boolean comprobarTirada(int x, int y)
	{
		boolean tocado;
		int pos = valorPosicion(x,y);
		if(pos == AGUA)
		{
			tocado= false;
		}
		else {
			
			tocado=true;
		}
		return tocado;
	}
	
	
	 public boolean comprobarTablero(){ //solo para test para ver que se crea bien
		 boolean var = true;
		 for (int i=0; i<getSize(); i++){
			 for(int j=0; j<getSize(); j++){
				 if(tab[i][j]!= 0){ var=false;}
			 }
		 }
		  return var;
	  }
	 
	
}
