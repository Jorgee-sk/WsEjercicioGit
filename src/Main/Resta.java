package Main;

public class Resta {

	int nAc = 0;
	
	public void restaDosNums(int n1, int n2) {
		int nAux;
		nAux = n1 - n2;
		System.out.println("La resta de "+n1+" + "+n2+" es: "+nAux);
	}
	
	public void restaAcumulada(int n) {
		nAc -= n;
		System.out.println("La resta acumulada es: "+nAc);
	}
}
