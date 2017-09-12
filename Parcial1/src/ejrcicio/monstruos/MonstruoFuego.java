package ejrcicio.monstruos;

/**
 * 
 * @author diego
 *
 */
public class MonstruoFuego extends Monstruo{
	
	
	/**
	 * recibe los siguientes parameteos 
	 * @param nombre
	 * @param color
	 * @param edad
	 * @param elementoPrimario
	 */
	public MonstruoFuego(String nombre, String color, int edad, String elementoPrimario) {
		super(nombre, color, edad, elementoPrimario);

	}
/**
 * establece que el monstruo esta quemando
 * @return
 */
	public String quemar() {
		return "hola soy " + getNombre() +", soy un monstruo de "+ getElementoPrimario()+ " y estoy quemando";
	}

}
