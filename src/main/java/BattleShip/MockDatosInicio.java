package BattleShip;

import java.util.ArrayList;

public class MockDatosInicio implements DatosInicio {
	
	
	ArrayList<Integer> datosMenu = new ArrayList<Integer>();
	int cont =0;
	
	
	public void datosMenu(int op) 
	{
		if(op==1) {
		datosMenu.add(-1);datosMenu.add(4);//valores limite
		datosMenu.add(-33);datosMenu.add(44);//valores bajos y altos
		datosMenu.add(1);datosMenu.add(3); // valores forntera -OK
		}else {
		   datosMenu.add(2);
		}
	
		
		
		
	}
	public int datosInicioMenu() 
	{
		int res=0;
		if(cont<datosMenu.size()) 
		{
			res= datosMenu.get(cont);
			cont++;
			
		}
	    return res;
		
	}
	


}
