package Application;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import busquedaFunciones.Funcion;

public class app {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		ArrayList<Funcion> funciones= Funcion.getFuncionesArvhivo("C:\\Users\\mariano.riquelme\\Downloads\\analisisDeSofware\\sofware\\Projecte\\src\\botiga\\Clientes.java");
		System.out.println("total de funciones: "+funciones.size());
		Funcion.mostrarFuncion(funciones.get(1));
		

	}

}
