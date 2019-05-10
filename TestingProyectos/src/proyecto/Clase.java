package proyecto;

import java.io.File;
import java.util.ArrayList;

public class Clase {
	
	private File pathClase;
	private String nombreClase;
	private ArrayList<Metodo> metodos; 
	
	public Clase(File pathClase) {
		
		this.pathClase = pathClase;
		this.nombreClase = pathClase.getName().substring(0, pathClase.getName().lastIndexOf(".java"));
		obtenerMetodos(pathClase);
		
	}

	public String getNombreClase() {
		return this.nombreClase;
	}

	public File getPathClase() {
		return pathClase;
	}

	public ArrayList<Metodo> getMetodos() {
		return metodos;
	}
	
	private void obtenerMetodos(File pathClase){
		/* Buscar metodos de cada clase */
		
		
	}
	
	
}
