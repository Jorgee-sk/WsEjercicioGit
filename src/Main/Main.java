package Main;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
	/*	//ESTE COMENTARIO CREA UN COMMIT EN EL MAIN
<<<<<<< HEAD
		//Comentario desde repositorio 2
=======
		//Comentario desde repo 1
>>>>>>> 6950e1973b71a011d6100b1d0794205df085589d
		*/
		
		//Solucionado merge conflict
		Suma s = new Suma();
		Resta r = new Resta();
		Scanner sc = new Scanner(System.in);
		
		int menu=1;
		
		while(menu!=0) {
			
			System.out.println("�Que operaci�n desea hacer?");
			System.out.println("1-Suma de dos n�meros");
			System.out.println("2-Suma acumulada");
			System.out.println("3-Resta de dos n�meros");
			System.out.println("4-Resta acumulada");
			System.out.println("0-Salir");
			menu = sc.nextInt();
			switch(menu){
			case 1:
				System.out.println("Introduzca el primer n�mero: ");
				int n1 = sc.nextInt();
				System.out.println("Introduzca el segundo n�mero: ");
				int n2 = sc.nextInt();
				s.sumaDosNums(n1,n2);
				break;
			case 2:
				System.out.println("Introduzca el n�mero para la suma acumulada: ");
				int nAcumulado = sc.nextInt();
				s.sumaAcumulada(nAcumulado);
				break;
			case 3:
				System.out.println("Introduzca el primer n�mero: ");
				int nR1 = sc.nextInt();
				System.out.println("Introduzca el segundo n�mero: ");
				int nR2 = sc.nextInt();
				r.restaDosNums(nR1, nR2);
				break;
			case 4:
				System.out.println("Introduzca el n�mero para la resta acumulada: ");
				int nAcumuladoR = sc.nextInt();
				r.restaAcumulada(nAcumuladoR);
				break;
			}
			
		}
		
		
	
		
		
		
		
		
		
	}
	
	
}
