package Main;

public class Suma {

	int nAc=0;
	
	//Este comentario es para hacer un commit en la branch de suma
/*<<<<<<< HEAD
	//Comentario de conflicto de la rama main
=======
	//Comentario para que se produzca conflicto
>>>>>>> suma*/
	//Resolvemos el conflicto
	public void sumaDosNums(int n1, int n2) {
		int nAux;
		nAux = n1 + n2;
		System.out.println("La suma de "+n1+" + "+n2+" es: "+nAux);
	}
	
	public void sumaAcumulada(int n) {
		nAc += n;
		System.out.println("La suma acumulada es: "+nAc);
	}
}
