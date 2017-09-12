package ejrcicio.monstruos;
/**
 * 
 * @author Diego
 *
 */
public class Monstruo implements FabricaRanger{
	 
	Pila p1 = new Pila();
	private String nombre;
	private String color;
	private int edad;
	private String elementoPrimario;
/**
 * 		recive los parametros color, edad, elemeto primario y nombre
 * @param nombre
 * @param color
 * @param edad
 * @param elementoPrimario
 */
	public Monstruo(String nombre, String color, int edad, String elementoPrimario) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
		this.elementoPrimario = elementoPrimario;
	}
	public Monstruo(String string, String string2, String string3) {
	// TODO Auto-generated constructor stub
}
	/**
	 * 
	 * @return retorna el nombre del monstruo
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param solicita el nombre del monstruo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**+
	 * 
	 * @return retorna el color del mondtruo 
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * @param solicita el color del monstruo
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * 
	 * @return retorna la edad del monstruo
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param solicita la edad del monstruo
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @return retorna el elemento del monstruo
	 */
	public String getElementoPrimario() {
		return elementoPrimario;
	}
	/**
	 * 
	 * @param solicita el elemento del monstruo
	 */
	public void setElementoPrimario(String elementoPrimario) {
		this.elementoPrimario = elementoPrimario;
	}
	/**+
	 * retorna que se esta agigantando
	 * @return
	 */
	public String agigantarse() {
		return "hola soy " + getNombre() +", soy un monstruo de "+ getElementoPrimario()+ " y me estoy agigantando";
	}
	/**
	 * retorna que esta caminanfo lento
	 * @return
	 */
	public String caminarLento() {
		return "hola soy " + getNombre() +", soy un monstruo de "+ getElementoPrimario()+ " y camino lento";
	}
	/**
	 * retorna que esta golpeando
	 * 
	 * @return
	 */
	public String golpear() {
		return "hola soy " + getNombre() +", soy un monstruo de "+ getElementoPrimario()+ " y estoy golpeando";
	}
	
	/**
	 * ingresa un monstruo a la pila
	 * @param M
	 * @return
	 */
	public boolean apilar(Monstruo M) {
		p1.push(M);
		
		return true;
	}
	
	
	/**
	 * recibe el elemento del monstruo y posteriormetne cre auno con los campos vacios
	 * @param elemento
	 * @return
	 */
		public Monstruo fabricar(String elemento)
		{ 
			if (elemento=="fuego") {
				Monstruo m = new MonstruoFuego("","",0,"");
				return m;
			}if (elemento =="aire") {
				Monstruo m = new MonstruoAire("", "",0,"");
				return m;
			} if (elemento== "agua" || elemento == "tierra") {
				Monstruo m = new Monstruo("","",0,"");
				return m;
			}
			return null;
		}
			
			
			
	
	
	public boolean encolar(Monstruo monstruo) {
		return false;
	}
	
	public boolean desencolar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * +retira un monstruo de la pila 
	 * @return
	 */
	public boolean desapilar(Monstruo monstruo) {
		if (p1.pop()!= null) {
			return true;
			}
			else {
				return false;
			}
	}
	

	

	
	

}
