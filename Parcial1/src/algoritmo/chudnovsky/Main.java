package algoritmo.chudnovsky;

public class Main {

	public static void main(String[] args) {
		
		Chudnovsky c1= new Chudnovsky();
		c1.setK(1);
		System.out.print(c1.calcularPi(c1.getK()));
		System.out.println();
		
		
	}
}
