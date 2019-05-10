package proyecto;

import java.util.ArrayList;

public class Metodo {
	
	private String NombreMetodo;
	private ArrayList<String> codigo;
	
	public Metodo(String metodo, ArrayList<String> codigo) {
		
		this.NombreMetodo = metodo;
		this.codigo = codigo;
	}

	public String getNombreMetodo() {
		return NombreMetodo;
	}

	public ArrayList<String> getCodigo() {
		return codigo;
	}
	
	public void setNombreMetodo(String nombreMetodo) {
		NombreMetodo = nombreMetodo;
	}

	public void setCodigo(ArrayList<String> codigo) {
		this.codigo = codigo;
	}

	
}
