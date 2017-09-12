package algoritmo.chudnovsky;


/**
 * 
 * @author diego
 *
 */
public class Chudnovsky implements ChudnovskyInterface{
	/**
	 * 
	 */
	private int k;
	
	long num = -262537412640768000L;
	long num1= 545140134L;
	long num2= 13591409L;
/**
 * 
 * @return retorna e valor de k
 */
	
	public int  getK() {
		return k;
	}
	/**
	 * 
	 * @param establce el valor de k
	 */
	public void setK(int k) {
		this.k = k;
	}
	
	/**
	 * 
	 * @param recibe un valor entero 
	 * @return retorna el factorial de ese valor 
	 */
	public int factorial(int k) {
		if (k == 0)
			return 1;
		else
			return k * factorial(k - 1);
	}
	
		/**
		 * 
		 * @param recibe como parametro un numero
		 * @return devuelve el numero de decimales de pi
		 * 
		 */
	public double calcularPi(int k) {
		
		double numerador=(factorial(6*k))*((num1*k)+ num2);
		double denominador=((factorial(3*k))*(Math.pow(factorial(k),3))*Math.pow((num), k));
		return (numerador/denominador);
	
	
	

}}
