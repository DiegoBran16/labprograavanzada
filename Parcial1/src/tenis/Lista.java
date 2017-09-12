package tenis;

public class Lista {
	
	String[] lista = new String[8];
	
	public void encolar(String M) {
		for (int i=0; i<9;i++) {
			if (lista[i]==null) {
				lista[i]= M;
			}
			
		}
	}

	
	public int contador(String m)
	{
		int contador=0;
		for (int i=0; i<9; i++) {
			if (lista[i]==m) {
				contador+=1;
				return contador;
				
			}else { 
				return 0;	
			}
			
	
					
	}
		return 0;
	}}




