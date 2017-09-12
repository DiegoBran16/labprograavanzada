package tenis;
/**
 * 
 * @author diego
 *
 */
public class Campeones  implements Reportero{
	

Lista list = new Lista();
		/**
		 * crea una lista y almacena los valores en ella 
		 */
	public String calcularGanador(int puntosA, int puntosB) {
		if (puntosA-puntosB==2 && puntosA <=7 && puntosB <=7) {
			
			list.encolar("Jugador A");
			
			return ("Jugador A gano el set");
	
			
		}
		if (puntosB - puntosA==2 && puntosA <=7 && puntosB <=7)
		{		list.encolar("Jugador B");
		
			return " Jugador B gano el set";
		}
	
		if (puntosA-puntosB!=2 && puntosA <=7 && puntosB <=7) {
			 
			return "el set no a terminado";
			}
		if (puntosB-puntosA!=2 && puntosA <=7 && puntosB <=7) {
			return "el set no a terminado";
		}
		if (puntosA >7 || puntosB > 7) {
			return "partido invalido";
		}
		if (puntosB-puntosA==1 && puntosA == 6 && puntosB ==7 ) {
			list.encolar("Jugador B");
			return "Jugador B gano el set";
			
		}
		if (puntosA-puntosB==1 && puntosA ==7 && puntosB ==6) {
			list.encolar("Jugador A");
			return ("Jugador A gano el set");
		}
		if (puntosA == puntosB) {
			return "estan empatados";		
		}
		
		

		 return"";
	
		}


	/**
	 * calcula al ganador
	 */
	public String calcularCampeon() {
		int ganadosA= list.contador("Jugador A");
		int ganadosB= list.contador("Jugador B");
		
		if (ganadosA> ganadosB){
			return "el Jugador A gano";
		};
		
		if (ganadosB>ganadosA) {
			return "el jugador B es el ganador";
			
		}
		
		if (ganadosA==ganadosB) {
			return "no hay ganador";
		}
		return null;
	}


	public String recordarGanador(int juego) {
		return null;
	}
	

}
