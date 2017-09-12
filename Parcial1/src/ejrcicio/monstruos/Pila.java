package ejrcicio.monstruos;

public class Pila {
	
	Monstruo[] array = new Monstruo[12];
	int t = -1;
	
	public void push(Monstruo M)
	{
		if (t<12){
				array[t++]= M;
		}
		else {
			System.out.println("el stack esta lleno");
		}

	
	}
	
	public Monstruo pop() {
		if (array[t]==null) {
			return null;
		}
	else{
		
		array[t] = null;
		t--;
		return array[t+1];
	}
		
		
	
	}
	

}
