package Main;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		Suma s = new Suma();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Introduzca el segundo n�mero: ");
		int n2 = sc.nextInt();
		s.sumaDosNums(n1,n2);
		
		System.out.println("Introduzca el n�mero para la suma acumulada: ");
		int nAcumulado = sc.nextInt();
		s.sumaAcumulada(nAcumulado);
	}
	
	
}
