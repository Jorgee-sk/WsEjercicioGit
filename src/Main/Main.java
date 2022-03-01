package Main;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		Suma s = new Suma();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer número: ");
		int n1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int n2 = sc.nextInt();
		s.sumaDosNums(n1,n2);
		
		System.out.println("Introduzca el número para la suma acumulada: ");
		int nAcumulado = sc.nextInt();
		s.sumaAcumulada(nAcumulado);
	}
	
	
}
