package ejrcicio.monstruos;

public class MonstruoAire extends Monstruo {
	
	
	
	
/**
 * solicita las siguientes propiedades
 * @param nombre
 * @param color
 * @param edad
 * @param elementoPrimario
 */
	public MonstruoAire(String nombre, String color, int edad, String elementoPrimario) {
		super(nombre, color, edad, elementoPrimario);
		
	}
/**
 * retorna wue esta volando
 * @return
 */
	public String volar() {
		
		return "hola soy " + getNombre() +", soy un monstruo de "+ getElementoPrimario()+ " y estoy volando"; 
		
	}

}