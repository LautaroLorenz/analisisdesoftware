package triangulo;

import java.util.Scanner;
import triangulo.Triangulo;

public class App {

	public static void main(String[] args) {
		
		// 9223372036854775807 es el numero mas grande soportado por el long
		long ladoA,ladoB,ladoC;
		boolean procesar = true;
		
		System.out.println("El programa finaliza al ingresar un caracter incorrecto");
		
		try {
			System.out.println("----------------------------------------------");
			Scanner sc = new Scanner(System.in);
			
			while(procesar) {				
				System.out.print("ingresa un numero entero positivo: ");
				ladoA = sc.nextLong();
				if(ladoA <= 0)
					break;
				System.out.print("ingresa un numero entero positivo: ");
				ladoB = sc.nextLong();
				if(ladoB <= 0)
					break;
				System.out.print("ingresa un numero entero positivo: ");
				ladoC = sc.nextLong();
				if(ladoC <= 0)
					break;
				
				Triangulo t1 = new Triangulo(ladoA,ladoB,ladoC);
				
				if(!t1.esTriangulo())
					System.out.println("No es triangulo");
				else
					System.out.println("el triangulo ingresado es " + t1.getTipoTriangulo());			
			}
			
			sc.close();
		} catch(Exception e) {
			
		} finally{
			System.out.println("FIN DEL PROGRAMA");
		}
	}

}
