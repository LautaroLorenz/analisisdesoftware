package Funcion;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Funcion {
	
	public static  int CANTLINEAARCHIVO = 0;
	public String namefuncion;
	public int getCantlineaComentario() {
		return cantlineaComentario;
	}

	private int numLiniaIni;
	//private int numLineaFin;
	//private int cantParam;
	private int cantIf;
	public int getNumLiniaIni() {
		return numLiniaIni;
	}

	public int getLlaveCierreFun() {
		return llaveCierreFun;
	}

	private int cantFor;
	private int cantWhile;
	private int cantlineaComentario;
	private int llaveAperturaFun;
	private int llaveCierreFun;
	private int contadorLlaves;
	private ArrayList<String> codigo;
	
	public Funcion(){
		this.namefuncion = "";
		this.numLiniaIni = 0;
		//this.numLineaFin = 0;
		this.cantIf = 0;
		this.cantFor = 0;
		this.cantWhile = 0;
		this.cantlineaComentario = 0;
		this.llaveAperturaFun =0;
		this.llaveCierreFun = 0;
		this.contadorLlaves = 0;
		this.codigo = new ArrayList<String>();
	}
	
	public static ArrayList<Funcion> getFuncionesArchivo(String archivo) throws FileNotFoundException{
		
		ArrayList<Funcion> listaFun = new ArrayList<Funcion>();
		Funcion fun = null;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(new File(archivo));
		String linea;
		boolean cargandoFuncion = false;
		
		while(sc.hasNextLine()){
			CANTLINEAARCHIVO++;
			linea = sc.nextLine();
			//linea = linea.trim();
			
			if(esFuncion(linea)  ){
				fun = new Funcion();
				//System.out.println(linea);
				fun.codigo.add(linea);
				fun.namefuncion = linea;
				fun.namefuncion=fun.namefuncion.replace("{", "");
				fun.namefuncion=fun.namefuncion.trim();
				cargandoFuncion = true;
				fun.numLiniaIni = CANTLINEAARCHIVO;
				if(linea.contains("{")){
					fun.llaveAperturaFun = CANTLINEAARCHIVO;
				}
					
				
			}
			else{
				if(cargandoFuncion){
					fun.codigo.add(linea);
					if(linea.contains("if("))
						fun.cantIf++;
					if(linea.contains("for("))
						fun.cantFor++;
					if(linea.contains("while("))
						fun.cantWhile++;
					if(linea.contains("/*") || linea.contains("*") || linea.contains("//") )
						fun.cantlineaComentario++;
				}
					
			}
			
			if(linea.contains("{")&&cargandoFuncion){
				if(fun.contadorLlaves==0)
					fun.llaveAperturaFun = CANTLINEAARCHIVO;
				fun.contadorLlaves++;
				
			}
			if(linea.contains("}") && cargandoFuncion){
				fun.contadorLlaves--;
				if(cargandoFuncion && fun.contadorLlaves==0){
					cargandoFuncion = false;
					listaFun.add(fun);
					//System.out.println("se termino de cargar funcion");
					fun.llaveCierreFun = CANTLINEAARCHIVO;
				}
			}
			
				
			
		}
		
		return listaFun;
		
	}
	
	
	
	public static boolean esFuncion(String linea){
		
		if(linea.contains("package") || linea.contains("import") || linea.contains("class") ||
		   linea.contains("interface") || linea.contains("Enum") || linea.contains("/*") || 
		   linea.contains("*/") || linea.startsWith("*", 1) )
			// TODAVIA NO VALIDE EL TEMA DE LAS DELCARACION DE PARAMETROS CON LLAVE
		return false;
		if(linea.contains("(") && linea.contains(")") && 
		  (linea.contains("public")|| linea.contains("private")))
			return true;
		else return false;

		
	}
	
	public int getComplejidadCiclomatica(){
		return this.cantIf+this.cantWhile+this.cantFor+1;
	}
	
	public static void mostrarFuncion(Funcion fun){
		
		System.out.println("=====================================================");
		System.out.println("namefuncion: "+fun.namefuncion);
	    System.out.println("numLiniaIni: "+fun.numLiniaIni);
		//System.out.println("numLineaFin:"+fun.numLineaFin);
		System.out.println("cantIf: "+fun.cantIf);
		System.out.println("cantFor: "+fun.cantFor);
		System.out.println("cantWhile: "+fun.cantWhile);
		System.out.println("cantlineaComentario: "+fun.cantlineaComentario);
		System.out.println("llaveAperturaFun: "+fun.llaveAperturaFun);
		System.out.println("llaveCierreFun: "+fun.llaveCierreFun);
		System.out.println("contadorLlaves:"+fun.contadorLlaves);
		System.out.println("===============codigo==================================");
		for(int  i= 0; i < fun.codigo.size();i++)
			System.out.println(fun.codigo.get(i));

		
	}
	
		public ArrayList<String> getCodigo(){
			return this.codigo;
		 }

		public int getFanIn() {
			
			return 0;
		}

		public int getFanOut() {
			
			return 0;
		}
}
